First run the following comand to set up nodeapp container:
- first container
```shell
docker run -p 2222:9999 -e APPID=2222 -d nodeapp
```

- second container
```shell
docker run -p 3333:9999 -e APPID=3333 -d nodeapp
```

- third container
```shell
docker run -p 4444:9999 -e APPID=4444 -d nodeapp
```

- fourth container
```shell
docker run -p 5555:9999 -e APPID=5555 -d nodeapp
```

Inside the nginx configuration:

```nginx
http {
  upstream allbackend {
    #ip_hash;
    server 127.0.0.1:2222;
    server 127.0.0.1:3333;
    server 127.0.0.1:4444;
    server 127.0.0.1:5555;
  }

  server {
    listen 80;
    location / {
      proxy_pass http://allbackend/;
    }
  }

}

events {}
```

Then, after create this nginx.conf, we run the following command:
```
nginx -s reload
```
This command will make nginx reload the configuration and catch the changes made.

We can create as many backends we want:
```nginx
http {
  upstream allbackend {
    #ip_hash; # is an option to balancer algorithm
    server 127.0.0.1:2222;
    server 127.0.0.1:3333;
    server 127.0.0.1:4444;
    server 127.0.0.1:5555;
  }

  upstream app1Backend {
    server 127.0.0.1:2222;
    server 127.0.0.1:3333;
  }

  upstream app2Backend {
    server 127.0.0.1:4444;
    server 127.0.0.1:5555;
  }

  server {
    listen 80;
    location / {
      proxy_pass http://allbackend/;
    }
    
    location /app1 {
      proxy_pass http://app1Backend/;
    }
    
    location /app2 {
      proxy_pass http://app2Backend/;
    }
  }

}

events {}
```
So if someone goes to localhost/app1 then the application will flip between 2222 and 3333. And if someone goes to localhost/app2, then will switching bring 4444 and 5555.


We do not expose /admin api, so we can add this configuration on `server {}`.

```nginx
server {
 # previous location configs

 location /admin {
  return 403;
 } 
}
```
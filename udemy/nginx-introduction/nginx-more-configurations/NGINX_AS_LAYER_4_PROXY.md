# Nginx as Layer 4 proxy

To use nginx as layer 4 proxy we can use something similar to proxy on layer 7.

```nginx

http {
  upstream allbackend {
    #ip_hash; # is an option to balancer algorithm
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

Will change `http` to `stream`.

```nginx
stream {
   upstream allbackend {
    #ip_hash; # is an option to balancer algorithm
    server 127.0.0.1:2222;
    server 127.0.0.1:3333;
    server 127.0.0.1:4444;
    server 127.0.0.1:5555;
  }

  server {
    listen 80;
    proxy_pass allbackend;
  }
}
```
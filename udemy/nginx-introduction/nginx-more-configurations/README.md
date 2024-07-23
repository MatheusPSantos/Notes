1 - Install Nginx with homebrew

```brew install nginx```

2 - Nginx as a Web Server

delete configuration file and start from scratch.

```cd /usr/local/etc/nginx/```
```rm nginx.conf```

Then create new nginx.conf file.

First we want to make nginx works as static web server.
```conf
// it is called block directive
http {
  server {
    listen 8080;
  }
}

events {}
```

After, create an simple file html with some message in some folder.
```html
<html>
  <body>
    <h1>Something here</h1>
  </body>
</html>
```

Add the following configuration into `nginx.conf`.
```bash
server {
  listen 8080;
  root /Users/Name/Folder/Where/html-file/is/defined/;
}
```

To tell Nginx to reread the configuration:
```
nginx -s stop
```

Lets create another folder at "/Users/Name/Folder/Where/html-file/is/defined/"

```
mkdir site1

mkdir site2

cd site1/

vim index.html

cp index.html ../site2/
```
Then run 
```
nginx -s reload
```

To configurate special folders like images folders, we need add new configuration:

```conf
server {
  listen 8080;
  root /Users/Name/Folder/Where/html-file/is/defined/;
  location /images {
    root /Users/Name/Folder/Where/html-file/is;
  }
}
```

Then run
```
nginx -s reload
```

If visit "localhost:8080/images" then an Forbiden will be returned. But visiting "localhost:8080/images/name-of-image.png" it will work.

Other configuration:

```conf
server {
  listen 8080;
  root /Users/Name/Folder/Where/html-file/is/defined/;
  location /images {
    root /Users/Name/Folder/Where/html-file/is;
  }

  location ~ .jpg$ {
    return 403;
  }
}
```
If user calls the url but an file with .jpg, it will never download.


Other configuration style to defined the proxy passing.

```conf
// it is called block directive
http {
  server {
    listen 8080;
    root /Users/Name/Folder/Where/html-file/is/defined/;
    location /images {
      root /Users/Name/Folder/Where/html-file/is;
    }

    location ~ .jpg$ {
      return 403;
    }
  }

  server {
    listen 8888;
    location / {
      proxy_pass http://localhost:8080/;
    }

    localtion /img {
      proxy_pass http://localhost:8080/images/;
    }
  }
}

events {}
```

Now if we go to localhost:8888, then the redirection will work and the same site will appear at localhost:8080.

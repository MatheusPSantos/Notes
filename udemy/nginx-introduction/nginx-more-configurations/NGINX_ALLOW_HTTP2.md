# to use HTTP 2

add another configuration:


```nginx
server {

  listen 80;
  listen 443 ssl http2;

  ...
}
```



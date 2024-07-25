# To enable TLS 1.3

Add another configuration at nginx.conf

```nginx
server {

  ...

  ssl_protocols TLSv1.3;

  ...
}
```


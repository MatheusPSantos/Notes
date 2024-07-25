# To enable HTTPS on nginx

I want add two rules 80 and 443 ports.

First is important to have an certificate.

```nginx
server {
  ...

  listen 443 ssl;
  ssl_certificate /etc/certificate/key/folder/certificate.pem;
  ssl_certificate_key /etc/certificate/private/key/privatekey.pem;

  ...
}
```

After do it we need run as sudo

```shell
sudo nginx
sudo nginx -s reload
```
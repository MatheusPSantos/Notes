spin up nginx container ng1 and ng2

ng1
```
docker run --hostname ng1 --name ng1 -p 80:8080 -v /path/to/nginx/conf/nginx.conf:/etc/nginx/nginx.conf -d nginx
```

ng2
```
docker run --hostname ng2 --name ng2 -p 81:8080 -v /path/to/nginx/conf/nginx.conf:/etc/nginx/nginx.conf -d nginx
```


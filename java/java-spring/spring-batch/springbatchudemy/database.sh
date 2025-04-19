#!/bin/zsh

docker run -e MYSQL_ROOT_PASSWORD=parquinho \
-e MYSQL_DATABASE=database-1 \
-e MYSQL_USER=matheus \
-e MYSQL_PASSWORD=parquinho \
-p 3306:3306 \
--name database-1 mysql:latest

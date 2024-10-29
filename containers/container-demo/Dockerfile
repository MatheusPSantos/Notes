FROM ubuntu:latest

USER root

RUN apt-get update
RUN apt-get install -y nginx nodejs

# Remove default nginx configuration file
RUN rm -v /etc/nginx/nginx.conf
# Copy configuration file from current directory
ADD nginx.conf /etc/nginx/

ADD web /usr/share/nginx/html
ADD web /var/www/html

# Append "daemon off;" to the beginning of the configuration
RUN echo "daemon.off;" >> /etc/nginx/nginx.conf

# expose ports
EXPOSE 90

# set default commando to execute
# when create a new container
CMD service nginx start

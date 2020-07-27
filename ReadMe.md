# **_URL Shortening API_**

## **_IMPORTANT_**
To do Docker related tasks for this project I used Docker Toolbox (Cant install docker desktop on windows 10 home). Considering this there may some configurations
present that may not be the same in docker desktop (which you may likely have if your own windows 10 pro or enterprise) for example the uri string to the database is:

spring.datasource.url=jdbc:mysql://192.168.99.100:3306/db_url

The IP 192.168.99.100 is unique to docker toolbox. Using localhost didnt work. If you dont use Docker toolbox to download from docker hub this configuration
may possibly not work. 
	
I cannot test with docker desktop and adding the ip of docker toolbox may be specific for this project, considering this id recommend the easiest solution using docker
toolbox which always comes with default ip 192.168.99.100 for pulling and running the containers.	
	
Possible workaround:
The download links are below in the "downloading" section. One of the images you will download is "short-url-api:v1.0". If this gives trouble with db connection you can 	 try changing to v2.0 which doesnt use the ip address mentioned above instead it uses the name of the container "mysqldb" in the connection string. 
eg spring.datasource.url=jdbc:mysql://mysqldb:3306/db_url

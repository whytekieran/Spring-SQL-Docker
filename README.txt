																						INSTRUCTIONS
																					----------------------
																					
IMPORTANT: 
	To do Docker related tasks for this project I used Docker Toolbox (Cant install docker desktop on windows 10 home). Considering this there are some configurations
	present that may not be the same in docker desktop for example the uri string to the database is:

	spring.datasource.url=jdbc:mysql://192.168.99.100:3306/db_url?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true

	The IP 192.168.99.100 is unique to docker toolbox. Using localhost didnt work. If you dont use Docker toolbox to download from docker hub this configuration
	may possibly not work. I cannot test with docker desktop and adding the ip of docker toolbox may be specific for this for it, considering this id recommend using docker
    toolbox for pulling and running the containers.	
	
	The download links are below in the "downloading" section. One of the images you will download is "short-url-api:v1.0". If this gives trouble with db connection you can try changing 
	to v2.0 which doesnt use the ip address instead uses the name of the container "mysqldb" in the connection string. eg spring.datasource.url=jdbc:mysql://mysqldb:3306/db_url
	
TECH USED:
Spring boot, Spring MVC, Spring JPA, MySQL, Docker, Git

DOWNLOADING:
	The application runs in two separate docker containers that are on my own repository on docker hub, you can download and run them both here: (run in order)
	docker container run -p 3306:3306 --name mysqldb --network url-mysql -e MYSQL_ROOT_PASSWORD=PASSWORD -e MYSQL_DATABASE=db_url -d whytekieran/mysqldb:v1.0
	docker container run -p 8080:8080 --network url-mysql --name short-url-api -d whytekieran/short-url-api:v1.0
	
API and ENDPOINTS:
	You asked for some sort of url shortening API, i created a basic API consisting of two endpoints (uri may vary depending if this is docker toolbox or desktop your using):
	POSTMAN can be used for post request. The GET request can be done with POSTMAN but will visually look better in browser.

	1. Create a new shortened url. Involves a POST request and a JSON body containing the URL the user wants shortened
	METHOD=POST
	URL=http://192.168.99.100:8080/
	BODY={"fullUrl":"https://www.facebook.com/"}
	RESPONSE=<random_string>
	
	2. Forwarding of shortened urls. Involves passing a shorted url into the API which then forwards it to the mapped real url.
	METHOD=GET
	URL=http://192.168.99.100:8080/<random_string>
	RESPONSE=The webpage mapped to that shorted url
	
	IMPORTANT: These uris work for docker toolbox because thats the address it runs on. If using docker desktop localhost maybe better.
	
GITHUB

Links to the codebase on github can be found here:

	
	
## Framework Choices

- Using Springboot to initialize the project to save some time on configurations
- Using Bootstrap CSS as I am most familiar with this css framework
- Using Thymeleaf for templating 
- Using Swagger for API documentation
- Using docker to containerize everything


## Assumptions

- I'm assuming by databse, this is referring to a plain old relational databse 
and not a NoSql database or default H2. I'm going to run a mysql docker container 
to make an easy to deploy docker-compose file. 

- I'm assuming that I don't have to use DAO/DTOs since Spring provides a nice
CrudRepository

- I'm assuming by MP4, you mean file extension
- Finding out the size of the video would require me storing the video and processing it.
Due to time, I'm going to simply restrict the file size to prevent unnecessary storage
and processing of files. 

## Framework Choices

- Using Springboot to initialize the project to save some time on configurations
- Using Bootstrap CSS as I am most familiar with this css framework
- Using Thymeleaf for templating 
- Using JavaCV for keeping track and editing video files because of familiarity
- Using Swagger for API documentation
- Using docker to containerize everything


## Assumptions

- I'm assumming by databse, this is refering to a plain old relational databse 
and not a NoSql database or default H2. I'm going to run a mysql docker container 
to make an easy to deploy docker-compose file. 

- I'm assuming that I don't have to use DAO/DTOs since Spring provides a nice
CrudRepository

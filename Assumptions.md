## Framework Choices

- Using Springboot to initialize the project to save some time on configurations
- Using Bootstrap CSS as I am most familiar with this css framework
- Using Thymeleaf for templating 
- Using Swagger for API documentation
- Using docker to containerize everything
- Since I was already storing the video in an S3 bucket I also used AWS Elastic Transcoder 
to turn the videos into HLS streams


## Assumptions

- I'm assuming by databse, this is referring to a plain old relational databse 
and not a NoSql database or default H2. I'm going to run a mysql docker container 
to make an easy to deploy docker-compose file. 

- I'm assuming that I don't have to use DAO/DTOs since Spring provides a nice
CrudRepository

- I'm assuming by MP4, you mean file extension

- Finding out the lenght of the video would require me storing the video and processing it.
Due to time, I'm going to simply restrict the file size to prevent unnecessary storage
and processing of files. 

- For the S3 storage, I'm backing up the files and still keeping a copy on local directory.

- For providing information about the video, I'm assuming this is the info from the metadata


## Disclosure

- I only allowed myself 2 days to do this due to work and other obligations. 

- Although I'm familiar with cloud servers, I was unfamiliar with AWS S3, hence 
my use of docker volumes 

- If I were to do this again, I would use AWS RDS for database, and launched the 
entire application with Elastic Beanstalk or the EC2 Container Service. As well 
 as, using the AWS Java SKDK to automate the video encoding with their elastic
 service.

- I wanted to use Swagger for my documentation but was unbale to add the dependcies. 

## Tradeoffs

- I opted for many auto configurations as oppose to manually setting xml files


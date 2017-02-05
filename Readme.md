# Clippr 

A [Spring][1] application that allows users to upload files and store them in an S3 bucket. 
These files can be turned into HLS streams using an [AWS Elastic Transcoder pipeline][2] 

**To see a running version visit [http://clippr.pachevjoseph.com](http://clippr.pachevjoseph.com/)**


## Running Application

*Note: Make sure you have a databse running before starting*

To run the application, you must first rename the `src/main/resources/application.properties.generic` to `src/main/resources/application.properties` 
You have to provide database credentials as well as [Iam][3] access key/secret for AWS s3 Bucket. After the properties has been configured,
run `gradle.sh bootrun` on windows or `./gradlew bootrun` on a *nix* system. The application will run on localhost:8080


### run with Docker

If you're into that kind of stuff, you can run this application using [docker][4]  and [docker-compose] [5]. After you've configure your properties, run `./gradlew build`. Next, 
move the build file into the docker folder: 

`cp ./build/libs/clippr-0.1.0.jar src/main/docker/`

there is already a docker-compose file included in this repository. Simply run 

`docker-compose up --build` optional `-d` to run in background

to run the application. If you're using [docker-machine][6], the application is running on that machine's ip:8080, else it's on localhost:8080. 


## Usage

Before a user uploads, they must be authenticated. There is a registration page that handles basic registration using the database to store the
users. After uploading a valid file(.mp4 only and less than 150mb), the file is then uploaded to the specified S3 bucket. The file is also kept in 
a local volume called uploads. 

After the file is uploaded to S3, it then becomes available at https://s3.amazonaws.com/{bucket}/{filename}. 

In the running demo version, all files are uploaded to [https://s3.amazonaws.com/clippr/videos](https://s3.amazonaws.com/clippr/videos). They can then be streamed
via HLS on mobile or web at [https://s3.amazonaws.com/clippr/streams/{filename}.m3u8](https://s3.amazonaws.com/clippr/streams/clippr-streams.m3u8).



[1]: https://spring.io

[2]: https://aws.amazon.com/elastictranscoder/
[3]: https://aws.amazon.com/iam/
[4]: https://www.docker.com/
[5]: https://docs.docker.com/compose/
[6]: https://docs.docker.com/machine/
	# Use an official OpenJDK runtime as a parent image
	FROM openjdk:17-alpine

	# set shell to bash
	RUN apk update && apk add bash

	# Set the working directory to /app
	WORKDIR /app

	# Copy the fat jar into the container at /app
	COPY /target/project-service.jar /app

	# Make port 8082 available to the world outside this container
	EXPOSE 8082

	# Run jar file when the container launches
	CMD ["java", "-jar", "project-service.jar"]

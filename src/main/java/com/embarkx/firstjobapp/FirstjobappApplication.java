package com.embarkx.firstjobapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstjobappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstjobappApplication.class, args);
	}

}
// docker command
// # Create directory
//mkdir -p ".mvn/wrapper"
//
//# Download the jar file
//curl -o ".mvn/wrapper/maven-wrapper.jar" https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar
//
//# Create the properties file
//cat > ".mvn/wrapper/maven-wrapper.properties" << 'EOF'
//distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.5/apache-maven-3.9.5-bin.zip
//wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar
//EOF
//
//# Verify files were created
//ls -la .mvn/wrapper/
//
//# Now try building
//./mvnw clean package -DskipTests

// docker build -t maysara/jobmanagementapp .
// docker run -d -p 8081:8080 maysara/jobmanagementapp


// # Create the network first
//docker network create postgres
//
//# Start the PostgreSQL service
//docker run -d \
//  --name postgres_container \
//  -e POSTGRES_USER=embarkx \
//  -e POSTGRES_PASSWORD=embarkx \
//  -e PGDATA=/data/postgres \
//  -v postgres:/data/postgres \
//  -p 5432:5432 \
//  --network postgres \
//  --restart unless-stopped \
//  postgres
//
//# Start the pgAdmin service
//docker run -d \
//  --name pgadmin_container \
//  -e PGADMIN_DEFAULT_EMAIL=admin@admin.com \
//  -e PGADMIN_DEFAULT_PASSWORD=admin \
//  -e PGADMIN_CONFIG_SERVER_MODE=False \
//  -v pgadmin:/var/lib/pgadmin \
//  -p 5050:80 \
//  --network postgres \
//  --restart unless-stopped \
//  dpage/pgadmin4


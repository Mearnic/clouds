package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UploadCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadCloudsApplication.class, args);
    }

}


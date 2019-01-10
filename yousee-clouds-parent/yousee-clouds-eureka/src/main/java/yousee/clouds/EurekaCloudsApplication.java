package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCloudsApplication.class, args);
    }

}


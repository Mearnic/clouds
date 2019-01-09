package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YouseeCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YouseeCloudsApplication.class, args);
    }

}


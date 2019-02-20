package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCloudsApplication.class, args);
    }

}


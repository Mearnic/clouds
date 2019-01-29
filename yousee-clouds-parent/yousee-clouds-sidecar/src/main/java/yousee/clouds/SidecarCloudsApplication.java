package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class SidecarCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidecarCloudsApplication.class, args);
    }

}


package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinCloudsApplication.class, args);
    }

}


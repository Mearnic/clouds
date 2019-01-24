package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulCloudsApplication.class, args);
    }

}


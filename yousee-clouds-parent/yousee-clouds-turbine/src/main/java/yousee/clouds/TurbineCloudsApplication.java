package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
//import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

//@EnableTurbineStream
@EnableTurbine
@SpringBootApplication
public class TurbineCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineCloudsApplication.class, args);
    }

}


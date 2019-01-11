package yousee.clouds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class DashboardCloudsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardCloudsApplication.class, args);
    }

}


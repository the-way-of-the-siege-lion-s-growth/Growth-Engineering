package daoservcetow.daoservcetow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DaoServceTowApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoServceTowApplication.class, args);
    }
}

package dev.aman.jobportalservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JobPortalServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobPortalServiceDiscoveryApplication.class, args);
    }

}

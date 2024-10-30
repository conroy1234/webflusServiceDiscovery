package or.eureka.discovery.webflusServiceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WebflusServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebflusServiceDiscoveryApplication.class, args);
	}

}

package Zuul.NetflixZuulEurekaDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableSwagger2
public class NetflixZuulEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulEurekaDiscoveryApplication.class, args);
	}

}

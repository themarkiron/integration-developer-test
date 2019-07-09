package br.com.triad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.triad.*")
@EnableAutoConfiguration
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class TriadSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriadSystemApplication.class, args);
	}

}

package com.ifg.ims.zuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.zuul.ZuulFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	
	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate restTemplate() { return new RestTemplate();
	 * }
	 */
    
	/*
	 * @Bean public ZuulFilter zuulFilter() { return new ZuulCustomFilter(); }
	 */
    
	/*
	 * @RestController class ZuulController{
	 * 
	 * @Autowired RestTemplate restTemplate;
	 * 
	 * @GetMapping("/api2") public String zuulProxy() {
	 * System.out.println("ZuulController.zuulProxy() :::: /api2"); return
	 * restTemplate.getForObject("http://eurekaclient/eureka/client", String.class);
	 * }
	 * 
	 * }
	 */


}

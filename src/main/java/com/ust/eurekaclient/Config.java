/**
 * 
 */
package com.ust.eurekaclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



/**
 * @author Administrador
 *
 */

@Configuration
public class Config {

	@LoadBalanced
	@Bean
	public  RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

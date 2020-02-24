package com.adriano.estudos.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Adriano Rocha
 * @since 23/02/2020
 * 
 * Projeto feito com base no blog: https://emmanuelneri.com.br/2018/05/02/criando-proxy-de-apis-com-spring-cloud-zuul-e-eureka/
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerExampleApplication.class, args);
	}

}

package com.example.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2 //Swagger'ı başlatan anatasyon
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

	@Bean //Bean, java classı. genelde konfigürasyon olarak kullanıoyoruz. Uygulama başladığı anda springBoot bean'i gördüğü zaman belleğe erleştiriyor ve docket denilen bir nesne ile controller'larımızın oradaki bütün request handle'ları bulup bizim için onu dökumantasyon haline getiriyor
	public Docket api() { //Docket uygulama içindeki controller üzerinden bütün apileri buluyor ve hepsini tarayıp onları test edebileceğimiz noktaya taşır
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.northwind"))
				.build();
	}
}

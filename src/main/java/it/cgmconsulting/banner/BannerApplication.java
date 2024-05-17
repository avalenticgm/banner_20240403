package it.cgmconsulting.banner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Slf4j
public class BannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BannerApplication.class, args);
	}

	@Bean
	@Profile("dev")
	public String aaa(){
		log.info("LOG: Sto utilizzando il profilo di dev");
		return "Sto utilizzando il profilo di dev";
	}

	@Bean
	@Profile("prod")
	public String bbb(){
		log.info("LOG: Sto utilizzando il profilo di prod");
		return "Sto utilizzando il profilo di prod";
	}

}

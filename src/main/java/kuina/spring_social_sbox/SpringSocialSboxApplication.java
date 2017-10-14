package kuina.spring_social_sbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.social.google.config.boot.GoogleAutoConfiguration;

@SpringBootApplication
@Import(GoogleAutoConfiguration.class)
public class SpringSocialSboxApplication {
	public static void main(final String[] args) {
		SpringApplication.run(SpringSocialSboxApplication.class, args);
	}
}

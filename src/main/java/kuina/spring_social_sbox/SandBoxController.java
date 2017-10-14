package kuina.spring_social_sbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandBoxController {
	@GetMapping("/secured")
	public String secured() {
		return "OK";
	}
}

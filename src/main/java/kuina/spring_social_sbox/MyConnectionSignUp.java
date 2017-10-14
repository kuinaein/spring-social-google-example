package kuina.spring_social_sbox;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyConnectionSignUp implements ConnectionSignUp {
	@Override
	public String execute(Connection<?> connection) {
		final UserProfile prof = connection.fetchUserProfile();
		log.debug("signin: " + prof.getEmail());
		return prof.getEmail();
	}
}

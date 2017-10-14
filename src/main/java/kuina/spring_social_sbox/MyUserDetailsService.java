package kuina.spring_social_sbox;

import java.util.Collections;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialUser;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MyUserDetailsService implements SocialUserDetailsService {
	@Override
	public SocialUserDetails loadUserByUserId(final String userId)
			throws UsernameNotFoundException /* , DataAccessException */ {
		log.debug("access: " + userId);
		// password cannot be null
		return new SocialUser(userId, "", Collections.emptySet());
	}
}

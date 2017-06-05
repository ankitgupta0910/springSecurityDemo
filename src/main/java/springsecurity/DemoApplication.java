package springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import springsecurity.entities.Role;
import springsecurity.entities.User;
import springsecurity.repositories.UserRepository;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {
		if(repo.count() == 0)
			repo.save(new User("user","user", Arrays.asList(new Role("USER"),new Role("ACTUATOR"))));
		builder.userDetailsService(s -> new CustomerDetails(repo.findByUsername(s)));
	}


}

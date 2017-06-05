package springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.entities.User;

/**
 * Created by ankitgupta on 6/4/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}

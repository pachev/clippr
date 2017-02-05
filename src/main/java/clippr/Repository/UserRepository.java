package clippr.Repository;

/**
 * Created by pachevjoseph on 2/4/17.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import clippr.Model.User;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	 User findByEmail(String email);
}

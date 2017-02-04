package clippr.Repository;

/**
 * Created by pachevjoseph on 2/4/17.
 */

import org.springframework.data.repository.CrudRepository;
import clippr.Model.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}

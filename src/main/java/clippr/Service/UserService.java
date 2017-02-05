package clippr.Service;

import clippr.Model.User;

/**
 * Created by pachevjoseph on 2/4/17.
 */
public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}

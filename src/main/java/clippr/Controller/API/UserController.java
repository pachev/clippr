package clippr.Controller.API;

import clippr.Model.User;
import clippr.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pachevjoseph on 2/4/17.
 */
@RestController("ProfileController")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/profiles")
    public @ResponseBody Iterable<User> getAllProfiles() {
        return userRepository.findAll();
    }


}

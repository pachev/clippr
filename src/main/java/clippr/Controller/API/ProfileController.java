package clippr.Controller.API;

import clippr.Model.Profile;
import clippr.Repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pachevjoseph on 2/4/17.
 */
@RestController("ProfileController")
@RequestMapping("/api")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @RequestMapping("/profiles")
    public @ResponseBody Iterable<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }


}

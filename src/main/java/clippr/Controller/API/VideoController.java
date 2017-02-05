package clippr.Controller.API;

import clippr.Model.Video;
import clippr.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pachevjoseph on 2/4/17.
 */
@RestController("VideoController")
@RequestMapping("/api")
public class VideoController {

    @Autowired
    public VideoRepository videoRepository;

    @RequestMapping("/videos")

    public @ResponseBody
    Iterable<Video> getAllVideos() {
        return videoRepository.findAll();
    }
}

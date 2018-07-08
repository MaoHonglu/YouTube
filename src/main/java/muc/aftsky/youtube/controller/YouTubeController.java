package muc.aftsky.youtube.controller;

import muc.aftsky.youtube.service.YouTubeService;
import muc.aftsky.youtube.util.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
@RestController(value="/youtube")
public class YouTubeController {

    @Autowired
    YouTubeService youTubeService;

    @RequestMapping(value = "/videocntamount",method = RequestMethod.GET)
    public ResponseWrapper videocntamount(){
        return new ResponseWrapper().addObject("videoCntAmountList",youTubeService.videocntamount());
    }

    @RequestMapping(value = "/usvideosum",method = RequestMethod.GET)
    public ResponseWrapper usvideosum(){
        return new ResponseWrapper().addObject("usVideoSumList",youTubeService.usvideosum());
    }

    @RequestMapping(value = "/tag",method = RequestMethod.GET)
    public ResponseWrapper tag(){
        return new ResponseWrapper().addObject("ustagList",youTubeService.tag());
    }

    @RequestMapping(value = "/publishvideoweek",method = RequestMethod.GET)
    public ResponseWrapper publishvideoweek(){
        return new ResponseWrapper().addObject("publishVideoWeekList",youTubeService.publishvideoweek());
    }

}
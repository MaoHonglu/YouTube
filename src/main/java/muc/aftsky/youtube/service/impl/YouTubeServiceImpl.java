package muc.aftsky.youtube.service.impl;

import muc.aftsky.youtube.dao.YouTubeDao;
import muc.aftsky.youtube.model.PublishVideoWeek;
import muc.aftsky.youtube.model.USTAG;
import muc.aftsky.youtube.model.USVideoSum;
import muc.aftsky.youtube.model.VideoCntAmount;
import muc.aftsky.youtube.service.YouTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
@Service("youTubeService")
public class YouTubeServiceImpl implements YouTubeService {

    @Autowired
    YouTubeDao youTubeDao;
    @Override
    public List<VideoCntAmount> videocntamount() {
        return youTubeDao.videocntamount();
    }

    @Override
    public List<USVideoSum> usvideosum() {
        return youTubeDao.usvideosum();
    }

    @Override
    public List<USTAG> tag() {
        return youTubeDao.tag();
    }

    @Override
    public List<PublishVideoWeek> publishvideoweek() {
        return youTubeDao.publishvideoweek();
    }
}
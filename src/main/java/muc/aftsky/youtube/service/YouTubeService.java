package muc.aftsky.youtube.service;

import muc.aftsky.youtube.model.PublishVideoWeek;
import muc.aftsky.youtube.model.USTAG;
import muc.aftsky.youtube.model.USVideoSum;
import muc.aftsky.youtube.model.VideoCntAmount;
import muc.aftsky.youtube.util.ResponseWrapper;

import java.util.List;

/**
 * created by MaoHonglu on 2018/7/7.
 */
public interface YouTubeService {

    List<VideoCntAmount> videocntamount();

    List<USVideoSum> usvideosum();

    List<USTAG> tag();

    List<PublishVideoWeek> publishvideoweek();
}

package muc.aftsky.youtube.dao;

import muc.aftsky.youtube.model.PublishVideoWeek;
import muc.aftsky.youtube.model.USTAG;
import muc.aftsky.youtube.model.USVideoSum;
import muc.aftsky.youtube.model.VideoCntAmount;

import java.util.List;

/**
 * created by MaoHonglu on 2018/7/7.
 */
public interface YouTubeDao {

    List<VideoCntAmount> videocntamount();

    List<USVideoSum> usvideosum();

    List<USTAG> tag();

    List<PublishVideoWeek> publishvideoweek();
}

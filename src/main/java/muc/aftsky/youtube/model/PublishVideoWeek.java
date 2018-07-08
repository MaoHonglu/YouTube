package muc.aftsky.youtube.model;

import java.io.Serializable;

/**
 * @author MaoHonglu
 * @create 2018/7/8
 * @since 1.0.0
 */
public class PublishVideoWeek implements Serializable {

    private static final long serialVersionUID = 1L;

    private String weekday;

    private int video_amount;

    public PublishVideoWeek() {
    }

    public PublishVideoWeek(String weekday, int video_amount) {
        this.weekday = weekday;
        this.video_amount = video_amount;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public int getVideo_amount() {
        return video_amount;
    }

    public void setVideo_amount(int video_amount) {
        this.video_amount = video_amount;
    }
}
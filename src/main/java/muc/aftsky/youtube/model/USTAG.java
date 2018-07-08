package muc.aftsky.youtube.model;

import java.io.Serializable;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
public class USTAG implements Serializable{

    private static final long serialVersionUID = 1L;

    private String tags;

    private int tags_amount;

    public USTAG() {
    }

    public USTAG(String tags, int tags_amount) {
        this.tags = tags;
        this.tags_amount = tags_amount;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getTags_amount() {
        return tags_amount;
    }

    public void setTags_amount(int tags_amount) {
        this.tags_amount = tags_amount;
    }
}
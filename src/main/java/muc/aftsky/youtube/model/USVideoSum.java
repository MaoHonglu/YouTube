package muc.aftsky.youtube.model;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
public class USVideoSum implements Serializable {

    private static final long serialVersionUID = 1L;

    private String category;

    private long likes_sum;

    private long dislikes_sum;

    private long views_sum;

    private long comment_count_sum;

    public USVideoSum() {
    }

    public USVideoSum(String category, long likes_sum, long dislikes_sum, long views_sum, long comment_count_sum) {
        this.category = category;
        this.likes_sum = likes_sum;
        this.dislikes_sum = dislikes_sum;
        this.views_sum = views_sum;
        this.comment_count_sum = comment_count_sum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getLikes_sum() {
        return likes_sum;
    }

    public void setLikes_sum(long likes_sum) {
        this.likes_sum = likes_sum;
    }

    public long getDislikes_sum() {
        return dislikes_sum;
    }

    public void setDislikes_sum(long dislikes_sum) {
        this.dislikes_sum = dislikes_sum;
    }

    public long getViews_sum() {
        return views_sum;
    }

    public void setViews_sum(long views_sum) {
        this.views_sum = views_sum;
    }

    public long getComment_count_sum() {
        return comment_count_sum;
    }

    public void setComment_count_sum(long comment_count_sum) {
        this.comment_count_sum = comment_count_sum;
    }
}
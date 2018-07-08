package muc.aftsky.youtube.model;

import java.io.Serializable;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
public class VideoCategory implements Serializable{

    private static final long serialVersionUID = 1L;

    private int category_id;

    private String title;

    public VideoCategory() {
    }

    public VideoCategory(int category_id, String title) {
        this.category_id = category_id;
        this.title = title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
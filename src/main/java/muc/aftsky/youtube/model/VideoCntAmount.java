package muc.aftsky.youtube.model;

import java.io.Serializable;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
public class VideoCntAmount implements Serializable{

    private static final long serialVersionUID = 1L;

    private int cnt;

    private int cnt_amount;

    public VideoCntAmount() {
    }

    public VideoCntAmount(int cnt, int cnt_amount) {
        this.cnt = cnt;
        this.cnt_amount = cnt_amount;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getCnt_amount() {
        return cnt_amount;
    }

    public void setCnt_amount(int cnt_amount) {
        this.cnt_amount = cnt_amount;
    }
}
package muc.aftsky.youtube.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MaoHonglu
 * @create 2018/7/3
 * @since 1.0.0
 */
//返回信息封装类
public class ResponseWrapper  {

    private final boolean success;

    private final String errMessage;

    private final Map<String, Object> data = new HashMap<>();

    public ResponseWrapper() {
        this.success = true;
        this.errMessage = null;
    }

    public ResponseWrapper(String errMessage) {
        this.success = false;
        this.errMessage = errMessage;
    }

    public <T> ResponseWrapper addObject(String key,T value) {
        if (key != null) {
            data.put(key, value);
        }
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
package muc.aftsky.youtube.dao.impl;

import muc.aftsky.youtube.dao.YouTubeDao;
import muc.aftsky.youtube.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MaoHonglu
 * @create 2018/7/7
 * @since 1.0.0
 */
@Repository("youTubeDao")
public class YouTubeDaoImpl implements YouTubeDao{

    //sql查询语句
    private final String QUERY_VIDEOCNTAMOUNT = "SELECT cnt,cnt_amount FROM video_cnt_amount ORDER BY cnt DESC";
    private final String QUERY_VIDEOCATEGORY = "SELECT category_id,title FROM video_category";
    private final String QUERY_USVIDEOSUM = "SELECT * FROM us_video_sum";
    private final String QUERY_USTAG1 ="SELECT tags,tags_amount FROM us_tag_1 ORDER BY tags_amount DESC LIMIT 10";
    private final String QUERY_PUBLISHVIDEOWEEK = "SELECT weekday,video_amount FROM publish_video_week";

    //视频分类ID和名称Map
    private static Map<Integer,String> videoCategoryMap= new HashMap<Integer, String>();

    //存放星期的数组
    private static String [] weekday = {"周日","周一","周二","周三","周四","周五","周六"};

    @Autowired
    private JdbcOperations jdbcOperations;

    //初始化videoCategory数组
    private void initVideoCategory(){
        List<VideoCategory> videoCategoryList;
        videoCategoryList = jdbcOperations.query(QUERY_VIDEOCATEGORY,(rs,rownum) -> {
            return new VideoCategory(
                    rs.getInt("category_id"),
                    rs.getString("title")
            );
        });
        //List -> Map
        for(int i=0;i<videoCategoryList.size();i++){
            videoCategoryMap.put(videoCategoryList.get(i).getCategory_id(),videoCategoryList.get(i).getTitle());
        }
    }

    @Override
    public List<VideoCntAmount> videocntamount(){
        List<VideoCntAmount> videoCntAmountList;
        //使用Lambda来表达RowMapper的实现
        videoCntAmountList = jdbcOperations.query(QUERY_VIDEOCNTAMOUNT,(rs,rownum) -> {
           return new VideoCntAmount(
                   rs.getInt("cnt"),
                   rs.getInt("cnt_amount")
           );
        });
        return videoCntAmountList;
    }

    @Override
    public List<USVideoSum> usvideosum(){
        //1.这一步填充videoCategoryMap,还需要优化，执行一次就好，不用重复执行
        this.initVideoCategory();
        List<USVideoSum> usVideoSumList;
        usVideoSumList = jdbcOperations.query(QUERY_USVIDEOSUM,(rs,rownum) ->{
            return new USVideoSum(
                    videoCategoryMap.get(rs.getInt("category_id")),
                    rs.getLong("likes_sum"),
                    rs.getLong("dislikes_sum"),
                    rs.getLong("views_sum"),
                    rs.getLong("comment_count_sum")
            );
        });
        return usVideoSumList;
    }

    @Override
    public List<USTAG> tag(){
        List<USTAG> ustagList;
        ustagList = jdbcOperations.query(QUERY_USTAG1,(rs,rownum) -> {
           return new USTAG(
                rs.getString("tags"),
                rs.getInt("tags_amount")
           );
        });
        return ustagList;
    }

    @Override
    public List<PublishVideoWeek> publishvideoweek() {
        List<PublishVideoWeek> publishVideoWeekList;
        publishVideoWeekList = jdbcOperations.query(QUERY_PUBLISHVIDEOWEEK,(rs,rownum)->{
            return new PublishVideoWeek(
                    weekday[rs.getInt("weekday")],
                    rs.getInt("video_amount")
            );
        });
        return publishVideoWeekList;
    }
}
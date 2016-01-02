package org.superzhao.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-01-02.
 */

//管理活动的类
public class ActivityCollector {
    public static List<Activity> activityList = new ArrayList();
    //向list中添加
    public static void addActivity(Activity activity){
        activityList.add(activity);
    }
    //从list中删除
    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }
    //关闭所有活动
    public static void finishAll(){
        for(Activity activity:activityList){
            activity.finish();
        }
    }

}

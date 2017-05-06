package com.imooc.muju_md.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by len_titude on 2017/5/4.
 */

public class News {
    @SerializedName("ctime")
    public String time;

    public String title;

    public String description;

    public String picUrl;

    public String url;

}

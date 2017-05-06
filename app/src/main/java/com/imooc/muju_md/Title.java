package com.imooc.muju_md;

/**
 * Created by len_titude on 2017/5/4.
 */

public class Title {
    private String title;
    private String descr;
    private String imageUrl;
    private String uri;

    public Title(String title,String descr, String imageUrl, String uri){
        this.title = title;
        this.imageUrl = imageUrl;
        this.descr = descr;
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescr() {
        return descr;
    }

    public String getUri() {
        return uri;
    }
}

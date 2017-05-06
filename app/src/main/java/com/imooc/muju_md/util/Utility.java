package com.imooc.muju_md.util;

import com.google.gson.Gson;
import com.imooc.muju_md.gson.NewsList;
import com.imooc.muju_md.util.Utility;

/**
 * Created by len_titude on 2017/5/4.
 */

public class Utility {
    public static NewsList parseJsonWithGson(final String requestText){
        Gson gson = new Gson();
        return gson.fromJson(requestText, NewsList.class);
    }

}

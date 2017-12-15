package com.coolweather.android.util;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 处理省市县JSON数据的工具类
 * Created by Administrator on 2017/12/15.
 */

public class Utility {

    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++) {
                    JSONObject pro
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}

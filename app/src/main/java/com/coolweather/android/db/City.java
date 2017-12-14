package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 对应表city的实体类
 * Created by Administrator on 2017/12/14.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
//    省ID，建立与其他表的一对多关系
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}


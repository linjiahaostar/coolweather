package com.coolwearther.android.db;

import org.litepal.crud.DataSupport;

/**
 * @ProjectName: CoolGITWearther
 * @Package: com.coolwearther.android.db
 * @ClassName: city
 * @Description: java类作用描述
 * @Author: linjiahao
 * @CreateDate: 2020/9/30 2:12 PM
 */
public class City extends DataSupport {
    int id;
    String cityName;
    int cityCode;
    int provinceId;

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

package com.coolwearther.android.db;

import org.litepal.crud.DataSupport;

/**
 * @ProjectName: CoolGITWearther
 * @Package: com.coolwearther.android.db
 * @ClassName: Country
 * @Description: java类作用描述
 * @Author: linjiahao
 * @CreateDate: 2020/9/30 2:35 PM
 */
public class Country extends DataSupport {

    int id;
    String countryName;
    String weatherId;
    int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

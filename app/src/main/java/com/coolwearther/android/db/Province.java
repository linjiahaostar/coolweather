package com.coolwearther.android.db;

import org.litepal.crud.DataSupport;

/**
 * @ProjectName: CoolGITWearther
 * @Package: com.coolwearther.android.db
 * @ClassName: Province
 * @Description: java类作用描述
 * @Author: linjiahao
 * @CreateDate: 2020/9/30 1:42 PM
 */
public class Province extends DataSupport {
    private   int  id ;
    private  String provinceName;
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

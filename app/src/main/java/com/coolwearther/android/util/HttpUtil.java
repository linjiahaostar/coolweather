package com.coolwearther.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @ProjectName: CoolGITWearther
 * @Package: com.coolwearther.android.util
 * @ClassName: HttpUtil
 * @Description: java类作用描述
 * @Author: linjiahao
 * @CreateDate: 2020/10/10 1:49 PM
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

package com.example.cheng.android;

import android.content.Context;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;

/**
 * Created by cheng on 2018/5/15.
 */

public   class HttpUtils {
    public static void post(Context context, String url, HashMap<String, String> data, StringCallback mStringCallback) {
        BaseRequest baseRequest = OkGo.post(url).tag(context);
        if (data != null) {
            Iterator iter = data.keySet().iterator();
            while (iter.hasNext()) {
                String  key = (String) iter.next();
                String val = data.get(key);
                baseRequest.params(key,val);
            }
        }
        baseRequest.execute(mStringCallback);


    }
}

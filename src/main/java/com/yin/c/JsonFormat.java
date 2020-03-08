package com.yin.c;

import com.alibaba.fastjson.JSON;

public class JsonFormat {

    public <T> String doFormat(T obj) {
        return "JsonFormat:" + JSON.toJSONString(obj);
    }
}

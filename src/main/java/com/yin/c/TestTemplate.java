package com.yin.c;

public class TestTemplate {

    private JsonFormat JsonFormat;

    public TestTemplate(JsonFormat JsonFormat) {
        this.JsonFormat = JsonFormat;
    }

    public <T> String doFormat(T obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(JsonFormat.doFormat(obj));
        return sb.toString();
    }
}

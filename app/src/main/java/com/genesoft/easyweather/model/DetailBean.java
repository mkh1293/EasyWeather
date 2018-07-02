package com.genesoft.easyweather.model;


public class DetailBean {

    private String Param;

    private String Value;

    public DetailBean(String param, String value) {
        Param = param;
        Value = value;
    }

    public String getParam() {
        return Param;
    }

    public void setParam(String param) {
        Param = param;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}

package com.biz.demo.controller.domain;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

public class SqlInfo {


    /**
     * 数据库路径
     */
    private String SqlUrl;


    /**
     * 数据库类型
     */
    private Long dataBaseType;


    /**
     * 表名
     */
    private String table;


    public String getSqlUrl() {
        return SqlUrl;
    }

    public void setSqlUrl(String sqlUrl) {
        SqlUrl = sqlUrl;
    }

    public Long getDataBaseType() {
        return dataBaseType;
    }

    public void setDataBaseType(Long dataBaseType) {
        this.dataBaseType = dataBaseType;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "SqlInfo{" +
                "SqlUrl='" + SqlUrl + '\'' +
                ", dataBaseType=" + dataBaseType +
                ", table='" + table + '\'' +
                '}';
    }
}

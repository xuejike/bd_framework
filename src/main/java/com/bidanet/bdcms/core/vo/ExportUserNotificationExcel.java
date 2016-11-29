package com.bidanet.bdcms.core.vo;

import org.jeecgframework.poi.excel.annotation.Excel;

/**
 * Created by asus on 2016/11/3.
 */
public class ExportUserNotificationExcel {
    @Excel(name="用户名")
    private String  name;//用户名
    @Excel(name="标题")
    private String title;//标题
    @Excel(name="内容")
    private String content;//内容

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

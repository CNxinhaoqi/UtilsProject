package com.github.arnold.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class BpmAccount extends BaseRowModel {

    @ExcelProperty(value = "用户编号")
    private String userName;

    @ExcelProperty(value = "用户姓名")
    private String userCName;

    @ExcelProperty(value = "区域中心")
    private String areaName;

    @ExcelProperty(value = "岗位")
    private String roleNames;

    @ExcelProperty(value = "账户状态")
    private String accountStatus;

    @ExcelProperty(value = "启用时间")
    private String createTime;

    @ExcelProperty(value = "禁用时间")
    private String endTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCName() {
        return userCName;
    }

    public void setUserCName(String userCName) {
        this.userCName = userCName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

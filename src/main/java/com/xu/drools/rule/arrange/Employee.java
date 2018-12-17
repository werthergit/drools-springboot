package com.xu.drools.rule.arrange;

import java.util.List;

public class Employee {

    private String id;

    private String name;

    /**
     * 序号
     */
    private int order;
    /**
     * 组
     */
    private String group;

    /**
     *  角色：1普通 2专家
     */
    private String role;


    private String arrangeJson;

    /**
     *
     *  班次集合
     */
    private List<ArrangeInfo> arrangeInfoList;




    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ArrangeInfo> getArrangeInfoList() {
        return arrangeInfoList;
    }

    public void setArrangeInfoList(List<ArrangeInfo> arrangeInfoList) {
        this.arrangeInfoList = arrangeInfoList;
    }

    public String getArrangeJson() {
        return arrangeJson;
    }

    public void setArrangeJson(String arrangeJson) {
        this.arrangeJson = arrangeJson;
    }
}

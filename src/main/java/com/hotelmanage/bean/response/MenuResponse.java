package com.hotelmanage.bean.response;

import java.util.List;

/**
 * @Auther: chenpan
 * @Date: 2018/8/19 12:54
 * @Description:
 * id ,parentid pareMenuId,levelnum, menuname menuName,menuicon menuIcon,menuurl menuUrl
 */
public class MenuResponse {
    private String menuId;
    private String pareMenuId;
    private String levelnum;
    private String menuName;
    private String menuIcon;
    private String menuUrl;
    private String menuSort;
    private int  status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuid) {
        this.menuId = menuid;
    }

    public String getPareMenuId() {
        return pareMenuId;
    }

    public void setPareMenuId(String pareMenuId) {
        this.pareMenuId = pareMenuId;
    }

    public String getLevelnum() {
        return levelnum;
    }

    public void setLevelnum(String levelnum) {
        this.levelnum = levelnum;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}

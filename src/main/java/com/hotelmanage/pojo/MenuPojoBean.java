package com.hotelmanage.pojo;

public class MenuPojoBean {
    private String id;
    private Integer menuid;
    private Integer parentid;

    private Integer levelnum;

    private String menuname;

    private String menuurl;

    private String menuicon;
    private Integer menusort;

    private Integer state;

    public String getId() {
        return id;
    }

    public Integer getMenusort() {
        return menusort;
    }

    public void setMenusort(Integer menusort) {
        this.menusort = menusort;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevelnum() {
        return levelnum;
    }

    public void setLevelnum(Integer levelnum) {
        this.levelnum = levelnum;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon == null ? null : menuicon.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
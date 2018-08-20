package com.hotelmanage.dao.mapper;

import com.hotelmanage.bean.response.MenuResponse;
import com.hotelmanage.pojo.MenuPojoBean;

import java.util.List;

public interface MenuPojoBeanMapper {

    int insertSelective(MenuPojoBean record);


    List<MenuResponse> getMenuList(String username);

    List<MenuResponse> getAllMenuList(String username);
}
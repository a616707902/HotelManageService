package com.hotelmanage.service.faces;

import com.hotelmanage.common.Response;
import com.hotelmanage.pojo.MenuPojoBean;

/**
 * @Auther: chenpan
 * @Date: 2018/8/19 19:04
 * @Description:
 */
public interface MenuService {
    Response getAllMenuList(String username);

    Response addMenu(MenuPojoBean menuPojoBean);

    Response getOperationMenuList(String username);
}

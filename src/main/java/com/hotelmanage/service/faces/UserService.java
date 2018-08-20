package com.hotelmanage.service.faces;

import com.hotelmanage.common.Response;

/**
 * @Auther: chenpan
 * @Date: 2018/8/18 12:31
 * @Description:
 */
public interface UserService {
    Response login(String username, String password) throws Exception;

    Response getMenuList(String username);
}

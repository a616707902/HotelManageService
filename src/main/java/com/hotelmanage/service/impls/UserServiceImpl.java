package com.hotelmanage.service.impls;

import com.hotelmanage.bean.response.MenuResponse;
import com.hotelmanage.bean.response.UserLoginResponse;
import com.hotelmanage.common.Response;
import com.hotelmanage.dao.mapper.MenuPojoBeanMapper;
import com.hotelmanage.dao.mapper.UserPojoBeanMapper;
import com.hotelmanage.pojo.UserPojoBean;
import com.hotelmanage.service.faces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: chenpan
 * @Date: 2018/8/18 12:31
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserPojoBeanMapper userPojoBeanMapper;
    @Autowired
    MenuPojoBeanMapper menuPojoBeanMapper;

    @Override
    public Response login(String username, String password) throws Exception {
        Response response = null;
        UserLoginResponse userPojoBean = userPojoBeanMapper.selectUserByUserName(username);
        if (userPojoBean != null) {
            if (password.equals(userPojoBean.getPassword())) {
                response = new Response().success(userPojoBean);
            } else
                response = new Response().failure("密码不正确");
        } else {
            response = new Response().failure("用户名不正确");
        }
        return response;
    }

    @Override
    public Response getMenuList(String username) {
        Response response = null;
        List<MenuResponse> list = menuPojoBeanMapper.getMenuList(username);
        if (list != null && list.size() > 0) {
            response = new Response().success(list);
        } else {
            response = new Response().failure("未能查询到菜单信息");
        }
        return response;
    }
}

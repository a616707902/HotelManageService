package com.hotelmanage.service.impls;

import com.hotelmanage.bean.response.MenuResponse;
import com.hotelmanage.common.Response;
import com.hotelmanage.dao.mapper.MenuPojoBeanMapper;
import com.hotelmanage.pojo.MenuPojoBean;
import com.hotelmanage.service.faces.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @Auther: chenpan
 * @Date: 2018/8/19 19:04
 * @Description:
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuPojoBeanMapper menuPojoBeanMapper;

    @Override
    public Response getAllMenuList(String username) {
        Response response = null;
        List<MenuResponse> list = menuPojoBeanMapper.getAllMenuList(username);
        if (list!=null&&list.size()>0){
            response=new Response().success(list);
        }else{
            response=new Response().failure("未能查询到数据");
        }
        return response;
    }

    @Override
    public Response addMenu(MenuPojoBean menuPojoBean) {
        menuPojoBean.setId(UUID.randomUUID().toString());
        int insert=menuPojoBeanMapper.insertSelective(menuPojoBean);
        if (insert>0){
            return new Response().success();
        }else{
            return new Response().failure("写入失败");
        }
    }

    @Override
    public Response getOperationMenuList(String username) {
        Response response = null;
        List<MenuResponse> list = menuPojoBeanMapper.getOperationMenuList(username);
        if (list!=null&&list.size()>0){
            response=new Response().success(list);
        }else{
            response=new Response().failure("未能查询到数据");
        }
        return response;
    }
}

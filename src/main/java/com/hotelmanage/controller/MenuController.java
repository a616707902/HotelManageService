package com.hotelmanage.controller;

import com.hotelmanage.common.Response;
import com.hotelmanage.pojo.MenuPojoBean;
import com.hotelmanage.service.faces.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther: chenpan
 * @Date: 2018/8/19 19:01
 * @Description:
 */
@RestController
@RequestMapping(value = "/MenuOperation")
@Api(value = "/Menu", description = "菜单操作口")
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping(value = "/getAllMenuList", produces = "application/json", method = RequestMethod.GET)
    @ApiOperation(value = "获取全部菜单", response = Response.class)
    public Response getAllMenuList(String username, HttpServletRequest request, HttpSession session) throws Exception {
        if ("admin".equals(username)) {
            return new Response().failure("没有相应的权限");
        }
        return menuService.getAllMenuList(username);
    }
    @RequestMapping(value = "/addMenu", produces = "application/json", method = RequestMethod.POST)
    @ApiOperation(value = "增加菜单", response = Response.class)
    public Response addMenu(@RequestBody  MenuPojoBean MenuPojoBean, HttpServletRequest request, HttpSession session) throws Exception {
//        if ("admin".equals(username)) {
//            return new Response().failure("没有相应的权限");
//        }
        return menuService.addMenu(MenuPojoBean);
    }

    @RequestMapping(value = "/getOperationMenuList", produces = "application/json", method = RequestMethod.GET)
    @ApiOperation(value = "获取可用可操作，并且能选择的全部菜单", response = Response.class)
    public Response getOperationMenuList(String username, HttpServletRequest request, HttpSession session) throws Exception {
        return menuService.getOperationMenuList(username);
    }
}

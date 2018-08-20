package com.hotelmanage.controller;

import com.hotelmanage.bean.request.UserLoginBean;
import com.hotelmanage.common.Response;
import com.hotelmanage.service.faces.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Auther: chenpan
 * @Date: 2018/8/17 20:32
 * @Description:用户操作类
 */
@RestController
@RequestMapping(value = "/UserOperation")
@Api(value = "/User", description = "用户操作接口,包含登录，获得权限等操作")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login", produces = "application/json", method = RequestMethod.POST)
    @ApiOperation(value = "用户登录接口调用", response = Response.class)
    public Response login( @RequestBody @Valid UserLoginBean userLoginBean, BindingResult bindingResult, HttpServletRequest request, HttpSession session) throws Exception {
        if (bindingResult.hasErrors()) {
            return new Response().failure(bindingResult.getFieldError().getDefaultMessage());
        }
        String username=userLoginBean.getUsername();
        String password=userLoginBean.getPassword();
      return   userService.login(username,password);
    }

    @RequestMapping(value = "/getMenuList", produces = "application/json", method = RequestMethod.GET)
    @ApiOperation(value = "用户获取对应权限的菜单", response = Response.class)
    public Response getMenuList(String username, HttpServletRequest request, HttpSession session) throws Exception {
        return   userService.getMenuList(username);
    }
}

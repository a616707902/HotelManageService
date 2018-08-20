package com.hotelmanage.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Auther: chenpan
 * @Date: 2018/8/18 09:13
 * @Description:
 */
@ApiModel(description = "用户登录字段")
public class UserLoginBean {
    @NotNull(message = "用户名为空")
    @Size(min = 3,max = 18,message = "输入的用户名长度应为6~18位字符")
    @ApiModelProperty(value="用户名",name="username",example="xingguo",required = true)
    private String username;
    @Size(min = 6,max = 18,message = "输入的密码长度应为6~18位字符")
    @NotNull(message = "密码不能为空")
    @ApiModelProperty(value="密码",name="password",example="xingguo",required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

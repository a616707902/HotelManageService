package com.hotelmanage.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Auther: chenpan
 * @Date: 2018/8/17 20:32
 * @Description: 用于返回json通用对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel
public class Response {

    private static final String OK = "ok";
    private static final String ERROR = "error";
    @ApiModelProperty(value = "响应头", example = "操作成功")
    private Meta meta;     // 元数据
    @ApiModelProperty(value = "响应内容", example = "")
    private Object data;   // 响应内容

    public Response success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    public Response success(Object data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public Response failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public Response failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    /**
     * 请求元数据
     */
    public class Meta {
        @ApiModelProperty(value = "响应状态", example = "")
        private boolean success;
        @ApiModelProperty(value = "响应信息", example = "")
        private String message;

        public Meta(boolean success) {
            this.success = success;
        }

        public Meta(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }

}

package com.rao.www.diga.response;

/**
 * @author Rao QingLong
 */

public enum ResultEnum implements IResult {

    /**
     * 接口调用成功
     */
    SUCCESS(2001, "接口调用成功"),
    /**
     * 参数校验失败
     */
    VALIDATE_FAILED(2002, "参数校验失败"),
    /**
     * 接口调用失败
     */
    COMMON_FAILED(2003, "接口调用失败"),
    /**
     * 没有权限访问资源
     */
    FORBIDDEN(2004, "没有权限访问资源");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 状态信息
     */
    private final String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}

package com.rao.www.diga.response;

/**
 * @author Rao QingLong
 */
public interface IResult {

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    Integer getCode();

    /**
     * 获取状态信息
     *
     * @return 状态信息
     */
    String getMessage();

}

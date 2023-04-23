package com.example.springboottemplate.common;

import java.io.Serializable;

import lombok.Data;

@Data
public class ResultWrapper<T> implements Serializable {
	
	 /** 状态码 */
    private Integer code;

    /** 返回数据 */
    private T data;

    /** 提示信息 */
    private String msg;
    
    public static <T> ResultWrapper<T> error(Integer code, String message) {
    	ResultWrapper<T> result = new ResultWrapper<>();
    	result.code = code;
    	result.msg = message;
    	return result;
    }
    
    public static <T> ResultWrapper<T> error(ResultCode code) {
    	return error(code.getCode(), code.getMsg());
    }
    
    public static <T> ResultWrapper<T> error(ResultWrapper<?> result) {
    	return error(result.getCode(), result.getMsg());
    }
    
    public static <T> ResultWrapper<T> success(T data) {
    	ResultWrapper<T> result = new ResultWrapper<>();
    	result.code = HttpStatus.SUCCESS.getCode();
    	result.msg = HttpStatus.SUCCESS.getMsg();
    	result.data = data;
    	return result;
    }
	
}

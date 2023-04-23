package com.example.springboottemplate.common;

import lombok.Data;

@Data
public class ResultCode {

	/**
	 * 返回码
	 */
	private Integer code;
	
	/**
	 * 返回提示
	 */
	private String msg;
	
	public ResultCode(Integer code, String message) {
		this.code = code;
		this.msg = message;
	}
	
}

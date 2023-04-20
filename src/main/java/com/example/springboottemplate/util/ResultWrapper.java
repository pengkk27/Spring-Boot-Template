package com.example.springboottemplate.util;

import java.util.HashMap;

public class ResultWrapper extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;
	
	 /** 状态码 */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";
    
    public ResultWrapper() {}

    public ResultWrapper(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    public ResultWrapper(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (data != null) {
            super.put(DATA_TAG, data);
        }
    }

    public static ResultWrapper success() {
        return ResultWrapper.success("操作成功");
    }

    public static ResultWrapper success(String msg) {
        return ResultWrapper.success(msg, null);
    }

    public static ResultWrapper success(String msg, Object data) {
        return new ResultWrapper(HttpStatus.SUCCESS, msg, data);
    }

    public static ResultWrapper warn(String msg) {
        return ResultWrapper.warn(msg, null);
    }

    public static ResultWrapper warn(String msg, Object data) {
        return new ResultWrapper(HttpStatus.WARN, msg, data);
    }

    public static ResultWrapper error() {
        return ResultWrapper.error("操作失败");
    }

    public static ResultWrapper error(String msg) {
        return ResultWrapper.error(msg, null);
    }

    public static ResultWrapper error(String msg, Object data) {
        return new ResultWrapper(HttpStatus.ERROR, msg, data);
    }

    public static ResultWrapper error(int code, String msg) {
        return new ResultWrapper(code, msg, null);
    }

    @Override
    public ResultWrapper put(String key, Object value) {
        super.put(key, value);
        return this;
    }
	
}

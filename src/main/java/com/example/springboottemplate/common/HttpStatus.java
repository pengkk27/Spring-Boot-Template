package com.example.springboottemplate.common;

/**
 * HTTP 响应状态码：根据 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 * 修改使用
 */
public interface HttpStatus {
	
	
	public ResultCode SUCCESS = new ResultCode(200, "操作成功");
	
	
	public ResultCode BAD_REQUEST = new ResultCode(400, "操作参数列表错误");
	public ResultCode UNAUTHORIZED = new ResultCode(401, "授权参数列表错误");
	public ResultCode FORBIDDEN = new ResultCode(403, "访问受限，授权过期");
	public ResultCode NOT_FOUND = new ResultCode(404, "资源，服务未找到");
	public ResultCode METHOD_NOT_ALLOWED = new ResultCode(405, "不允许的HTTP方法");

	public ResultCode INTERNAL_SERVER_ERROR = new ResultCode(500, "系统内部错误");
	public ResultCode NOT_IMPLEMENTED = new ResultCode(501, "接口未实现");

}

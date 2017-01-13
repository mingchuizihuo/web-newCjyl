package com.idea.cjyl.core.common;

import com.github.pagehelper.Page;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Controller层通用JSON数据返回格式类
 * 
 * @ClassName: ResultData
 * @author: zhangzl
 * @date: 2016年8月8日 下午1:11:59
 */
public class ResultData extends HashMap<String, Object> {
	/**
   * 
   */
	private static final long	serialVersionUID	= 1L;
	private static final String	STATUS_KEY	     = "statusDes";
	private static final String	STATUS_CODE	     = "status";
	private static final String	STATUS_MSG	     = "statusMsg";
	private static final String	NOWTIME	         = "nowTime";
	
	// 状态码
	public static final int	    GROUPTHANMAX	 = 10098;
	
	public enum Status {
		SUCCESS(1, "OK"),
		ERROR(11111, "服务器忙"),
		FAILURE(0, "FAIL"),
		JSON_NEED_LOGIN(
		        700, "数据接口需要登录后才能访问"),
		PERMISSION_DENIED(10001, "没有权限"),
		ISNULL(002,"您有必填字段未填"),
		LOGIN(003,"用户名密码错误"),
		TELUNIQUE(004,"该用户已经存在"),
		ADDERROR(005,"添加失败"),
		UPDATEERROR(006,"修改失败"),
		DELERROR(007,"删除失败");
		public final Integer		             code;
		public final String		                 msg;
		private final static Map<String, Status>	data	= new HashMap<>();
		
		Status(Integer code, String msg) {
			this.code = code;
			this.msg = msg;
		}
		
		static {
			for (Status status : Status.values()) {
				data.put(status.code.toString(), status);
			}
		}
		
		public static Status getStatusByCode(Integer code) {
			Status status = data.get(code.toString());
			if (status == null) {
				throw new IllegalArgumentException("不存存文档所定义的状态值");
			}
			return status;
		}
	}
	
	/**
	 * 
	 * @Title: error
	 * @Description: 服务器忙
	 * @return
	 * @return: ResultData
	 */
	public ResultData error() {

		this.setStatus(Status.ERROR);
		return this;
	}

	/**
	 * 添加失败
	 * @return
	 */
	public ResultData addErroe(){

		this.setStatus(Status.ADDERROR);
		return this;
	}

	/**
	 * 更改失败
	 * @return
	 */
	public ResultData upDateError(){

		this.setStatus(Status.UPDATEERROR);
				return this;
	}

	/**
	 * 删除失败
	 * @return
	 */
	public ResultData delError(){
		this.setStatus(Status.DELERROR);
		return this;
	}
	/**
	 * 用户名已经存在
	 * @return
	 */
	public ResultData telUnique(){
		this.setStatus(Status.TELUNIQUE);
		return this;
	}
	/**
	 * 参数为空
	 * @return
	 */
	public ResultData isNull(){
		this.setStatus(Status.ISNULL);
		return this;
	}

	/**
	 * 登录错误
	 * @return
	 */
	public ResultData login(){
		this.setStatus(Status.LOGIN);
		return this;
	}

	/**
	 * 
	 * @Title: permissionDenied
	 * @Description: 没有权限
	 * @return
	 * @return: ResultData
	 */
	public ResultData permissionDenied() {
		this.setStatus(Status.PERMISSION_DENIED);
		return this;
	}
	
	/**
	 * 
	 * @Title: success
	 * @Description: 成功
	 * @return
	 * @return: ResultData
	 */
	public ResultData success() {
		this.setStatus(Status.SUCCESS);
		return this;
	}
	
	/**
	 * 
	 * @Title: failure
	 * @Description: 失败
	 * @return
	 * @return: ResultData
	 */
	public ResultData failure() {
		this.setStatus(Status.FAILURE);
		return this;
	}
	
	public ResultData() {
		// 默认设置为操作成功状态
		super.put(STATUS_KEY, Status.SUCCESS);
		super.put(STATUS_CODE, Status.SUCCESS.code);
		super.put(STATUS_MSG, Status.SUCCESS.msg);
		super.put(NOWTIME, new Date());
	}
	
	/**
	 * 设置响应状态
	 * 
	 * @param status
	 *            状态对象
	 * @return 当前实例
	 */
	public ResultData setStatus(Status status) {
		super.put(STATUS_KEY, status.toString().toLowerCase());
		super.put(STATUS_CODE, status.code);
		super.put(STATUS_MSG, status.msg);
		return this;
	}
	
	/**
	 * 允许使用int类型设置响应状态码，此方法请谨慎使用。</br>
	 * 
	 * @param status
	 *            响应码文档中所定义的code值
	 * @return 响应码对应的Status对象,如果状态码不存在，会产生IllegalArgumentException
	 */
	public ResultData setStatus(Integer status) {
		this.setStatus(Status.getStatusByCode(status));
		return this;
	}
	
	/**
	 * 添加分页数据，调整为文档通用的解析格式
	 * 
	 * @param page
	 *            分页数据对象
	 * @return 实例本身
	 */
	@SuppressWarnings("rawtypes")
	public ResultData parsePageBean(Page<?> page) {
		super.put("sEcho", "");
		super.put("iTotalRecords", page.getTotal());
		super.put("iTotalDisplayRecords", page.getPageSize());


		//parseBean(page.getResult());
		super.put("aaData", page == null ? new ArrayList() : page);


		return this;
	}
	
	/**
	 * 添加列表数据（兼容分页数据），调整为文档通用的解析格式
	 * 
	 * @param list
	 *            列表数据对象
	 * @return 实例本身
	 */
	@SuppressWarnings("rawtypes")
	public ResultData parseList(List<?> list) {
		if (list instanceof Page) {
			return parsePageBean((Page<?>) list);
		}
		super.put("sEcho", "");
		super.put("aaData", list == null ? new ArrayList() : list);
		return this;
	}
	
	/**
	 * 对map数据的扩展，允许使用己有map进行数据填充
	 * 
	 * @param map
	 *            外部map
	 * @return 当前实例
	 */
	public ResultData parseMap(Map map) {
		super.putAll(map);
		return this;
	}
	
	/**
	 * 产生默认的构造实例，默认添加选中状态为
	 * 
	 * @return 构造的实例
	 */
	public static ResultData build() {
		return new ResultData();
	}
	
	/**
	 * 添加自定义 数据
	 * 
	 * @param key
	 *            key
	 * @param value
	 *            value
	 * @return 当前实例
	 */
	public ResultData put(String key, Object value) {
		if (STATUS_CODE.equals(key)) {
			int code = NumberUtils.toInt(value.toString());
			try {
				this.setStatus(Status.getStatusByCode(code));
			} catch (Exception exception) {
				// status值不是存在时，清空原有的status_key与status_msg值
				super.put(STATUS_CODE, code);
				super.put(STATUS_KEY, "");
				super.put(STATUS_MSG, "");
			}
		} else {
			super.put(key, value);
		}
		return this;
	}
	
	/**
	 * 不太建议使用的接口,此接口仅限于自定义code 及msg显示,key可为pw
	 * 
	 * @param code
	 *            状态对应的CODE:如 100000
	 * @param msg
	 *            状态对应的提示,如:登录验证失败
	 * @param key
	 *            状态的英文名称,如 LOGIN_NEEDED ,可以为空,但建议最好带上一个值
	 * @return
	 */
	public ResultData put(Integer code, String msg, String key) {
		Assert.notNull(code, "状态不能为空");
		Assert.notNull(msg, "描述不能为空");
		super.put(STATUS_CODE, code);
		super.put(STATUS_KEY, key);
		super.put(STATUS_MSG, msg);
		return this;
	}
	
	/**
	 * 将Bean 中的所有get方法的返回值,以方法名去除get后,首字母小写做为key,返回值为value存入当前 ResultData对象中
	 *
	 * @param object
	 * 
	 * @return
	 */
	public ResultData parseBean(Object object) {
		
		Method[] methods = object.getClass().getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String name = method.getName();
			if (name.startsWith("get")) {
				try {
					name = name.replaceAll("get", "");
					name = name.replaceFirst(name.substring(0, 1), name
					        .substring(0, 1).toLowerCase());
					if (STATUS_CODE.equals(name)) {
						name = "state";
					}


					super.put(name, method.invoke(object));
				} catch (IllegalAccessException | IllegalArgumentException
				        | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return this;
	}
	
	/**
	 * 将Bean 中的所有get方法的返回值,以方法名去除get后,首字母小写做为key,返回值为value存入当前 ResultData对象中
	 *
	 * @param object
	 *            在对象上面添加一层aData
	 * @return
	 */
	public ResultData parseaDateBean(Object object) {
		Map<String, Object> map = new HashMap<String, Object>();
		Method[] methods = object.getClass().getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String name = method.getName();
			if (name.startsWith("get")) {
				try {
					name = name.replaceAll("get", "");
					name = name.replaceFirst(name.substring(0, 1), name
					        .substring(0, 1).toLowerCase());
					if (STATUS_CODE.equals(name)) {
						name = "state";
					}
					map.put(name, method.invoke(object));
				} catch (IllegalAccessException | IllegalArgumentException
				        | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		super.put("aData", map);
		return this;
	}
	
}

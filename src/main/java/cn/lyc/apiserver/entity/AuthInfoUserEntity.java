package cn.lyc.apiserver.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-12 15:07:32
 */
@Data
@TableName("auth_info_user")
public class AuthInfoUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 用户编码
	 */
	private String userCode;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 姓名
	 */
	private String realName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 部门
	 */
	private String department;
	/**
	 * 职位
	 */
	private String job;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 删除标识
	 */
	private Integer delFlag;
	/**
	 * 描述
	 */
	private String description;

}

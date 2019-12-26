package com.sxbang.friday.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity<Long> {
	private static final long serialVersionUID = -6525908145032868837L;

	@ApiModelProperty("用户名")
	private String username;
	private String password;
	private String nickname;
	private String headImgUrl;
	private String phone;
	private String telephone;
	private String email;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private Integer sex;
	private Integer status;
	private String intro;

	public interface Status {
		int DISABLED = 0;
		int VALID = 1;
		int LOCKED = 2;
	}
}

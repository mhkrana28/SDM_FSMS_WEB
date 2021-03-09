package com.peopleslabbd.webapps.sdmfsms.model.dtos;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Describes fields of user login process
 * 
 * @author MAHMUD HASAN
 * @since 2020-12-18
 */
@Data
@Accessors(chain = true, fluent = false)
public class LoginDto {

	private String userName;
	private String password;

}

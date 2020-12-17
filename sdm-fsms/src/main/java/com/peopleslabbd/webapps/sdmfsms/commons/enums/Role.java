package com.peopleslabbd.webapps.sdmfsms.commons.enums;

import com.peopleslabbd.webapps.sdmfsms.commons.constants.Txt;

public enum Role {
	SUPER(1),
	COMMON(2);

	private int roleCode;
	
	Role(int roleCode) {
		this.roleCode = roleCode;
	}

	public String getRole() {
		return roleCode == 1 ? Txt.SUPER : Txt.COMMON;
	}
}

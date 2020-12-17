package com.peopleslabbd.webapps.sdmfsms.commons.enums;

/**
 * Contains All JSP page and fragment names
 * 
 * @author MAHMUD HASAN
 * @since 2020-12-17
 */
public enum View {

	LOGIN_PAGE("login-page"),
	DIR_COMMON("common"),
	DASHBOARD_PARENT("dashboard"),
	DASH_HOME("dash-home");

	private String viewName;

	private View(String viewName) {
		this.viewName = viewName;
	}

	public String get() {
		return viewName;
	}

}

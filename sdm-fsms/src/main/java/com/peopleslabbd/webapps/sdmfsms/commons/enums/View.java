package com.peopleslabbd.webapps.sdmfsms.commons.enums;

/**
 * Contains All JSP page and fragment names with individual path reference
 * 
 * @author MAHMUD HASAN
 * @since 2020-12-17
 */
public enum View {

	LOGIN_PAGE("login"),
	DASHBOARD_PARENT("common/parent"),
	DASHBOARD_HOME("dashboard-home");

	private String viewName;

	private View(String viewName) {
		this.viewName = viewName;
	}

	public String get() {
		return viewName;
	}

}

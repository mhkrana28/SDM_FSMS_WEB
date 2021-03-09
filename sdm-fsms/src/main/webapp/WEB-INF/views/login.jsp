<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <!-- Required meta tags -->
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    
	    <!-- Bootstrap CSS -->
	    <link rel="shortcut icon" type="image/png" href="<c:url value="/static/assets/images/icon-login-page-tite.png" />"/>
	    <link rel="stylesheet" href='<c:url value="/static/assets/vendor/bootstrap/css/bootstrap.min.css" />' />
	    <link href='<c:url value="/static/assets/vendor/fonts/circular-std/style.css" />' rel="stylesheet" />
	    <link rel="stylesheet" href='<c:url value="/static/assets/libs/css/style.css" />' />
	    <link rel="stylesheet" href='<c:url value="/static/assets/vendor/fonts/fontawesome/css/fontawesome-all.css" />' />
	    <style>
		    html,
		    body {
		        height: 100%;
		    }
		
		    body {
		        display: -ms-flexbox;
		        display: flex;
		        -ms-flex-align: center;
		        align-items: center;
		        padding-top: 40px;
		        padding-bottom: 40px;
		    }
	    </style>
	    <title>${pageTitle}</title>
	</head>

    <body>
	    <!-- ============================================================== -->
	    <!-- login page  -->
	    <!-- ============================================================== -->
	    <div class="splash-container">
	        <div class="card ">
	            <div class="card-header text-center"><a href="index.html"><img class="logo-img" src="assets/images/login-icon-new.png" alt="logo" style="height:70px;width:90px;"></a><span class="splash-description">মাতৃছায়া এডমিন</span></div>
	            <div class="card-body">
	                <form:form modelAttribute="loginDto" action="${pageContext.request.contextPath}/login" method="POST" autocomplete="off">
	                    <div class="form-group">
	                    	<form:input type="text" path="userName" id="userName" cssClass="form-control form-control-lg" placeholder="ইউজার নেইম দিন" required="required"/>
	                    </div>
	                    <div class="form-group">
	                    	<form:input type="password" path="password" id="password" cssClass="form-control form-control-lg" required="required" placeholder="পাসওয়ার্ড দিন"  />
	                    </div>
	                    <button type="submit" class="btn btn-primary btn-lg btn-block" id="loginButton"><i class="glyphicon glyphicon-log-in"></i> লগ ইন</     </button>
	                </form:form>
	            </div>
	            <div class="card-footer bg-white p-0  ">
	                <div class="card-footer-item card-footer-item-bordered">
	                    <a href="pages/forgot-password.html" class="footer-link">পাসওয়ার্ড ভুলে গেছেন ?</a>
	                </div>
	            </div>
	            <div class="card-footer text-danger">${loginNotice}</div>
	        </div>
	    </div>
	  
	    <!-- ============================================================== -->
	    <!-- end login page  -->
	    <!-- ============================================================== -->
	    <!-- Optional JavaScript -->
	    <script src='<c:url value="/static/assets/vendor/jquery/jquery-3.3.1.min.js" />' ></script>
	    <script src='<c:url value="/static/assets/vendor/bootstrap/js/bootstrap.bundle.js" />' ></script>
	    <!-- <script src='<c:url value="/static/custom_js/login_page.js" />' ></script> -->
	    
	</body>

</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="shortcut icon" type="image/png" href="<c:url value="/static/assets/images/icon-login-page-tite.png" />"/>
        <link href='<c:url value="/static/assets/vendor/bootstrap/css/bootstrap.min.css"/>' rel="stylesheet">
        <link href='<c:url value="/static/assets/libs/css/style.css"/>' rel="stylesheet">
        <link href='<c:url value="/static/assets/vendor/fonts/circular-std/style.css"/>' rel="stylesheet">
        <link href='<c:url value="/static/assets/vendor/fonts/fontawesome/css/fontawesome-all.css"/>' rel="stylesheet">
        <link href='<c:url value="/static/assets/vendor/fonts/flag-icon-css/flag-icon.min.css"/>' rel="stylesheet">
        
        <title>${pageTitle}</title>
    	
    	<style>
    		html,
		    body {
		        height: 100%;
		    }
		    .bg-theme {
		    	background-color: #caa677;
		    	color: #006161;
		    	
		    }
		    
		    .bg-theme-optional {
		    	background-color: #ece0cf;
		    	color: #525252;
		    }
		    
		    .text-theme-secondary {
		    	color: blue;
		    }
		    
		    .medium-text {
		    	font-size: medium !important; 
		    }
		    
		    .topHeaderNavbar {
			    -webkit-box-shadow: -2px 2px 7px 1px #b9b9b9;  /* Safari 3-4, iOS 4.0.2 - 4.2, Android 2.3+ */
			    -moz-box-shadow:    -2px 2px 7px 1px #b9b9b9;  /* Firefox 3.5 - 3.6 */
			    box-shadow:         -2px 2px 7px 1px #b9b9b9;  /* Opera 10.5, IE 9, Firefox 4+, Chrome 6+, iOS 5 */
			    border: 0px !important;
			}
			.topHeaderNavbar, .topHeaderNavbar .navbar-brand {
			    height: auto !important;
			}
			.topHeaderNavbar .navbar-brand {
			    padding: 5px 15px !important;
			}
			.logoImage {
			    height: 60px;
			}
			.topHeaderNavbar .navbar-nav>li>a {
			    line-height: 40px;
			}
			.topHeaderNavbar {
			    border-radius: 0px !important;
			    background-color: #fff !important;
			}
		    
	    </style>
    </head>

    <body>
        <nav class="navbar navbar-expand-md navbar-dark bg-theme shadow-sm fixed-top">
				    <a style="padding-top: 0 !important; padding-bottom: 0 !important;" class="navbar-brand" href="#"><img style="width:250px; height: 40px;" src='<c:url value="/static/assets/images/m-logo-light.png"/>'></a>
				    <ul class="navbar-nav">
				      <li class="nav-item active"><a class="nav-link medium-text" href="#"><i class="fa fa-home" aria-hidden="true"></i> ড্যাশবোর্ড</a></li>
				      <li class="nav-item"><a class="nav-link medium-text"   href="#"><i class="fa fa-balance-scale"></i> বিক্রয়</a></li>
				      <li class="nav-item"><a class="nav-link medium-text" href="#"><i class="fa fa-users"></i> ক্রেতা</a></li>
				      <li class="nav-item"><a class="nav-link medium-text" href="#"><i class="fa fa-wrench"></i> সেটিংস</a></li>
				    </ul>
				    <ul class="navbar-nav ml-auto navbar-right-top">
				      <li class="nav-item"><a class="nav-link text-light" style="padding-top: 0 !important; padding-bottom: 0 !important;" href="#"><i class="fa fa-user" aria-hidden="true"></i> ${sessionScope.admin.fullName}</a></li>
				      <li class="nav-item"><a class="nav-link text-light" style="padding-top: 0 !important; padding-bottom: 0 !important;" href="#"><i class="fas fa-power-off mr-2"></i> লগ-আউট</a></li>
				    </ul>
		</nav>
		
		<jsp:include page="../${mainContent}.jsp"/>
		
		<div class="container-fluid"><p class="pull-right copyrightText">&copy; Copyright 2019-2020, All Rights Reserved. [Dev: Mahmudul Hasan] [Owner: Saddam Hossain]</p></div>
        
        <input type="hidden" id="baseUrl" value="${pageContext.request.contextPath}" />        
        
		
    
    </body>
    
    

	<!-- ============================================================== -->
	<!-- JAVASCRIPT DEPENDENCIES  -->
	<!-- ============================================================== -->
    <script src='<c:url value="/static/assets/vendor/jquery/jquery-3.3.1.min.js"/>' type="text/javascript"></script>
    <script src='<c:url value="/static/assets/vendor/bootstrap/js/bootstrap.bundle.js"/>' type="text/javascript"></script>
    
    
	            
</html>
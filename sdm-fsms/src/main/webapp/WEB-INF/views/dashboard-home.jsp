<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container-fluid">
	                <!-- ============================================================== -->
	                <!-- pagehader  -->
	                <!-- ============================================================== -->
	                <div class="row">
	                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
	                        <div class="page-header">
	                            <h3 class="mb-2 text-theme-secondary" > এক নজরে পরিসংখ্যান </h3>
	                            <div class="page-breadcrumb">
	                                <nav aria-label="breadcrumb">
	                                    <ol class="breadcrumb">
	                                        <li class="breadcrumb-item"><a href="dashboard.html" class="breadcrumb-link">ড্যাশবোর্ড</a></li>
	                                        <li class="breadcrumb-item active" aria-current="page">এক নজরে পরিসংখ্যান </li>
	                                    </ol>
	                                </nav>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	                <!-- ============================================================== -->
	                <!-- pagehader  -->
	                <!-- ============================================================== -->
	                <div class="row">
	                    <!-- metric -->
	                    <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
	                        <div class="card">
	                            <div class="card-body">
	                                <h5 class="text-muted">মোট গ্রাহক</h5>
	                                <div class="metric-value d-inline-block">
	                                    <h1 class="mb-1 text-primary">105</h1>
	                                </div>
	                                <div class="metric-label d-inline-block float-right text-success">
	                                    <i class="fa fa-fw fa-caret-up"></i><span>জন </span>
	                                </div>
	                            </div>
	                            <div id="sparkline-1"></div>
	                        </div>
	                    </div>
	                    <!-- /. metric -->
	                    <!-- metric -->
	                    <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
	                        <div class="card">
	                            <div class="card-body">
	                                <h5 class="text-muted">মোট বিক্রয় </h5>
	                                <div class="metric-value d-inline-block">
	                                    <h1 class="mb-1 text-primary">270502</h1>
	                                </div>
	                                <div class="metric-label d-inline-block float-right text-success">
	                                    <i class="fa fa-fw fa-caret-up"></i><span>টাকা </span>
	                                </div>
	                            </div>
	                            <div id="sparkline-2"></div>
	                        </div>
	                    </div>
	                    <!-- /. metric -->
	                    <!-- metric -->
	                    <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
	                        <div class="card">
	                            <div class="card-body">
	                                <h5 class="text-muted">মোট বাকী </h5>
	                                <div class="metric-value d-inline-block">
	                                    <h1 class="mb-1 text-primary">65,656</h1>
	                                </div>
	                                <div class="metric-label d-inline-block float-right text-success">
	                                    <i class="fa fa-fw fa-caret-up"></i><span>টাকা </span>
	                                </div>
	                            </div>
	                            <div id="sparkline-3">
	                            </div>
	                        </div>
	                    </div>
	                    <!-- /. metric -->
	                    <!-- metric -->
	                    <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12 col-12">
	                        <div class="card">
	                            <div class="card-body">
	                                <h5 class="text-muted">মোট লাভ </h5>
	                                <div class="metric-value d-inline-block">
	                                    <h1 class="mb-1 text-primary">23560</h1>
	                                </div>
	                                <div class="metric-label d-inline-block float-right text-success">
	                                    <i class="fa fa-fw fa-caret-up"></i><span>টাকা </span>
	                                </div>
	                            </div>
	                            <div id="sparkline-4"></div>
	                        </div>
	                    </div>
	                    <!-- /. metric -->
	                </div>
	
	                <div class="row">
	                    <!-- ============================================================== -->
	                    <!-- top selling products  -->
	                    <!-- ============================================================== -->
	                    <div class="col-xl-7 col-lg-12 col-md-12 col-sm-12 col-12" >
	                        <div class="card" style="min-height: 500px;">
	                            <h5 class="card-header bg-theme-optional"><i class="fas fa-history"></i> সেরা বিক্রির ইতিহাস </h5>
	                            <div class="card-body p-0">
	                                <div class="table-responsive">
	                                    <table class="table table-hover">
	                                        <thead class="bg-light">
	                                            <tr class="border-0">
	                                                <th class="border-0">#</th>
	                                                <th class="border-0">ছবি </th>
	                                                <th class="border-0">ক্রেতার নাম </th>
	                                                <th class="border-0">পণ্যের নাম  </th>
	                                                <th class="border-0">বিক্রয়কৃত দাম </th>
	                                                <th class="border-0">সময় </th>
	                                            </tr>
	                                        </thead>
	                                        <tbody>
	                                            <tr>
	                                                <td>1</td>
	                                                <td>
	                                                    <div class="m-r-10"><img src="assets/images/product-pic.jpg" alt="user" class="rounded" width="45"></div>
	                                                </td>
	                                                <td>Monir Hossain </td>
	                                                <td>Television </td>
	                                                <td>34600 tk</td>
	                                                <td>27-08-2018 01:22:12</td>
	                                            </tr>
	                                            <tr>
	                                                <td>1</td>
	                                                <td>
	                                                    <div class="m-r-10"><img src="assets/images/product-pic.jpg" alt="user" class="rounded" width="45"></div>
	                                                </td>
	                                                <td>Mortaja Hossain </td>
	                                                <td>Sofa Set </td>
	                                                <td>22600 tk</td>
	                                                <td>25-08-2018 01:22:12</td>
	                                            </tr>
	                                            <tr>
	                                                <td>1</td>
	                                                <td>
	                                                    <div class="m-r-10"><img src="assets/images/product-pic.jpg" alt="user" class="rounded" width="45"></div>
	                                                </td>
	                                                <td>Monir Hossain </td>
	                                                <td>Television </td>
	                                                <td>34600 tk</td>
	                                                <td>27-08-2018 01:22:12</td>
	                                            </tr>
	                                            <tr>
	                                                <td>1</td>
	                                                <td>
	                                                    <div class="m-r-10"><img src="assets/images/product-pic.jpg" alt="user" class="rounded" width="45"></div>
	                                                </td>
	                                                <td>Mortaja Hossain </td>
	                                                <td>Sofa Set </td>
	                                                <td>22600 tk</td>
	                                                <td>25-08-2018 01:22:12</td>
	                                            </tr>
	                                        </tbody>
	                                    </table>
	                                </div>
	                            </div>
	                             <div class="card-footer text-center">
	                                <a href="#" class="btn-primary-link">View Details</a>
	                            </div>
	                        </div>
	                    </div>
	                    <!-- ============================================================== -->
	                    <!-- end top selling products  -->
	                    <!-- ============================================================== -->
	                   
	                   
	                    <!-- ============================================================== -->
	                    <!-- revenue locations  -->
	                    <!-- ============================================================== -->
	                    <div class="col-xl-5 col-lg-12 col-md-12 col-sm-12 col-12">
	                        <div class="card" style="min-height: 500px;">
	                            <h5 class="card-header bg-theme-optional"><i class="fas fa-calculator"></i> দৈনিক টাকা কালেকশন ও বিক্রি </h5>
	                            <div class="card-body p-0">
	                                <ul class="traffic-sales list-group list-group-flush">
	                                	<li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">তারিখ </span><span class="traffic-sales-amount">কালেকশন  <span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"></span><span class="ml-1 text-success">বিক্রি </span></span>
	                                    </li>
	                                    <li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">Direct</span><span class="traffic-sales-amount">$4000.00  <span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"><i class="fa fa-fw fa-arrow-up"></i></span><span class="ml-1 text-success">5.86%</span></span>
	                                    </li>
	                                    <li class="traffic-sales-content list-group-item"><span class="traffic-sales-name">Search<span class="traffic-sales-amount">$3123.00  <span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"><i class="fa fa-fw fa-arrow-up"></i></span><span class="ml-1 text-success">5.86%</span></span>
	                                        </span>
	                                    </li>
	                                    <li class="traffic-sales-content list-group-item"><span class="traffic-sales-name">Social<span class="traffic-sales-amount ">$3099.00  <span class="icon-circle-small icon-box-xs text-success ml-4 bg-success-light"><i class="fa fa-fw fa-arrow-up"></i></span><span class="ml-1 text-success">5.86%</span></span>
	                                        </span>
	                                    </li>
	                                    <li class="traffic-sales-content list-group-item"><span class="traffic-sales-name">Referrals<span class="traffic-sales-amount ">$2220.00   <span class="icon-circle-small icon-box-xs text-danger ml-4 bg-danger-light"><i class="fa fa-fw fa-arrow-down"></i></span><span class="ml-1 text-danger">4.02%</span></span>
	                                        </span>
	                                    </li>
	                                    <li class="traffic-sales-content list-group-item "><span class="traffic-sales-name">Email<span class="traffic-sales-amount">$1567.00   <span class="icon-circle-small icon-box-xs text-danger ml-4 bg-danger-light"><i class="fa fa-fw fa-arrow-down"></i></span><span class="ml-1 text-danger">3.86%</span></span>
	                                        </span>
	                                    </li>
	                                </ul>
	                            </div>
	                            <div class="card-footer text-center">
	                                <a href="#" class="btn-primary-link">View Details</a>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	                
</div>
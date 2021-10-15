<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="no-js" >
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>::eBazar::  Categories List </title>
    <link rel="icon" href="favicon.ico" type="image/x-icon"> <!-- Favicon-->

    <!-- plugin css file  -->
    <link rel="stylesheet" href="/static/assets/plugin/datatables/responsive.dataTables.min.css">
    <link rel="stylesheet" href="/static/assets/plugin/datatables/dataTables.bootstrap5.min.css">

    <!-- project css file  -->
    <link rel="stylesheet" href="/static/assets/css/ebazar.style.min.css">
</head>
<body>
    <div id="ebazar-layout" class="theme-blue">
        
        <!-- sidebar -->
        <div class="sidebar px-4 py-4 py-md-5 me-0">
            <div class="d-flex flex-column h-100">
                <a href="index.html" class="mb-0 brand-icon"> 
                    <span class="logo-text">Country 관리</span>
                </a>
                <!-- Menu: main ul -->
<jsp:include page="left-menu.jsp"></jsp:include>
                <!-- Menu: menu collepce btn -->
                <button type="button" class="btn btn-link sidebar-mini-btn text-light">
                    <span class="ms-2"><i class="icofont-bubble-right"></i></span>
                </button>
            </div>
        </div>    

        <!-- main body area -->
        <div class="main px-lg-4 px-md-4">  
${cnt }
            <!-- Body: Body -->
            <div class="body d-flex py-3">
                <div class="container-xxl">
                    <div class="row align-items-center">
                        <div class="border-0 mb-4">
                            <div class="card-header py-3 no-bg bg-transparent d-flex align-items-center px-0 justify-content-between border-bottom flex-wrap">
                                <h3 class="fw-bold mb-0">Country List</h3> 
                            </div>
                        </div>
                    </div> <!-- Row end  -->
                    <div class="row g-3 mb-3">
                        <div class="col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <table id="myDataTable" class="table table-hover align-middle mb-0" style="width: 100%;">
                                        <thead>
                                            <tr>
                                                <th>Country ID</th>
                                                <th>Country Name</th>
                                                <th>Region ID</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        	<c:forEach items="${list}" var="country">
												<tr>
													<td>${country.countryId}</td>
													<td>${country.countryName}</td>
													<td>${country.regionId}</td>
												</tr>
											</c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 
        </div> 

    </div>

    <!-- Jquery Core Js -->
    <script src="/static/assets/bundles/libscripts.bundle.js"></script>

    <!-- Plugin Js -->
<!--     <script src="assets/bundles/dataTables.bundle.js"></script>   -->

    <!-- Jquery Page Js -->
<!--     <script src="/static/js/template.js"></script> -->
    <script> 
    
    </script>
</body>
</html> 
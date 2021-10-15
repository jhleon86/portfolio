<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html class="no-js" lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>::eBazar::  Product Add </title>
    <link rel="icon" href="favicon.ico" type="image/x-icon"> <!-- Favicon-->

    <!--plugin css file --> 
    <link rel="stylesheet" href="/static/assets/plugin/datatables/responsive.dataTables.min.css"><!-- Datatable Css -->
    <link rel="stylesheet" href="/static/assets/plugin/datatables/dataTables.bootstrap5.min.css"><!-- Datatable Css -->

    <!-- Project css file  -->
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

            <!-- Body: Header -->
            <div class="header">
                <nav class="navbar py-4">
                    <div class="container-xxl" style="float: right;"> 
        
       					<div class="h-right d-flex align-items-center mr-2 mr-lg-0 order-1">
                            <div class="d-flex"> 
                            </div> 
                            <div class="setting ms-2">
                            </div>
                        </div>
                        
                        <!-- menu toggler -->
                        <button class="navbar-toggler p-0 border-0 menu-toggle order-3" type="button" data-bs-toggle="collapse" data-bs-target="#mainHeader">
                            <span class="fa fa-bars"></span>
                        </button>
        
        				<div style="display: none;" class="order-0 col-lg-4 col-md-4 col-sm-12 col-12 mb-3 mb-md-0 ">
                            <div class="input-group flex-nowrap input-group-lg">
                                <input type="search" class="form-control" placeholder="Search" aria-label="search" aria-describedby="addon-wrapping">
                                <button type="button" class="input-group-text" id="addon-wrapping"><i class="fa fa-search"></i></button>
                            </div>
                        </div>
                        
                    </div>
                </nav>
            </div>

            <!-- Body: Body --> 
            <div class="body d-flex py-3">
                <div class="container-xxl"> 
                    <div class="row align-items-center">
                        <div class="border-0 mb-4">
                            <div class="card-header py-3 no-bg bg-transparent d-flex align-items-center px-0 justify-content-between border-bottom flex-wrap">
                                <h3 class="fw-bold mb-0">Country Add</h3>
                                <button type="button" onclick="javascript:countrySave();" class="btn btn-primary btn-set-task w-sm-100 py-2 px-5 text-uppercase">Save</button>
                            </div>
                        </div>
                    </div> <!-- Row end  -->  
                    
                    <div class="row g-3 mb-3">
                        <div class="col-xl-4 col-lg-4">
                            <div class="sticky-lg-top">
                                <div class="card mb-3">
                                    <div class="card-header py-3 d-flex justify-content-between align-items-center bg-transparent border-bottom-0">
                                        <h6 class="m-0 fw-bold">Country Info</h6>
                                    </div>
                                    <div class="card-body">
                                        <div class="row g-3 align-items-center">
                                            <div class="col-md-12">
                                                <label  class="form-label">COUNTRY ID</label>
                                                <input id="countryId" type="text" class="form-control">
                                            </div>
                                            <div class="col-md-12">
                                                <label  class="form-label">COUNTRY NAME</label>
                                                <input id="countryName" type="text" class="form-control">
                                            </div>
                                            <div class="col-md-12">
                                                <label  class="form-label">REGION ID</label>
                                                <input id="regionId" type="text" class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>                        
                    </div><!-- Row end  -->  
                </div> 
            </div>    
        </div>     
    </div>

    <!-- Jquery Core Js -->      
    <script src="/static/assets/bundles/libscripts.bundle.js"></script>  
    <!-- Jquery Page Js -->   
    <script src="/static/js/template.js"></script>
    <script> 
    $(function() {
    	
    });
     
    function countrySave(){
    	
    	if(confirm("저장하시겠습니까?")==false){
    		return;
    	}
    	
        var cId = $("#countryId").val();
        var cName = $("#countryName").val();
        var rId = $("#regionId").val();
        
        console.log("COUNTRY ID : "+cId);
        console.log("COUNTRY NAME : "+cName);
        console.log("REGION ID : "+rId);
        
        $.ajax({
          method: "POST",
       	  url: "/sample/country-add/insert/ajax",
       	  data : {
       		  		countryId : cId,
       		  		countryName : cName,
       		 		regionId : rId
       		  	}
        	
       	}).done(function(response) {
       		console.log(response)
    		alert("저장되었습니다.");
    		window.location.replace("/sample/country-list");
       	});
    }
    
    
    
    </script>
</body>
</html> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.VO.CarVO"%>
<%@page import="java.util.List"%>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>List of Cars</title>
       <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
      <link rel="stylesheet" href="${bootstrapCSS }" />
   </head>
   <body>
      <%
         List<CarVO> carList = new ArrayList<CarVO>();
         carList = (List<CarVO>) session.getAttribute("carList");
         if (carList == null || carList.isEmpty()) {
         %>
      <h1>Sorry no cars were found</h1>
      <%
         } else {
         %>
      <div class="container">
         <div class="row" style="margin-top: 40px;">
            <div class="col-lg-4 col-md-4 col-sm-4">
               <a href="/"><button type="button"
                  class="btn btn-primary">
               <span class="glyphicon glyphicon-home"></span> Home
               </button></a>
            </div>
         </div>
         <div class="row" style="margin-top: 40px;">
            <table class="table table-striped table-bordered table-responsive">
               <tr>
                  <th>Make</th>
                  <th>Model</th>
                  <th>Action</th>
               </tr>
               <%
                  for (CarVO car : carList) {
                  		String linkView = "details?vehicleId="+ car.getVehicleId();
                  		String linkEdit = "PreEditCar?vehicleId="+ car.getVehicleId();
                  %>
               <tr>
                  <td><%=car.getMake()%></td>
                  <td><%=car.getModel()%></td>
                  <td><a href="<%=linkView%>"><button class="btn btn-primary">View</button>
                     </a><a href="<%=linkEdit%>"><button class="btn btn-success">Edit</button>
                     </a>
                  </td>
               </tr>
               <%
                  }
                  %>
            </table>
         </div>
      </div>
      <%
         }
         %>
   </body>
</html>
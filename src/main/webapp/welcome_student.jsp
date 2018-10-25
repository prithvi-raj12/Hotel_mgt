<jsp:include page="header.jsp" /> 



<h1 style="margin-left: 70px;">Welcome :<%out.println(request.getParameter("name")); %> </h1>
<div id="welcomeStudent">

 <div id="welcomeStudentrow"><%out.println(request.getParameter("name")); %></div>
 
 <div id="welcomeStudentrow"><%out.println(request.getParameter("phoneNumber")); %></div>
 
 <div id="welcomeStudentrow"><% out.println(request.getParameter("email"));%></div>
 
 <div id="welcomeStudentrow"><% out.println(request.getParameter("Gender"));%></div>



</div>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.dcpet.controller.StudentDetails" %>
<%@ page import="com.dcpet.controller.FamilyDetails" %>
<%@ page import="com.dcpet.controller.AddressDetails" %>
<%@ page import="com.dcpet.controller.ProgramDetails" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>POLYTECHNIC UNIVERSITY OF THE PHILIPPINES - MANILA</h1>
<h2>STUDENT CONFIRMATION FORM</h2>
<h3><%=request.getAttribute("pogi")%></h3>

<%
StudentDetails lakas = new StudentDetails();
lakas = (StudentDetails)request.getAttribute("student");

ProgramDetails power = new ProgramDetails();
power = (ProgramDetails)request.getAttribute("program");

FamilyDetails free = new FamilyDetails();
free = (FamilyDetails)request.getAttribute("family");

AddressDetails add = new AddressDetails();
add = (AddressDetails)request.getAttribute("address");
%>

<div>
<h4>STUDENT DETAILS</h4>

<table border="1">

<tr>
<td>FIRST NAME</td>
<td><%=lakas.getFirstName() %></td>
<td>LAST NAME</td>
<td><%=lakas.getLastName()%></td>
</tr>

<tr>
<td>AGE</td>
<td><%=lakas.getAge()%></td>
<td>GENDER</td>
<td><%=lakas.getGender()%></td>
</tr>

<tr>
<td>CIVIL STATUS</td>
<td><%=lakas.getCivilStatus()%></td>
<td>CONTACT NUMBER</td>
<td><%=lakas.getContactNumber()%></td>
</tr>

</table>

</div>


<div>
<h4>PROGRAM DETAILS</h4>

<table border="1">

<tr>
<td>DEGREE ENROLLED</td>
<td><%=power.getDegreeEnrolled()%></td>
<td>SEMESTER</td>
<td><%=power.getSemester()%></td>
</tr>

<tr>
<td>YEAR LEVEL</td>
<td><%=power.getYearLevel()%></td>
<td>REGULAR/IRREGULAR</td>
<td><%=power.getStatus()%></td>
</tr>


</table>

</div>


<div>
<h4>ADDRESS DETAILS</h4>

<table border="1">

<tr>
<td>REGION</td>
<td><%=add.getRegion()%></td>
<td>CITY</td>
<td><%=add.getCity()%></td>
</tr>

<tr>
<td>BARANGAY</td>
<td><%=add.getBarangay()%></td>
<td>BLOCK NUMBER</td>
<td><%=add.getBlockNumber()%></td>
</tr>

<tr>
<td>UNIT NUMBER</td>
<td><%=add.getUnitNumber()%></td>
<td>POSTAL CODE</td>
<td><%=add.getPostalCode()%></td>
</tr>

</table>

</div>

<div>
<h4>FAMILY DETAILS</h4>

<table border="1">

<tr>
<td>FATHER'S FIRST NAME</td>
<td><%=free.getFathern()%></td>
<td>FATHER'S LAST NAME</td>
<td><%=free.getFatherl()%></td>
</tr>

<tr>
<td>MOTHER'S FIRST NAME</td>
<td><%=free.getMothern()%></td>
<td>MOTHER'S LAST NAME</td>
<td><%=free.getMotherl()%></td>
</tr>

<tr>
<td>SIBLING</td>
<td><%=free.getSiblings()%></td>
<td>FAMILY SIZE</td>
<td><%=free.getFamSize()%></td>
</tr>

</table>

</div>
</body>
</html>
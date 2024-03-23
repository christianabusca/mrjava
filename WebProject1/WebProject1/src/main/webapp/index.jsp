<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="com.dcpet.controller.Studeets"%> 
<%@ page import="com.dcpet.controller.ProgramD"%> 
<%@ page import="com.dcpet.controller.AddressD"%> 
<%@ page import="com.dcpet.controller.FamlyD"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    

<h1>POLYTECHNIC UNIVERSITY OF THE PHILIPPINES - MANILA</h1>
<h2>STUDENT CONFIRMATION FORM</h2>


<%
Studeets studentDetails=new Studeets();
studentDetails=(Studeets)request.getAttribute("studentDetails"); 

ProgramD programDetails=new ProgramD();
programDetails=(ProgramD)request.getAttribute("programDetails"); 

AddressD addressDetails=new AddressD();
addressDetails=(AddressD)request.getAttribute("addressDetails"); 

FamlyD familyDetails=new FamlyD();
familyDetails=(FamlyD)request.getAttribute("familyDetails"); 

%>

<div>
<h4>STUDENT DETAILS</h4>

<table border="1">

<tr>
<td>FIRST NAME</td>
<td><%=studentDetails.getFirstName()%></td>
<td>LAST NAME</td>
<td><%=studentDetails.getLastName()%></td>
</tr>

<tr>
<td>AGE</td>
<td><%=studentDetails.getAge()%></td>
<td>GENDER</td>
<td><%=studentDetails.getGender()%></td>
</tr>

<tr>
<td>CIVIL STATUS</td>
<td><%=studentDetails.getCivilStatus()%></td>
<td>CONTACT NUMBER</td>
<td><%=studentDetails.getContactNumber()%></td>
</tr>

</table>

</div>


<div>
<h4>PROGRAM DETAILS</h4>

<table border="1">

<tr>
<td>DEGREE ENROLLED</td>
<td><%=programDetails.getDegree()%></td>
<td>SEMESTER</td>
<td><%=programDetails.getSemester()%></td>
</tr>

<tr>
<td>YEAR LEVEL</td>
<td><%=programDetails.getYear()%></td>
<td>REGULAR/IRREGULAR</td>
<td><%=programDetails.getStatus()%></td>
</tr>


</table>

</div>


<div>
<h4>ADDRESS DETAILS</h4>

<table border="1">

<tr>
<td>REGION</td>
<td><%=addressDetails.getRegion()%></td>
<td>CITY</td>
<td><%=addressDetails.getCity()%></td>
</tr>

<tr>
<td>BARANGAY</td>
<td><%=addressDetails.getBarangay()%></td>
<td>BLOCK NUMBER</td>
<td><%=addressDetails.getBlock()%></td>
</tr>

<tr>
<td>UNIT NUMBER</td>
<td><%=addressDetails.getUnit()%></td>
<td>POSTAL CODE</td>
<td><%=addressDetails.getPostal()%></td>
</tr>

</table>

</div>

<div>
<h4>FAMILY DETAILS</h4>

<table border="1">

<tr>
<td>FATHER'S FIRST NAME</td>
<td><%=familyDetails.getFatherFirst()%></td>
<td>FATHER'S LAST NAME</td>
<td><%=familyDetails.getFatherLast()%></td>
</tr>

<tr>
<td>MOTHER'S FIRST NAME</td>
<td><%=familyDetails.getMotherFirst()%></td>
<td>MOTHER'S LAST NAME</td>
<td><%=familyDetails.getMotherLast()%></td>
</tr>

<tr>
<td>SIBLING</td>
<td><%=familyDetails.getSiblings()%></td>
<td>FAMILY SIZE</td>
<td><%=familyDetails.getFamilySize()%></td>
</tr>

</table>

</div>



</body>
</html>
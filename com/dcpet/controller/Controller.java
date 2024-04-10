package com.dcpet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Studeets sd= new Studeets();
		 sd.setFirstName("Christian Drey");
		 sd.setLastName("Abusca");
		 sd.setAge("20");
		 sd.setGender("Male");
		 sd.setCivilStatus("Single");
		 sd.setContactNumber("09282323148");
		 
		 request.setAttribute("studentDetails", sd);
		 
		 
		 ProgramD pd= new ProgramD();
		 pd.setDegree("Diploma in Computer Engineering Technology");
		 pd.setSemester("2nd Semester");
		 pd.setYear("2nd Year");
		 pd.setStatus("Regular");
		 
		 request.setAttribute("programDetails", pd);
		 
		 
		 AddressD ad= new AddressD();
		 ad.setRegion("NCR");
		 ad.setCity("Taguig City");
		 ad.setBarangay("Cembo");
		 ad.setBlock("448");
		 ad.setUnit("NA");
		 ad.setPostal("1648");
		 
		 request.setAttribute("addressDetails", ad);
		 
		 FamlyD fd= new FamlyD();
		 fd.setFatherFirst("Rey");
		 fd.setFatherLast("Abusca");
		 fd.setMotherFirst("Dolorosa");
		 fd.setMotherLast("Abusca");
		 fd.setSiblings("3");
		 fd.setFamilySize("7 Persons");
		 
		 request.setAttribute("familyDetails", fd);
		 
		 
		 
		 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	     rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

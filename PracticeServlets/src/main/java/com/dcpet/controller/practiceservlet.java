package com.dcpet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class practiceservlet
 */
public class practiceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public practiceservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("pogi", "Institute of Technology");
		StudentDetails sd = new StudentDetails();
		sd.setFirstName("Christian Drey");
		sd.setLastName("Abusca");
		sd.setAge("20");
		sd.setGender("Male");
		sd.setCivilStatus("Single/");
		sd.setContactNumber("09959588769");

		

		AddressDetails ad = new AddressDetails();
		ad.setRegion("NCR");
		ad.setBarangay("CEMBO");
		ad.setCity("Taguig City");
		ad.setPostalCode("1648");
		ad.setUnitNumber("NA");
		ad.setBlockNumber("448");

		

		FamilyDetails fd = new FamilyDetails();
		fd.setFamSize("7");
		fd.setFatherl("Abusca");
		fd.setFathern("Rey");
		fd.setMotherl("Abusca");
		fd.setMothern("Dolorosa");
		fd.setSiblings("3");

		

		ProgramDetails pd = new ProgramDetails();
		pd.setDegreeEnrolled("DCPET");
		pd.setSemester("2nd Semester");
		pd.setStatus("Regular");
		pd.setYearLevel("2nd year");
		
		request.setAttribute("student", sd);
		System.out.println(sd);
		request.setAttribute("address", ad);
		System.out.println(ad);
		request.setAttribute("family", fd);
		System.out.println(fd);
		request.setAttribute("program", pd);
		System.out.println(pd);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

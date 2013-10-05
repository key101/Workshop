package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.classes.Calculator;
/**
 * Servlet implementation class Testservelet
 */
@WebServlet("/Testservelet")
public class Testservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String useraction=request.getParameter("useraction");
		
		int i = Integer.parseInt(request.getParameter("usrval1"));
		int j=Integer.parseInt(request.getParameter("usrval2"));
		int k=0;
		String str=request.getParameter("useraction");
		Calculator cal= new Calculator();
		
		if(str.equals("add"))
		k=cal.add(i,j);
		if(str.equals("mul"))
		 k=cal.mul(i, j);
		if(str.equals("div"))
		 k=cal.div(i, j);
		
		response.getWriter().println(k);
	}

}

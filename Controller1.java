package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DatabaseOperation;
import Model.Form;
@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out =response.getWriter();
		
		String title=request.getParameter("title");
		
		String desc=request.getParameter("desc");
		
		String content=request.getParameter("content");
		
//		System.out.println(title +" "+ desc+" "+content);
		
		Form f = new Form(title,desc,content);
		
		try {
			DatabaseOperation.insert(f);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 ResultSet r = null;
		try {
			r = DatabaseOperation.select();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
		request.getRequestDispatcher("view.jsp").forward(request, response);
		
	}

}

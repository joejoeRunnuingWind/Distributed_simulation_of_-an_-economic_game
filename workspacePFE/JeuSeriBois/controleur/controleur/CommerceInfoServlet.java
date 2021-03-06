package controleur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Commerce;
import model.CommerceOperation;

import java.util.*;

/**
 * Servlet implementation class CommerceInfoServlet
 */
@WebServlet("/CommerceInfoServlet")
public class CommerceInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommerceInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		int IdC = -1;
		if (request.getParameter("idC") != null){
			IdC = Integer.parseInt(request.getParameter("idC"));
		}
		String nomI;
		synchronized(this){
		nomI = (String)session.getAttribute("adresseMI");
		}
		String nomIndu;
		String nomB;
		String nomP;
		Double prix;
		String date;
		String dure;
		String vendu;
		int id;
		Commerce commerce = new Commerce();
		CommerceOperation listeCommerce = new CommerceOperation();
		try {
		      Class.forName("com.mysql.jdbc.Driver");     
		      //Class.forName("org.gjt.mm.mysql.Driver");
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		    try {
		      Connection connect = DriverManager.getConnection(
		          "jdbc:mysql://localhost:3306/bois","root","");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		    	  String sql="UPDATE commerce SET vendu = 'Oui', nom_i = '" + nomI + "' WHERE ID ='" + IdC + "'";
		    	  int j = stmt.executeUpdate(sql); 
		      ResultSet rs = stmt.executeQuery("select * from commerce");
		      while (rs.next()) {
		    	
		    	nomB = rs.getString("nom_b");
		    	date = rs.getString("date_c");
		    	dure = rs.getString("dure_c");
		    	nomP = rs.getString("nom_p");
		    	vendu = rs.getString("vendu");
		    	nomIndu = rs.getString("nom_i");
		    	prix = Double.parseDouble(rs.getString("prix"));
		    	id =Integer.parseInt(rs.getString("ID"));
		    	commerce = new Commerce(nomB,nomP,date,dure,prix,id,nomIndu,vendu);
		    	listeCommerce.ajouterCommerce(commerce);
		      }
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		
		synchronized(this){
		session.setAttribute("LCommerce", listeCommerce.getVecCommerce());
		}
		request.getRequestDispatcher("VueCommerceInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package controleur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginPServlet
 */
@WebServlet("/LoginPServlet")
public class LoginPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public LoginPServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String adresseM = request.getParameter("adresseM");
		String cle = request.getParameter("cle");
		int flagC = 0;

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
		      Statement st = connect.createStatement();
		      ResultSet rs = st.executeQuery("select * from producteur_info");
		      flagC = 0;
		      while(rs.next()){
		    	  System.out.println(rs.getString("adresseMailP"));
		    	  System.out.println(adresseM);
		    	  if (rs.getString("adresseMailP").equals(adresseM)){
		    		  flagC = 1;
		    		  
		    		  System.out.println(rs.getString("cleP"));
			    	  System.out.println(cle);
			    	  if (rs.getString("cleP").equals(cle)){
		    			  flagC = 2;
		    		  }
		    		  
		    		  System.out.println("client connu!");
		    		  
		    	  }
		    	  else{
		    		  flagC = 0;
		    	  }
		    	  System.out.println(flagC);  
		      }
		     
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		    
		synchronized(this){    
			session.setAttribute("flagC", flagC);
			session.setAttribute("adresseMP", adresseM);
		}
		request.getRequestDispatcher("VueLoginHintP.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

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

/**
 * Servlet implementation class LoginIServlet
 */
@WebServlet("/LoginIServlet")
public class LoginIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String adresseM = request.getParameter("adresseM");
		String cle = request.getParameter("cle");
		int flagI = 0;

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
		      ResultSet rs = st.executeQuery("select * from industriel_info");
		      flagI = 0;
		      while(rs.next()){
		    	  System.out.println(rs.getString("adresseMailI"));
		    	  System.out.println(adresseM);
		    	  if (rs.getString("adresseMailI").equals(adresseM)){
		    		  flagI = 1;
		    		  
		    		  System.out.println(rs.getString("cleI"));
			    	  System.out.println(cle);
			    	  if (rs.getString("cleI").equals(cle)){
		    			  flagI = 2;
		    		  }
		    		  System.out.println(flagI);
		    		  System.out.println("client connu!");
		    		  
		    	  }
		    	  
		      }
		     
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		    
		synchronized(this){   
		session.setAttribute("flagI", flagI);
		session.setAttribute("adresseMI", adresseM);
		}
		request.getRequestDispatcher("VueLoginHintI.jsp").forward(request, response);
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

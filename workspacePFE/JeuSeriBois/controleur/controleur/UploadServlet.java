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
 * Servlet implementation class UploadServlet
 */
@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		String nomB = request.getParameter("nomB");
		String prixB = request.getParameter("prixB");
		String nomP;
		synchronized(this){
		nomP = (String)session.getAttribute("adresseMP");
		}
		String date = request.getParameter("date");
		String dure = request.getParameter("dure");

		

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
		      ResultSet rs = st.executeQuery("select * from commerce");
		      
		      int count = 0;
		      while (rs.next()) {
		    	  		count++;
		      }
		      String sql="INSERT INTO commerce(ID,date_c,dure_c,nom_b,prix,nom_p,vendu,nom_i)VALUES('" + count + "','" + date + "','" + dure + "','" + nomB + "','" + Double.parseDouble(prixB) + "','" + nomP + "','non','null')";
		      int j = st.executeUpdate(sql);   
		      System.out.println(j);
		       
		     }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }

		request.getRequestDispatcher("VueUpload.jsp").forward(request, response);
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

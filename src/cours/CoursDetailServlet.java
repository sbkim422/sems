package cours;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* View 적용
 * 
 */

@WebServlet("/cours/detail.bit")
@SuppressWarnings("serial")
public class CoursDetailServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		try {
			CoursDao dao = (CoursDao)this.getServletContext()
					.getAttribute("coursDao");
			
			int no = Integer.parseInt(request.getParameter("no")); 
			
			CoursVo cours = dao.detail(no);
			System.out.println(cours.getNo());
			System.out.println(cours.getTitle());
			System.out.println(cours.getDescription());
			
			request.setAttribute("cours", cours);
			
			RequestDispatcher rd =
					request.getRequestDispatcher("/cours/detail.jsp");
			rd.forward(request, response);
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















package cours;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cours/insert.bit")
@SuppressWarnings("serial")
public class CoursInsertServlet extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	  doGet(request, response);
	}
	
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		try {
			CoursDao dao = (CoursDao)this.getServletContext()
					.getAttribute("coursDao");
			
			CoursVo vo = new CoursVo();
			vo.setTitle(request.getParameter("title"));
			vo.setDescription(request.getParameter("description"));
			vo.setHours(Integer.parseInt(request.getParameter("hours")));
			
			dao.insert(vo);
			
			RequestDispatcher rd =
					request.getRequestDispatcher("/cours/insert.jsp");
			rd.forward(request, response);
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















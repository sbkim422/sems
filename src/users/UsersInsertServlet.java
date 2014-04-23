package users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/insert.bit")
@SuppressWarnings("serial")
public class UsersInsertServlet extends HttpServlet {
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
			UsersDao dao = (UsersDao)this.getServletContext()
					.getAttribute("usersDao");
			
			UsersVo vo = new UsersVo();
			vo.setEmail(request.getParameter("email"));
			vo.setPassword(request.getParameter("password"));
			vo.setName(request.getParameter("name"));
			vo.setTel(request.getParameter("tel"));
			vo.setFax(request.getParameter("fax"));
			vo.setPostno(request.getParameter("postno"));
			vo.setAddress(request.getParameter("address"));
			vo.setPhotpath(request.getParameter("photpath"));
			
			dao.insert(vo);
			
			RequestDispatcher rd =
					request.getRequestDispatcher("/users/insert.jsp");
			rd.forward(request, response);
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















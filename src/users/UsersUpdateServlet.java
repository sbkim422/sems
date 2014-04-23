package users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/update.bit")
@SuppressWarnings("serial")
public class UsersUpdateServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		try {
			//1) DB에서 과목 상세 정보를 가져온다.
			int no = Integer.parseInt(request.getParameter("no"));
			
			UsersDao dao = (UsersDao)this.getServletContext()
					.getAttribute("usersDao");
			
			UsersVo users = dao.detail(no);
			
			request.setAttribute("users", users);
			
			RequestDispatcher rd =
					request.getRequestDispatcher("/users/updateform.jsp");
			rd.forward(request, response);
			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		// CharacterEncodingFilter로 대체함.
		//request.setCharacterEncoding("UTF-8");
		try {
			UsersDao dao = (UsersDao)this.getServletContext()
					.getAttribute("usersDao");
			
			UsersVo vo = new UsersVo();
			vo.setNo(Integer.parseInt(request.getParameter("no")));
			vo.setEmail(request.getParameter("email"));
			vo.setPassword(request.getParameter("password"));
			vo.setName(request.getParameter("name"));
			vo.setTel(request.getParameter("tel"));
			vo.setFax(request.getParameter("fax"));
			vo.setPostno(request.getParameter("postno"));
			vo.setAddress(request.getParameter("address"));
			vo.setPhotpath(request.getParameter("photpath"));
			dao.update(vo);
			
			response.sendRedirect("detail.bit?no=" + vo.getNo());
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















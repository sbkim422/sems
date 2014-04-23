package cours;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cours/update.bit")
@SuppressWarnings("serial")
public class CoursUpdateServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		try {
			//1) DB에서 과목 상세 정보를 가져온다.
			int no = Integer.parseInt(request.getParameter("no"));
			
			CoursDao dao = (CoursDao)this.getServletContext()
					.getAttribute("coursDao");
			
			CoursVo cours = dao.detail(no);
			
			request.setAttribute("cours", cours);
			
			RequestDispatcher rd =
					request.getRequestDispatcher("/cours/updateform.jsp");
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
			CoursDao dao = (CoursDao)this.getServletContext()
					.getAttribute("coursDao");
			
			CoursVo vo = new CoursVo();
			vo.setNo(Integer.parseInt(request.getParameter("no")));
			vo.setTitle(request.getParameter("title"));
			vo.setDescription(request.getParameter("description"));
			vo.setHours(Integer.parseInt(request.getParameter("hours")));
			
			dao.update(vo);
			
			response.sendRedirect("detail.bit?no=" + vo.getNo());
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















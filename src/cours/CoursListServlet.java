package cours;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* View(JSP) 적용
 * - 이 클래스가 하던 일 중에서 출력 부분을 JSP에 위임함
 * - JSP구조의 완성!
 */

@WebServlet("/cours/list.bit")
@SuppressWarnings("serial")
public class CoursListServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		
		try {
			CoursDao dao = (CoursDao)this.getServletContext()
																			.getAttribute("coursDao");
			
			int pageNo = Integer.parseInt(request.getParameter("pageNo")); 
			int pageSize = Integer.parseInt(request.getParameter("pageSize")); 
			
			List<CoursVo> list = dao.list(pageNo, pageSize);
			
			// ServletRequest 보관소 DAO 리턴 결과를 보관한다.
			// JSP가 사용할 수 있도록
			request.setAttribute("list", list);
			
			// JSP에 실행을 위임하기 => RequestDispatcher를 얻는다.
			// - 파라미터는 반드시 현재 컨텍스트(웹 애플리케이션 루트)를 기준으로 할 것.
			RequestDispatcher rd =
					request.getRequestDispatcher("/cours/list.jsp");
			rd.forward(request, response);
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}

















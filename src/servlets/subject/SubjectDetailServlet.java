package servlets.subject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.CourseVo;
import dao.CourseDao;

@WebServlet("/course/detail.bit")
@SuppressWarnings("serial")
public class SubjectDetailServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>교육과정 상세정보</title></head><body>");
		try {
			out.println("<h1>교육과정 상세정보</h1>");
			
			CourseDao dao = (CourseDao)this.getServletContext()
					.getAttribute("courseDao");
			
			int no = Integer.parseInt(request.getParameter("no")); 
			
			CourseVo subject = dao.detail(no);
			
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("	<th>교육과정번호</th>");
			out.println("	<td>" + subject.getNo() + "</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("	<th>과정명</th>");
			out.println("	<td>" + subject.getTitle() + "</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("	<th>설명</th>");
			out.println(" <td><textarea rows='5' cols='60'>"
					+ subject.getDescription()
					+ "</textarea></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("	<th>교육시간</th>");
			out.println("	<td>" + subject.getHour() + "</td>");
			out.println("</tr>");
			
			out.println("</table>");
		} catch (Throwable e) {
			out.println("오류 발생 했음!");
			e.printStackTrace();
		}
		out.println("</body></html>");
	}
}

















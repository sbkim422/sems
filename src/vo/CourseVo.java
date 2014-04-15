package vo;

public class CourseVo {
	int no;
	String title;
	String dest;
	int hour;
	
	public int getNo() {
		return no;
	}
	
	public CourseVo setNo(int no) {
		this.no = no;
		return this;
	}
	
	public String getTitle() {
		return title;
	}
	
	public CourseVo setTitle(String title) {
		this.title = title;
		return this;
	}
	
	public String getDest() {
		return dest;
	}
	
	public CourseVo setDest(String dest) {
		this.dest = dest;
		return this;
	}
	
	public int getHour() {
		return hour;
	}
	
	public CourseVo setHour(int hour) {
		this.hour = hour;
		return this;
	}
	
}

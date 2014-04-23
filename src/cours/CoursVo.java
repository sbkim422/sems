package cours;

/* setter/getter 적용 <= 캡슐화
 */
public class CoursVo {
	private int 				no;				
	private String			title;   
	private String			description;
	private int 				hours;
	
	public int getNo() {
		return no;
	}
	public CoursVo setNo(int no) {
		this.no = no;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public CoursVo setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public CoursVo setDescription(String description) {
		this.description = description;
		return this;
	}
	public int getHours() {
		return hours;
	}
	public CoursVo setHours(int hours) {
		this.hours = hours;
		return this;
	}
	
	
	
}









package users;

/* setter/getter 적용 <= 캡슐화
 */
public class UsersVo {
	private int 				no;				
	private String			email;   
	private String			password;
	private String 			name;
	private String 			tel;
	private String 			fax;
	private String 			postno;
	private String 			address;
	private String 			photpath;
	
	public int getNo() {
		return no;
	}
	public UsersVo setNo(int no) {
		this.no = no;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public UsersVo setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public UsersVo setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getName() {
		return name;
	}
	public UsersVo setName(String name) {
		this.name = name;
		return this;
	}
	public String getTel() {
		return tel;
	}
	public UsersVo setTel(String tel) {
		this.tel = tel;
		return this;
	}
	public String getFax() {
		return fax;
	}
	public UsersVo setFax(String fax) {
		this.fax = fax;
		return this;
	}
	public String getPostno() {
		return postno;
	}
	public UsersVo setPostno(String postno) {
		this.postno = postno;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public UsersVo setAddress(String address) {
		this.address = address;
		return this;
	}
	public String getPhotpath() {
		return photpath;
	}
	public UsersVo setPhotpath(String photpath) {
		this.photpath = photpath;
		return this;
	}
	
	
	
}









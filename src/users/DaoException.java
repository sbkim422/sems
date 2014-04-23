package users;

@SuppressWarnings("serial")
public class DaoException extends Error{
	public DaoException(String msg){
		super(msg); // 에러 클래스가 가지고 있는 생성자에 저장시킴
	}
	
	public DaoException(Throwable cause){
		super(cause);
	}
}

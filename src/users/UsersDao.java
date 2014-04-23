package users;

import java.util.List;

import users.UsersVo;

public interface UsersDao {
		UsersVo getUsers(String email, String password);
		void insert(UsersVo users) throws Throwable;
		List<UsersVo> list(int pageNo, int pageSize) throws Throwable;
		UsersVo detail(int no) throws Throwable;
		void update(UsersVo users) throws Throwable;
		void delete(int no) throws Throwable;
}










package cours;

import java.util.List;

public interface CoursDao {
	void insert(CoursVo cours) throws Throwable;
	List<CoursVo> list(int pageNo, int pageSize) throws Throwable;
	CoursVo detail(int no) throws Throwable;
	void update(CoursVo cours) throws Throwable;
	void delete(int no) throws Throwable;
}










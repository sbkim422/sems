package episode;

import java.lang.annotation.Annotation;

public class Test01 {

	public static void main(String[] args) {
		//누가? 언제?
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
	  
		// 1) 클래스 정보를 다룰 객체를 얻는다.
		//Class clazz = s.getClass(); // 방법1 인스턴스로부터 얻기
		Class clazz = Student.class; // class 히든변수 Class clazz의 변수가 담겨있음 방법2. 클래스 변수로부터 얻기
		
		//Annotation[] annotations = clazz.getAnnotations();
		//ClassInfo ci = (ClassInfo)annotation[0];
		ClassInfo ci = (ClassInfo) clazz.getAnnotation(ClassInfo.class);
		System.out.println(ci.value());
		System.out.println(ci.author());
		System.out.println(ci.createdDate());
		System.out.println(ci.version());
		
		}
	
	public static void main01(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		// 클래스에 대한 정보를 클래스 변수를 통해 추출하는 것은
		// 바락짐하지 않다.
		//System.out.println(Student.author);
		//System.out.println(Student.createdDate);
	}
}	

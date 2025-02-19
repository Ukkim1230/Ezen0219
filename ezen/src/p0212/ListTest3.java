package p0212;

import java.util.ArrayList;

/*5개의 Student변수를 만들어서
 * List에 넣어주세요
 * 해당 ArrayList를 출력해주시면 됩니다.
 */
/*
 * 최용규 1 이젠
 * 김철수 2 이젠
 * 홍길동 2 이젠
 * 임꺽정 3 이젠
 * 최준호 1 이젠
 */
public class ListTest3 {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("최용규");
		s1.setGrade(1);
		s1.setSchoolName("이젠");

		Student s2 = new Student();
		s2.setName("김철수");
		s2.setGrade(2);
		s2.setSchoolName("이젠");

		Student s3 = new Student();
		s3.setName("홍길동");
		s3.setGrade(2);
		s3.setSchoolName("이젠");

		Student s4 = new Student();
		s4.setName("임꺽정");
		s4.setGrade(3);
		s4.setSchoolName("이젠");

		Student s5 = new Student();
		s5.setName("최준호");
		s5.setGrade(1);
		s5.setSchoolName("이젠");

		ArrayList<Student> st = new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		for(Student s:st)
			
			if(s.getName().startsWith("최") || s.getSchoolName().equals("이젠")) {
				System.out.println(s);

		//for (Student s : st) {
			// 성이 최씨인사람만 출력해주세요.
			//if (s.getName().indexOf("최") == 0) {// subString(0,1) 0~0까지 (0,2)는 0에서1까지
				// if(name.startsWith("최")){
				//System.out.println(s);
			}
	}
}
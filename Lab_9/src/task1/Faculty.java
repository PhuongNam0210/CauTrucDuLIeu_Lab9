package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses = new ArrayList<>();

	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	
	public Course getMaxPracticalCourse() {
		
		Course maxCourse = null;
		for (Course course : courses) {
			if (course.getType().equals("Thuc Hanh")) {
				if (maxCourse == null) {
					maxCourse = course;
				} else {
					if(course.getStudents().size() > maxCourse.getStudents().size()) {
						maxCourse = course;
					}
				}
			}
		}
		return maxCourse;
	}
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> m1 = new HashMap<>();
		for (int i = 0; i < courses.size(); i++) {
			for (Student s : courses.get(i).getStudents()) {
				List<Student> students = new ArrayList<>();
				if (!m1.containsKey(s.getYear())) {
					students.add(s);
					m1.put(s.getYear(), students);
				} else {
					students = m1.get(s.getYear());
					if (!students.contains(s)) {
						students.add(s);
					}
				}
			}
		}
		return m1;
	}

	public Set<Course> filterCourses(String type) {
		TreeSet<Course> t1 = new TreeSet<>(new Comparator<Course>() {

			@Override
			public int compare(Course o1, Course o2) {
				return o2.getStudents().size() - o1.getStudents().size();
			}
		});
		for (Course arr : courses) {
			if (arr.getType().equals(type)) {
				t1.add(arr);
			}
		}
		return t1;
	}
	public static void main(String[] args) {
		Student s1 = new Student("001","Nguyen Van A", 2006);
		Student s2 = new Student("002","Nguyen Van B", 2005);
		Student s3 = new Student("003","Nguyen Van C", 2004);
		Student s4 = new Student("004","Nguyen Van D", 2003);
		Student s5 = new Student("005","Nguyen Van F", 2002);
		
		List<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		List<Student> list2 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s5);

		
		Course c1 = new Course("111", "CTDL", "Ly Thuyet", list1, "Nguyen Thi H");
		Course c2 = new Course("222", "CTDL", "Thuc Hanh", list2, "Dang Thi G");
		Course c3 = new Course("333", "GTNM", "Ly Thuyet", list1, "Dang Thi G");
		
		List<Course> list3 = new ArrayList<>();
		list3.add(c1);
		list3.add(c2);
		list3.add(c3);
		
		Faculty f1 = new Faculty("IT", "Linh Trung", list3);
		Faculty f2 = new Faculty("CNTP", "Linh Trung", list3);
		
	
		System.out.println(f1.getMaxPracticalCourse());
		System.out.println(f2.groupStudentsByYear());
		System.out.println(f1.filterCourses("Thuc Hanh"));
	}

}

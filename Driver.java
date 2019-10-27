package enrollment;

public class Driver {
	
	public static void main(String[] args) { 
		
		Course course1 = new Course("1h","s", 4.4, "ss", "sa");
		Course course2 = new Course("2h","s", 4.5, "ss", "sa");
		Course course3 = new Course("3h","s", 4.6, "ss", "sa");
		Course course4 = new Course("4h","s", 4.7, "ss", "sa");
		Course course5 = new Course("5h","s", 4.7, "ss", "sa");
		
		CourseList course = new CourseList();
		

		
		course.addToStart(course5);
		course.insertAtIndex(course2, 1);
		course.insertAtIndex(course3, 2);
		course.addToStart(course4);
		course.addToStart(course1);
		course.addToStart(course5);
	
		course.replaceAtIndex(course1, 0);
		
		course.printList();
	
		
		
	
	
		
	
		
		
		
		
		
		
		
	}

}

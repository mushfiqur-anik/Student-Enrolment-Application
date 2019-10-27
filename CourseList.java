package enrollment;

// Outer Class
public class CourseList {

	// Innner Class
	public class CourseNode {

		// Attributes
		private Course obj;
		private CourseNode nextCourse;

		// Default Constructor
		public CourseNode() {
			this.obj = null;
			this.nextCourse = null;
		}

		// Parameterized Constructor
		public CourseNode(Course obj, CourseNode nextCourse) {
			this.obj = obj;
			this.nextCourse = nextCourse;
		}

		// Getters and Setters
		public Course getObj() {
			return obj;
		}

		public void setObj(Course obj) {
			this.obj = obj;
		}

		public CourseNode getNextCourse() {
			return nextCourse;
		}

		public void setNextCourse(CourseNode nextCourse) {
			this.nextCourse = nextCourse;
		}
	}

	// START OF COURSELIST
	private CourseNode head;
	private int size = 0;

	// Default Constructor
	public CourseList() {
		
		head = new CourseNode();
	}

	// Copy Constructor

	// addToStart Method
	public void addToStart(Course obj) {
		
		// Creates a new node assign previous head as this node's next, assign this node as the new head
		CourseNode node = new CourseNode(obj, head);
		head = node;
		size++;
	}

	// insertAtIndex()
	public void insertAtIndex(Course obj, int index) {

		// Check for valid index
		if (index < 0) {
			// Throw NoSuchElementException
		}

		else if (index > size) {
			System.out.println("Index greater than size!!");

		}

		else {

			CourseNode node;
			CourseNode tNode = new CourseNode();
			tNode = head;

			// Finds out the indexed node
			for (int i = 0; i < index - 1; i++) {
				tNode = tNode.nextCourse;
			}

			// Create new node and assign previous index's next to this new index's next
			// Assign previous index's next to this new node
			node = new CourseNode(obj, tNode.nextCourse);
			tNode.nextCourse = node;
			size++;

		}

	}

	// deleteFromIndex
	public void deleteFromIndex(int index) {

		// Check for valid index of if head is null
		if (head == null || index < 0) {
			// Throw NoSuchElementException
		}

		else if (index > size) {
			System.out.println("Index greater than size!!");

		}

		else {
			CourseNode temp = new CourseNode();
			CourseNode node = new CourseNode();
			node = head;

			for (int i = 0; i < index - 1; i++) {
				node = node.nextCourse;
			}

			// Store the soon to be deleted index's next to container
			// assign the soon to be deleted index's next as the previous index's next
			// Decrement size
			temp = node.nextCourse.nextCourse;
			node.nextCourse = temp;
			size--;
			
		}

	}

	// deleteFromStart
	public void deleteFromStart() {

		if (head == null) {
			// Throw Exception
		}

		else {
			
			// Assign the head's next course as the new head
			// Decrement size
			head = head.nextCourse;
			size--;
		}
	}

	// replaceAtIndex()
	public void replaceAtIndex(Course obj, int index) {

		CourseNode node = new CourseNode();
		node = head;
		CourseNode tempNode;

		// Check for valid index
		if (index < 0 || index > size) {
			// Do nothing
		}

		 
		else if (index == 0) {
			tempNode = new CourseNode(obj, node.nextCourse);
			head = tempNode;

		}

		else {
			for (int i = 0; i < index - 1; i++) {
				node = node.nextCourse;
			}

			tempNode = new CourseNode(obj, node.nextCourse.nextCourse);
			node.nextCourse = tempNode;
		}

	}

	// find method
	public String find(String courseID) {
		CourseNode node = new CourseNode();
		node = head;
		int iterations = 0;

		for (int i = 0; i < size; i++) {

			if (node.obj.courseID == courseID) {

				return "After " + iterations + " iterations : " + node.obj.toString();

			}

			node = node.nextCourse;
			iterations++;

		}

		return ("No such courses were found after " + iterations + " iterations");

	}

	// Print LinkedList
	public void printList() {
		CourseNode node = new CourseNode();
		node = head;

		if (head == null) {
			System.out.println("The list is empty!!!");
		}

		else {
			while (node.nextCourse != null) {
				System.out.println(node.obj);
				node = node.nextCourse;
			}

			System.out.println(node.obj);
		}

	}

	// contains method
	public boolean contains(String courseID) {
		
		CourseNode node = new CourseNode();
		node = head;

		for (int i = 0; i < size; i++) {

			if (courseID == node.obj.courseID) {
				return true;
			}
			
			node = node.nextCourse;

		}
		
		if (courseID == node.obj.courseID) {
			return true;
		}

		return false;

	}
	
	
	

}

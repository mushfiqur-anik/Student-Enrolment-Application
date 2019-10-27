package enrollment;

import java.util.Scanner;

public class Course implements DirectlyRelatable, Cloneable {

	// Attributes
	protected String courseID;
	protected String courseName;
	protected double credit;
	protected String preReqID;
	protected String coReqID;
	protected String newCourseID;

	Scanner keyboard = new Scanner(System.in);

	// Default Constructor
	public Course() {
		this.courseID = null;
		this.courseName = null;
		this.credit = 0.0;
		this.preReqID = null;
		this.coReqID = null;
	}

	// Parametized Constructor
	public Course(String courseID, String courseName, double credit, String preReqID, String coReqID) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.credit = credit;
		this.preReqID = preReqID;
		this.coReqID = coReqID;
	}

	// Copy Constructor
	public Course(Course obj, String value) {
		this.courseID = value;
		this.courseName = obj.courseName;
		this.credit = obj.credit;
		this.preReqID = obj.preReqID;
		this.coReqID = obj.coReqID;
	}

	// Clone method
	public Object clone(Course obj) throws CloneNotSupportedException {

		// Promting the user for new courseID;
		System.out.println();
		newCourseID = keyboard.next();

		Course newCourse = new Course(obj, newCourseID);

		return newCourse.clone();
	}
	
	
	// isDirectlyRelated 
	public boolean isDirectlyRelated(Course C) {
		return (this.preReqID == C.preReqID || this.coReqID == C.coReqID);
	}

	// toString method
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", credit=" + credit + ", preReqID="
				+ preReqID + ", coReqID=" + coReqID + "]";
	}

	// equals method
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Course other = (Course) obj;

		if (coReqID == null) {
			if (other.coReqID != null)
				return false;
		} else if (!coReqID.equals(other.coReqID))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (Double.doubleToLongBits(credit) != Double.doubleToLongBits(other.credit))
			return false;
		if (keyboard == null) {
			if (other.keyboard != null)
				return false;
		} else if (!keyboard.equals(other.keyboard))
			return false;
		if (newCourseID == null) {
			if (other.newCourseID != null)
				return false;
		} else if (!newCourseID.equals(other.newCourseID))
			return false;
		if (preReqID == null) {
			if (other.preReqID != null)
				return false;
		} else if (!preReqID.equals(other.preReqID))
			return false;
		return true;
	}

	// Getters and Setters
	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public String getPreReqID() {
		return preReqID;
	}

	public void setPreReqID(String preReqID) {
		this.preReqID = preReqID;
	}

	public String getCoReqID() {
		return coReqID;
	}

	public void setCoReqID(String coReqID) {
		this.coReqID = coReqID;
	}


}

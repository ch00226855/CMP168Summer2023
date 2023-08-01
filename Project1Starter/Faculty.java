
public class Faculty extends Employee {
	
	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	
	public Faculty() {
		super();
		initializeCoursesAndTenure(false);
	}
	
	public Faculty(boolean isTenured) {
		super();
		initializeCoursesAndTenure(isTenured);
	}
	
	public Faculty(String deptName, boolean isTenured) {
		super(deptName);
		initializeCoursesAndTenure(isTenured);
	}
	
	public Faculty(String name, int birthYear,
					String deptName, boolean isTenured) {
		super(name, birthYear, deptName);
		initializeCoursesAndTenure(isTenured);
	}
	
	private void initializeCoursesAndTenure(boolean isTenured) {
		this.coursesTaught = new Course[100];
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}

	public boolean isTenured() {
		return isTenured;
	}

	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	
	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}
	
	public void addCourseTaught(Course course) {
		this.coursesTaught[this.numCoursesTaught] = course;
		this.numCoursesTaught++;
	}
	
	public void addCoursesTaught(Course[] courses) {
		for (int i = 0; i < courses.length; i++) {
			addCourseTaught(courses[i]);
		}
	}
	
	public Course getCourseTaught(int index) {
		if (isCourseIndexValid(index)) {
//			return this.coursesTaught[index]; // WARNING: Returning the course itself allows other user to modify it.
			Course course = this.coursesTaught[index];
			Course clone = new Course(course.isGraduateCourse(), course.getCourseNum(), 
					course.getCourseDept(), course.getNumCredits());
			return clone;
		} else {
			return null;
		}
	}
	
	public String getCourseTaughtAsString(int index) {
		if (isCourseIndexValid(index)) {
			return this.coursesTaught[index].toString();
		} else {
			return "";
		}
	}
	
	public String getAllCoursesTaughtAsString() {
		String str = "";
		for (int i = 0; i < this.numCoursesTaught; i++) {
			if (i != this.numCoursesTaught - 1) {// not the last course
				str += this.coursesTaught[i].toString() + ", ";
			} else {
				str += this.coursesTaught[i].toString();
			}
		}
		return str;
	}
	
	private boolean isCourseIndexValid(int index) {
		return (index >= 0) && (index < this.numCoursesTaught);
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		String tenure = (this.isTenured ? "Is Tenured" : "Not Tenured");
		str += String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s",
								tenure, this.numCoursesTaught, this.getAllCoursesTaughtAsString());
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Faculty)) {
			return false;
		} else {
			Faculty fObj = (Faculty) obj;
			if (super.equals(fObj) && 
				(this.coursesTaught == fObj.coursesTaught) &&
				(this.isTenured == fObj.isTenured) &&
				(this.getAllCoursesTaughtAsString().equals(fObj.getAllCoursesTaughtAsString()))) {
				return true;
			} else {
				return false;
			}
		}
	}

	public int compareTo (Faculty obj) {
		return (this.numCoursesTaught - obj.numCoursesTaught);
	}

}

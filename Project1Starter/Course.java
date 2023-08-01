
public class Course implements Comparable<Course>{
	
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean isGraduateCourse, 
					int courseNum, 
					String courseDept, 
					int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	
	public String getCourseName() {
		if (isGraduateCourse) {
			return "G" + courseDept + courseNum;
		} else {
			return "U" + courseDept + courseNum;
		}
	}
	
	
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		} else if (!(obj instanceof Course)) {
			return false;
		} else {
			Course course = (Course) obj;
			if ((this.isGraduateCourse == course.isGraduateCourse) &&
				(this.courseDept.equals(course.courseDept)) &&
				(this.courseNum == course.courseNum) &&
				(this.numCredits == course.numCredits)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	@Override
	public String toString() {
		String isGraduateString = (this.isGraduateCourse ? "Graduate" : "Undergraduate");
		return String.format("Course: %3s-%3d | Number of Credits: %02d  | %s",
						courseDept, courseNum, numCredits, isGraduateString);
	}
	
	@Override
	public int compareTo(Course course) {
		if (this.courseNum < course.courseNum) {
			return -1;
		} else if (this.courseNum > course.courseNum) {
			return 1;
		} else {
			return 0;
		}
		
		//Alternative:
//		return (this.courseNum - course.courseNum);
	}
}

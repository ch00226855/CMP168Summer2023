import java.util.Scanner;

public class MenuDemo {
	
	private static Course[] courses = new Course[100];
	private static int numCourses;
	private static Faculty[] faculties = new Faculty[100];
	private static int numFaculties;

	public static void main(String[] args) {
		// Create a menu so that the user can interact with the database.
		// 1. Create a new course
		// 2. Display all objects
		// 3. Add a course to a faculty member
		// 4. Query if a faculty member is teaching a course.
		// 5. Quit
		Scanner keyboard = new Scanner(System.in);
		int userChoice = -1;
		
		while(userChoice != 5) {
			
			// Display the menu.
			displayMenu();
			
			// Get user input
			try {
				userChoice = getUserInput(keyboard);
				
				switch(userChoice) {
				case 1:
					addCourse(keyboard);
					break;
				case 2:
					displayAllObjects();
					break;
					
				case 5:
					break;
				default:
					System.out.println("Invalid choice!");
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				keyboard.nextLine();
				continue;
			}
			

			
			
		}
		
	}
	
	public static void displayMenu() {
		System.out.println("****************************");
		System.out.println("**1. Create Course        **");
		System.out.println("**2. Display all objects  **");
		System.out.println("**3. Add Course to Faculty**");
		System.out.println("**4. Query for instructor **");
		System.out.println("**5. Quit                 **");
		System.out.println("****************************");
	}
	
	public static int getUserInput(Scanner keyboard) throws Exception {
		System.out.println("Your choice: ");
		int userChoice = keyboard.nextInt();
		keyboard.nextLine(); // Exhaust the remaining part of the line.
		if (userChoice > 0 && userChoice <= 5) {
			return userChoice;
		} else {
			throw new Exception("Invalid choice: " + userChoice);
		}
	}
	
	public static void addCourse(Scanner keyboard) throws Exception {

		System.out.println("Is this a graduate course? (Y/N): ");
		char response1 = keyboard.nextLine().charAt(0);
		boolean isGraduateCourse = (response1 == 'Y' ? true : false);
		
		System.out.println("Enter the course number: ");
		int courseNum = keyboard.nextInt();
		keyboard.nextLine(); // Exhaust the remaining part of the line.
		
		System.out.println("Enter the department: ");
		String courseDept = keyboard.nextLine();
		
		System.out.println("Enter the number of credits: ");
		int numCredits = keyboard.nextInt();
		keyboard.nextLine();
		
		courses[numCourses] = new Course(isGraduateCourse, courseNum, courseDept, numCredits);
		numCourses++;
		System.out.println("A new course is added to the database.");
	}
	
	public static void displayAllObjects() {
		// Print all courses
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i].toString());
		}
	}

}

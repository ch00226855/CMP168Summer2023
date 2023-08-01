import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DatabaseBuilder {
	
	private static Course[] courses = new Course[10];
	private static int numCourses = 0;
	private static Faculty[] faculties = new Faculty[10];
	private static int numFaculties = 0;

	public static void main(String[] args) {
		
		// Read from the initial file and create all objects.
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
			file = new FileInputStream("SchoolDB_Initial.txt");
//			file = new FileInputStream("new_data.txt");
			scnr = new Scanner(file);
			
//			readFileAndPrint(scnr);
			readFilePrintCreate(scnr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
				scnr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Write objects information to a file.
		FileOutputStream outFile = null;
		PrintWriter pw = null;
		
		try {
			outFile = new FileOutputStream("new_data.txt");
			pw = new PrintWriter(outFile);
			
			writeObjectsToFile(pw);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				outFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void readFileAndPrint(Scanner scnr) {
		while(scnr.hasNext()) {
			System.out.println(scnr.nextLine());
		}
	}
	
	private static void readFilePrintCreate(Scanner scnr) {
		while(scnr.hasNext()) {
			String line = scnr.nextLine().strip();
			System.out.println(line);
			
			// Identify the record in the line.
			if (line.equals("")) {
//				System.out.println("This is an empty line.");
				continue;
			} 
			
			int indexColon = line.indexOf(":");
			String className = line.substring(0, indexColon);
//			System.out.println("Class name: " + className);
			
			// Parse the list of parameters
			String paramsString = line.substring(indexColon + 1);
			String[] params = paramsString.split(",");
			
			// Go through the parameters and remove spaces
			for (int i = 0; i < params.length; i++) {
				params[i] = params[i].strip();
			}
			
			if (className.equals("Course")) {
//				System.out.println("params[0] before parsing: " + params[0]);
//				System.out.println("params[0] after parsing: " + Boolean.parseBoolean(params[0]));
				courses[numCourses] = new Course(Boolean.parseBoolean(params[0]), 
												Integer.parseInt(params[1]), 
												params[2], 
												Integer.parseInt(params[3]));
//				System.out.println(courses[numCourses].isGraduateCourse());
//				System.out.println(courses[numCourses].toString());
				numCourses++;
			} else if (className.equals("Faculty")) {
				switch(params.length) {
				case 0:
					faculties[numFaculties] = new Faculty();
					break;
				case 1:
					faculties[numFaculties] = new Faculty(Boolean.parseBoolean(params[0]));
					break;
				case 2:
					faculties[numFaculties] = new Faculty(params[0], Boolean.parseBoolean(params[1]));
					break;
				case 4:
					faculties[numFaculties] = new Faculty(params[0],
															Integer.parseInt(params[1]),
															params[2],
															Boolean.parseBoolean(params[3]));
					break;
				default:
					System.out.println("Incorrect number of arguments given for a faculty!");
				}
				numFaculties++;
			}
			
			
		}
		System.out.println("Printing out all faculty objects:");
		for (int i = 0; i < numFaculties; i++) {
			System.out.println(faculties[i].toString());
		}
	}
	
	public static void writeObjectsToFile(PrintWriter pw) {
		// Write all course objects.
		for (int i = 0; i < numCourses; i++) {
			String line = "Course: ";
			line += courses[i].isGraduateCourse() + ", ";
			line += courses[i].getCourseNum() + ", ";
			line += courses[i].getCourseDept() + ", ";
			line += courses[i].getNumCredits();
			pw.println(line);
		}
		
		// Write all faculty objects.
		for (int i = 0; i < numFaculties; i++) {
			String line = "Faculty: ";
			line += faculties[i].getName() + ", ";
			line += faculties[i].getBirthYear() + ", ";
			line += faculties[i].getDeptName() + ", ";
			line += faculties[i].isTenured();
			pw.println(line);
		}
	}

}


public class Person implements Comparable<Person> {

	private String name;
	private int employeeID;
	private int birthYear;
	
	public Person() {
		this.name = "";
		this.birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		} else if (!(obj instanceof Person)) {
			return false;
		} else {
			Person person = (Person) obj;
			if ((this.name.equals(person.name)) &&
				(this.birthYear == person.birthYear)) {
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
	}
	
	@Override
	public int compareTo(Person person) {
		if (this.birthYear < person.birthYear) {
			return -1;
		} else if (this.birthYear > person.birthYear) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
}

package week1day4;

public class Restaurant extends Business {
	
	private int rating;
	
	public Restaurant() {
//		this.setName("");
//		this.setAddress("");
		super(); //super() refers to the constructor of
				// the base class.
		// If name and address are protected variables, we can
		// use them directly.
		super.name = "****";
		this.address = "****";
		
		rating = -1;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void printInfo() {
		System.out.println(super.getDescription() + " - " 
				 + this.rating);
		// super.getDescription() refers to the getDescription()
		// method defined in the Business class.
	}
	
	@Override
	public String getDescription() {
		return this.name + " - " + this.address + " - " +
					this.rating;
	}
	
	public void temp() {
		System.out.println(super.getDescription());
	}
	
	@Override
	public String toString() {
		// Use formatted string to induce alignment.
		return String.format("Name: %20s | Address: %20s | Rating: %d",
				this.name, this.address, this.rating);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {// the original equals() method checks if the 
								// two objects refers to the same thing in memory.
			return true;
		} else if (!(obj instanceof Restaurant)) {
			return false;
		} else {
			Restaurant rObj = (Restaurant) obj;
			if (this.toString().equals(rObj.toString())) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}

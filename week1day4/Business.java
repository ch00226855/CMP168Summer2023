package week1day4;

public class Business {
	
	protected String name;
	protected String address;
	
	public Business() {
		this.name = "Not Specified";
		this.address = "Not specified";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDescription() {
		return this.name + " - " + this.address;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.address;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//1. Call super.equals() to access whether they are the same
		//   object stored in the memory.
		if (super.equals(obj)) {
			return true;
		} else {
			// 2. Check of obj is a Business object
			if (!(obj instanceof Business)) {
				return false;
			} else {
				// Convert obj from Object type to Business type
				Business bObj = (Business) obj;
				if (this.getDescription().equals(bObj.getDescription())) {
					return true;
				} else {
					return false;
				}
			}
			
		}
		
	}
}

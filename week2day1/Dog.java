package week2day1;

public class Dog extends Pet {
	
	private String favorateToy;
	
	public Dog(String name,
				String favorateFood,
				String favorateToy) {
		super(name, favorateFood, true);
		this.favorateToy = favorateToy;
	}
	
	@Override
	public void play() {
		System.out.println(this.getName() + " plays with " + 
					this.getFavorateToy() + ".");
	}
	
	@Override
	public String toString() {
		
		return (super.toString() + " | Favorate Toy: " 
					+ this.favorateToy);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Dog)) {
			return false;
		} else {
			Dog dObj = (Dog) obj;
			if (super.equals(dObj) && 
				this.favorateToy.equals(dObj.getFavorateToy())) {
				return true;
			} else {
				return false;
			}
		}
		
	}

	public String getFavorateToy() {
		return favorateToy;
	}

	public void setFavorateToy(String favorateToy) {
		this.favorateToy = favorateToy;
	}
	
	

}

package week2day1;

public abstract class Pet {
	
	private String name;
	private String favorateFood;
	private boolean goesOutside;
	
	public Pet(String name,
				String favorateFood,
				boolean goesOutside) {
		this.name = name;
		this.favorateFood = favorateFood;
		this.goesOutside = goesOutside;
	}
	
	public abstract void play();
	
	@Override
	public String toString() {
		String str = String.format(
			"Name: %20s | Favorate Food: %20s | Like going outside: ",
			this.name, this.favorateFood
		);
		if (this.goesOutside) {
			str += " Yes";
		} else {
			str += " No";
		}
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		} else if (!(obj instanceof Pet)) {
			return false;
		} else {
			Pet pObj = (Pet)obj;
			if (this.name.equals(pObj.getName()) &&
				this.favorateFood.equals(pObj.getFavorateFood()) &&
				this.goesOutside == pObj.goesOutside()) {
				return true;
			} else {
				return false;
			}
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavorateFood() {
		return favorateFood;
	}

	public void setFavorateFood(String favorateFood) {
		this.favorateFood = favorateFood;
	}

	public boolean goesOutside() {
		return goesOutside;
	}

	public void setGoesOutside(boolean goesOutside) {
		this.goesOutside = goesOutside;
	}
	
	

}

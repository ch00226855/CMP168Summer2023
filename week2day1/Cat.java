package week2day1;

public class Cat extends Pet {
	
	private String favorateWeather;
	
	public Cat(String name,
				String favorateFood,
				String favorateWeather) {
		super(name, favorateFood, false);
		this.favorateWeather = favorateWeather;
	}
	
	@Override
	public void play() {
		System.out.println(this.getName() + 
				" plays with a toy mouse.");
	}
	
	@Override
	public String toString() {
		return super.toString() + " | Favorate Weather: " 
				+ this.favorateWeather;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cat)) {
			return false;
		} else {
			Cat cObj = (Cat) obj;
			if (super.equals(obj) &&
				this.favorateWeather.equals(cObj.getFavorateWeather())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public String getFavorateWeather() {
		return favorateWeather;
	}

	public void setFavorateWeather(String favorateWeather) {
		this.favorateWeather = favorateWeather;
	}
	
	

}

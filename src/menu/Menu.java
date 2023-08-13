package menu;

public class Menu {
	  
	  private int foodNumber;
	  private String foodName;
	  private String foodType;
	  private int salary;
	  
	  public Menu() {}

	public Menu(int foodNumber, String foodName, String foodType, int salary) {
		super();
		this.foodNumber = foodNumber;
		this.foodName = foodName;
		this.foodType = foodType;
		this.salary = salary;
	}

	public int getFoodNumber() {
		return foodNumber;
	}

	public void setFoodNumber(int foodNumber) {
		this.foodNumber = foodNumber;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Menu [foodNumber=" + foodNumber + ", foodName=" + foodName + ", foodType=" + foodType + ", salary="
				+ salary + "]";
	}

	
	
}

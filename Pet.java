
//Declares the pet class
public class Pet {
	//creates the instance variables
	private String name;
	private int age;  
	private String location; 
	private String type; 

	//creates the empty constructor
	public Pet()
	{
	}
	//creates the constructor with three arguments
	public Pet(String name, int age, String location, String type)
	{
		this.age = age;
		this.name = name;
		this.location = location;
		this.type = type;
	}
	//Retrieves the name variable and returns it
	public String getName() {
		return name;
	}
	//Retrieves the age variable and returns it
	public int getAge() {
		return age;
	}
	//Retrieves the type variable and returns it
	public String getType() {
		return type;
	} 
	
	//alters the name of the variable to the new one
	public void setName(String name) {
		this.name = name;
	}
	//alters the age of the variable to the new one
	public void setAge(int age) {
		this.age = age;
	}
	//alters the location of the variable to the new one
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}

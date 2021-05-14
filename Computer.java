//Declares the computer class
public class Computer {
	//creates the instance variables
	private int memory_capacity;
	private int hard_disk_capacity; 
	private double processor_speed;
	//creates the empty constructor
	public Computer()
	{
		
	}
	//creates the constructor with two arguments
	public Computer(int memory, double speed)
	{
		this.memory_capacity = memory; 
		this.processor_speed = speed;
	}
	//creates the constructor with three arguments
	public Computer(int memory, int hard_disk, double speed)
	{
		this.memory_capacity = memory;
		this.hard_disk_capacity = hard_disk;
		this.processor_speed = speed;
	}
	//Retrieves the memory variable and returns it
	public int getMemory_capacity() {
		return memory_capacity;
	}
	//alters the memory capacity variable to the new one
	public void setMemory_capacity(int memory_capacity) {
		this.memory_capacity = memory_capacity;
	}
	//Retrieves the hard disk private variable and returns it
	public int getHard_disk_capacity() {
		return hard_disk_capacity;
	}
	//alters the hard capacity private variable to the new one
	public void setHard_disk_capacity(int hard_disk_capacity) {
		this.hard_disk_capacity = hard_disk_capacity;
	}
	//Retrieves the processor speed private variable and returns it
	public double getProcessor_speed() {
		return processor_speed;
	}
	//alters the processor speed private variable to the new one
	public void setProcessor_speed(double processor_speed) {
		this.processor_speed = processor_speed;
	}
	//checks whether the constructed computer is complete or not and returns false/true
	public boolean isComplete()
	{
		if((memory_capacity != 0) && (hard_disk_capacity != 0) && (processor_speed != 0))
		{
		return true;
		}else
		{
			return false;
		}
	}
	//Returns a string with the specifications of the newly constructed computer
	public String specification()
	{
		return "Memory :"+this.memory_capacity+" GB Hard Disk :"+this.hard_disk_capacity+" Processor :"+this.processor_speed+" GHZ";
	}
}

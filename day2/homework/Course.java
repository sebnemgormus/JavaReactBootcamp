package homework;

public class Course {

	public Course() {
			
		}
		
	public Course (int id, String name, String instructorName, String totalTime) {  
		
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.totalTime = totalTime; 
	}
	
	int id;
	String name;
	String instructorName;
	String totalTime;
}

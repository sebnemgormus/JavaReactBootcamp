package homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C# Angular", "Engin Demirog", "2 ay"); 
		Course course2 = new Course(2, "Java React", "Engin Demirog", "2 ay"); 
		Course course3 = new Course(3, "Programlamaya Giris", "Engin Demirog", "2 ay"); 

		
		Course[] courses = {course1, course2, course3};
		
		System.out.println("KURSLAR");
		
		
		for(Course course : courses) {
					
					System.out.println("Kurs id : " + course.id + "\nKurs ad : " + course.name + "\nEgitmen : " + course.instructorName + "\nKurs süre : " + course.totalTime);
					System.out.println("---------------------------------------------------");
		}

		
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog"); 
		
		
		Instructor[] instructors = {instructor};
		
		System.out.println("EGITMENLER");
		
		
		for(Instructor ýnstructor : instructors) {
			
			System.out.println("Egitmen id : " + instructor.id + "\nEgitmen ad : " + instructor.name + " " + instructor.surname);
			System.out.println("---------------------------------------------------");
		}
		
		
		
		CourseManager courseManager = new CourseManager();
		System.out.println("ISLEMLER");
		courseManager.add(course1);
		System.out.println("---------");
		courseManager.delete(course2);
		System.out.println("---------");
		courseManager.update(course3);
		
		
	}

}

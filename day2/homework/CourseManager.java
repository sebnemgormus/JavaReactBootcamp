package homework;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi." + "Eklenen Kurs ad� : " + course.name);
	}
	public void delete(Course course) { 
		System.out.println("Kurs silindi." + "Silinen Kurs ad� : " + course.name);
	}
	public void update(Course course) {
		System.out.println("Kurs g�ncellendi." + "G�ncellenen Kurs ad� : " + course.name);
	}
}

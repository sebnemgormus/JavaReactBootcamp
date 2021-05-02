package homework;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi." + "Eklenen Kurs adý : " + course.name);
	}
	public void delete(Course course) { 
		System.out.println("Kurs silindi." + "Silinen Kurs adý : " + course.name);
	}
	public void update(Course course) {
		System.out.println("Kurs güncellendi." + "Güncellenen Kurs adý : " + course.name);
	}
}

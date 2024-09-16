import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    // Метод для добавления учителя
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Метод для редактирования учителя
    public void editTeacher(String name, String newSubject, int newAge) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                teacher.setSubject(newSubject);
                teacher.setAge(newAge);
            }
        }
    }

    // Метод для получения списка учителей
    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}


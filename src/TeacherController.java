import java.util.List;

public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    // Метод для создания нового учителя
    public void createTeacher(String name, String subject, int age) {
        Teacher teacher = new Teacher(name, subject, age);
        teacherService.addTeacher(teacher);
        teacherView.showMessage("Учитель успешно добавлен: " + teacher);
    }

    // Метод для редактирования учителя
    public void editTeacher(String name, String newSubject, int newAge) {
        teacherService.editTeacher(name, newSubject, newAge);
        teacherView.showMessage("Учитель " + name + " успешно отредактирован.");
    }

    // Метод для отображения списка учителей
    public void showAllTeachers() {
        List<Teacher> teachers= teacherService.getAllTeachers();
        teacherView.showTeachers(teachers);
    }
}


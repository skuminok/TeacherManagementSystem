import java.util.Scanner;

public class TeacherManagementApp {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        Scanner scanner = new Scanner(System.in);

        // Пример добавления и редактирования учителей
        teacherController.createTeacher("Иван Иванов", "Математика", 40);
        teacherController.createTeacher("Анна Смирнова", "Физика", 35);

        teacherController.showAllTeachers();

        teacherController.editTeacher("Иван Иванов", "Информатика", 41);

        teacherController.showAllTeachers();
    }
}

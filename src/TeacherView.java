import java.util.List;

public class TeacherView {

    // Метод для отображения списка учителей
    public void showTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    // Метод для отображения сообщения
    public void showMessage(String message) {
        System.out.println(message);
    }
}


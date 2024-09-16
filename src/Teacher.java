public class Teacher {
    private String name;
    private String subject;
    private int age;

    public Teacher(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Учитель{" +
                "ФИО:'" + name + '\'' +
                ", предмет:'" + subject + '\'' +
                ", возраст:" + age +
                '}';
    }
}


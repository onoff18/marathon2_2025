package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иван Иванович", "История");
        Student student = new Student("Василий");

        teacher.evaluate(student);

    }
}

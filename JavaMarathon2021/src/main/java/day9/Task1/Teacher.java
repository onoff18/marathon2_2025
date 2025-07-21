package day9.Task1;


public class Teacher extends Human {

    private final String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        System.out.printf("Этот человек с именем %s\n" +
                "Этот преподаватель с именем %s\n", super.getName(), super.getName());
    }
}

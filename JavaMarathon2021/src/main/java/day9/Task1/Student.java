package day9.Task1;


public class Student extends Human {

    private final String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        System.out.printf("Этот человек с именем %s\n" +
                "Этот студент с именем %s\n", super.getName(), super.getName());
    }
}

package day6;

import day4.Task1;

public class Teacher {

    private String name;
    private String academicSubject;

    public Teacher(String name, String academicSubject) {
        this.name = name;
        this.academicSubject = academicSubject;
    }

    public void evaluate(Student student) {

        String evaluation;
        int rating = Task1.randomNum(2, 5);

        switch (rating) {
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
            default:
                evaluation = "Учитель был пьян, экзамена не было";

        }

        System.out.printf("Преподаватель %s оценил студента с именем %s" +
                        " по предмету %s на оценку %s.", this.name, student.getName(),
                this.academicSubject, evaluation);

    }
}

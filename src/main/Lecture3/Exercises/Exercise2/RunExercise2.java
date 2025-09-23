package main.Lecture3.Exercises.Exercise2;

import java.util.ArrayList;

public class RunExercise2 {

    public static void main(String[] args) {
        ArrayList<Double> gradesStudent1 = new ArrayList<>();
        gradesStudent1.add(5.75);
        gradesStudent1.add(4.80);
        gradesStudent1.add(6.00);
        gradesStudent1.add(5.20);
        gradesStudent1.add(3.50);

        ArrayList<Double> gradesStudent2 = new ArrayList<>();
        gradesStudent2.add(3.75);
        gradesStudent2.add(2.80);
        gradesStudent2.add(3.00);
        gradesStudent2.add(5.20);
        gradesStudent2.add(5.50);

        ArrayList<Double> gradesStudent3 = new ArrayList<>();
        gradesStudent3.add(4.75);
        gradesStudent3.add(5.80);
        gradesStudent3.add(6.00);
        gradesStudent3.add(3.20);
        gradesStudent3.add(4.50);

        Student student1 = new Student("Maria", gradesStudent1);
        Student student2 = new Student("Josh", gradesStudent2);
        Student student3 = new Student("Damon", gradesStudent3);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}

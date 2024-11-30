package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class StudentApplication {
    public static void main(String[] args) throws IOException {
        StudentService ss = new StudentService();
        Student studInfo[]= ss.readFile("student-master-list.csv");

        //sorting in descending order
        Arrays.sort(studInfo, new Comparator<Student>() {
            @Override
            public int compare(Student stud1, Student stud2) {
                return stud2.getGrade().compareTo(stud1.getGrade());
            }
        });

        //adding to array according to subject type
        Student[] compSci = new Student[100];
        Student[] stat = new Student[100];
        Student[] apMath = new Student[100];
        int compctr = 0, statctr = 0, mathctr = 0;
        for (int i = 1; i < 100; i++) {
            if (studInfo[i].getCourse().contains("COMPSCI")) {
                compSci[compctr] = studInfo[i];
                compctr++;
            }
            if (studInfo[i].getCourse().contains("APMTH")) {
                apMath[mathctr] = studInfo[i];
                mathctr++;
            }
            if (studInfo[i].getCourse().contains("STAT")) {
                stat[statctr] = studInfo[i];
                statctr++;
            }
        }

        //writing arrays to csv files
        ss.writeDataToFile(compSci, "course1.csv");
        ss.writeDataToFile(apMath, "course2.csv");
        ss.writeDataToFile(stat, "course3.csv");

    }
}
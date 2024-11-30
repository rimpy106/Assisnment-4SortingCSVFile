package com.coderscampus;

import java.io.*;

public class StudentService {
    Student[] studData = new Student[101];
    String[] lineData = new String[4];
    String line;
    private static final String fileHeader = "Student ID,Student Name,Course,Grade \n";

    public Student[] readFile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("student-master-list.csv"));
            int i = 0;
            while ((line = br.readLine()) != null) {
                lineData = line.split(",");
                studData[i] = new Student(lineData[0], lineData[1], lineData[2], lineData[3]);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
        return studData;
    }

    public void writeDataToFile(Student[] stud, String fileName) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(fileHeader);
            for (int j = 0; j < stud.length; j++) {
                if (stud[j] != null) {
                    bw.write(stud[j].getStudentID() + "," + stud[j].getStudentName() + "," + stud[j].getCourse() + "," + stud[j].getGrade() + "\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            bw.close();
        }
    }
}

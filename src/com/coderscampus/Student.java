package com.coderscampus;

public class Student {
    String StudentID;
    String studentName;
    String course;
    String Grade;

    public Student(String studentID, String studentName, String course, String grade) {
        StudentID = studentID;
        this.studentName = studentName;
        this.course = course;
        Grade = grade;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}

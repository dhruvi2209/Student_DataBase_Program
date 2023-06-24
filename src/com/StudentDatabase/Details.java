package com.StudentDatabase;

public class Details {
    private int StudentId;
    private String StudentName;
    private String StudentCity;
    private String StudentPhone;

    public Details(int studentId, String studentName, String studentCity, String studentPhone) {
        super();
        StudentId = studentId;
        StudentName = studentName;
        StudentCity = studentCity;
        StudentPhone = studentPhone;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public Details(String studentName, String studentCity, String studentPhone) {
        StudentName = studentName;
        StudentCity = studentCity;
        StudentPhone = studentPhone;
    }

    public Details() {
        super();
    }

    @Override
    public String toString() {
        return "Details{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentCity='" + StudentCity + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                '}';
    }
}

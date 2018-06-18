package model;

import java.util.ArrayList;
import java.util.List;


public class Transcript {
    private String studentName;
    private int studentId;
    private List<String> grades;

    // MODIFIES: this
    /// EFFECTS: instantiates Transcript object and sets name and id fields
    public Transcript(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    // setters
    // REQUIRES: grade should be between 0.0 and 4.0, and/or the course should not be null
    // MODIFIES: this
    // EFFECTS: Adds one Grade to list tracking grades
    public void addGrade(String course, double grade){
        String gradeStr = String.valueOf(grade);
        grades.add(course + ": " + gradeStr);
    }

    // getters
    // EFFECTS: returns course name and grade in format CourseName: Grade
    // REQUIRES: a course the student has already taken
    public String getCourseAndGrade(String course){
        for (String g : grades) {
            String c = course.toLowerCase();
            if (g.toLowerCase().contains(c)) {
                return g;
            }
        }
        return "Not Found";
    }

    public String getStudentName() { return studentName; }
    public List<String> getGrades () { return grades; }

    // EFFECTS: Gets the current GPA for student based on transcript
    public double getGPA(){
        double totalGrades = 0.0;
        double totalCredits = grades.size() * 4.0;
        for (String g : grades) {
            int idx = g.indexOf(":");
            double classGrade = Double.parseDouble(g.substring(idx + 2));
            totalGrades += classGrade;
        }
        return (totalGrades * totalCredits) / totalCredits;
    }

    // EFFECTS: prints course names with grades earned
    public void printTranscript(){
        for (String g : grades) {
            System.out.println(g);
        }
    }
}

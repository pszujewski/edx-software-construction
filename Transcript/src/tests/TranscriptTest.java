package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class TranscriptTest {
    private Transcript t;

    @Before
    public void setup() {
        t = new Transcript("John Doe", 555);
    }

    @Test
    public void testAddGrade() {
        t.addGrade("FR-101", 3.0);
        assertTrue(t.getGrades().indexOf("FR-101: 3.0") != -1);
    }

    @Test
    public void testGetCourseAndGrade() {
        t.addGrade("FR-401", 4.0);
        String found = t.getCourseAndGrade("FR-401");
        assertTrue(found.equals("FR-401: 4.0"));
    }

    @Test public void testGetGPA() {
        t.addGrade("FR-401", 4.0);
        t.addGrade("CS-101", 3.0);
        t.addGrade("CS-303", 3.0);
        List<String> grades = t.getGrades();
        double totalGrades = 0.0;
        double totalCredits = grades.size() * 4.0;
        for (String g : grades) {
            int idx = g.indexOf(":");
            double classGrade = Double.parseDouble(g.substring(idx + 2));
            totalGrades += classGrade;
        }
        double gpa = (totalGrades * totalCredits) / totalCredits;
        assertTrue(gpa == t.getGPA());
    }

}

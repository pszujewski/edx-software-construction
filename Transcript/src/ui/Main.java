package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("John Doe", 1233);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        t2.addGrade("COMP-SCI-50", 3.5);
        t2.addGrade("ARCH-500", 2.5);
        t2.addGrade("ECON-150", 4.0);

        t3.addGrade("CPSC-100", 3.0);
        t3.addGrade("CPSC-200", 2.0);
        t3.addGrade("ECON_101", 4.0);

        System.out.println(t1.getStudentName() + ": ");
        t1.printTranscript();
        System.out.println(t1.getGPA());
        System.out.println("============");

        System.out.println(t2.getStudentName() + ": ");
        t2.printTranscript();
        System.out.println(t2.getGPA());
        System.out.println("============");
    }
}

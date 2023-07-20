import java.util.Scanner;
public class Student {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        Scanner alici = new Scanner(System.in);
        System.out.print("Birinci sözlü notunuzu giriniz :");
        int Sözlünot1 = alici.nextInt();
        System.out.print("İkinci sözlü notunuzu giriniz :");
        int Sözlünot2 = alici.nextInt();
        System.out.print("İkinci sözlü notunuzu giriniz :");
        int Sözlünot3 = alici.nextInt();


        Sözlünot1 = (int) (note1 * course1.sözlüetki);
        Sözlünot2 = (int) (note2 * course2.sözlüetki);
        Sözlünot3 = (int) (note3 * course3.sözlüetki);

        double average1 = (note1 * course1.sinavetki) + Sözlünot1;
        double average2 = (note2 * course2.sinavetki) + Sözlünot2;
        double average3 = (note3 * course3.sinavetki) + Sözlünot3;


        this.average = (average1 + average2 + average3) / 3;


        this.isPass = this.average > 55;

        printNote();
    }

    void printNote() {
        System.out.println("Student Name: " + this.name);
        System.out.println(course1.name + " Grade: " + course1.sinavetki + " * " + (int) ( - (course1.sinavetki * course1.sözlüetki)) +
                " + " + course1.sözlüetki + " * " + course1.sözlünot);
        System.out.println(course2.name + " Grade: " + course2.sinavetki + " * " + (int) ( - (course2.sinavetki * course2.sözlüetki)) +
                " + " + course2.sözlüetki + " * " + course2.sözlünot);
        System.out.println(course3.name + " Grade: " + course3.sinavetki + " * " + (int) ( - (course3.sinavetki * course3.sözlüetki)) +
                " + " + course3.sözlüetki + " * " + course3.sözlünot);
        System.out.println("Student Average: " + this.average);
        System.out.println("Student isPass: " + this.isPass);
    }
}

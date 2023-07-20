public class Course {
    public String sözlünot;
    String name;
    String code;
    String prefix;
    double sözlüetki;
    double sinavetki;
    Teacher teacher;

    Course(String name, String code, String prefix, double sözlüetki, double sinavetki) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sözlüetki = this.sözlüetki;
        this.sinavetki = this.sinavetki;
    }

    void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    void printTeacher() {
        System.out.println("Teacher: " + this.teacher.name);
    }
}

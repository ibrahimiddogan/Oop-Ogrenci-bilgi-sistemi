public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Bradd pitt", "123456", "fizik");
        Teacher teacher2 = new Teacher("Leonardo dicarpio", "654321", "matematik");
        Teacher teacher3 = new Teacher("Johhny deep", "987654", "kimya");

        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.20, 0.80);
        Course matematik = new Course("Matematik", "MAT101", "MAT", 0.15, 0.85);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.25, 0.75);

        fizik.addTeacher(teacher1);
        matematik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1 = new Student("Ali", 123, "12A", fizik, matematik, kimya);
        Student student2 = new Student("Barış", 456, "12B", fizik, matematik, kimya);

        student1.addBulkExamNote(90, 70, 80);
        System.out.println("------------------");
        student2.addBulkExamNote(60, 75, 85);
    }
}
public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Day", "Myach", "IT78", 3.1);
        students[1] = new Aspirant("Gigaslon", "Doraev", "IT56", 5.0, "Research on Algorithms");
        students[2] = new Student("Oslon", "Arnurov", "IT90", 4.8);
        students[3] = new Student("Antislon", "MaxMtshnikov", "IT14", 4.2);
        for (Student student : students) {
            double scholarship = student.getScholarship();
            System.out.println(student.FirstName + " " + student.LastName + ": Scholarship Amount: $" + scholarship);
        }
    }
}
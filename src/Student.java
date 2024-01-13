

public class Student {
    String FirstName;
    String LastName;
    String group;
    double averageMark;
    public Student(String FirstName, String LastName, String group, double averageMark) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }
}

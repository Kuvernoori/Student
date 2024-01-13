public class Aspirant extends Student{
String scientificwork;
public Aspirant(String FirstName, String LastName, String group, double averageMark, String scientificwork) {
    super(FirstName, LastName,group,averageMark);
    this.scientificwork = scientificwork;
   }
   public double getScholarship() {
        return (averageMark == 5) ? 200 : 180;
   }
}

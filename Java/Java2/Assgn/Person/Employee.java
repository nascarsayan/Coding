public class Employee extends Person
{
  private int ecNo;
  private String doj;
  public Employee(String name, int age, int ecno, String doj)
  {
    super(name, age);
    this.ecNo = ecno;
    this.doj = doj;
  }
  public void printAttr()
  {
    super.printAttr();
    System.out.printf("Employee ID = %d\nDate of Joining = %s\n", ecNo, doj);
  }
}

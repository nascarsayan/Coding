public class MainDemoClass
{
  public static void main(String args[])
  {
    Person p = new Person("Shashi", 20);
    Student stu = new Student("Vishal", 19, "15CS30039", "Kgp");
    Employee e = new Employee("Bhanu", 25, 15, "20170101");
    Staff sta = new Staff("Sachin", 20, 5, "20161231", "Technical");
    Faculty f = new Faculty("Shivam", 27, 3, "20150416", "Professor");
    System.out.println("\nPerson :");
    p.printAttr();
    System.out.println("\nStudent :");
    stu.printAttr();
     System.out.println("\nEmployee :");
    e.printAttr();
    System.out.println("\nStaff :");
    sta.printAttr();
    System.out.println("\nFaculty :");
    f.printAttr();
  }
}

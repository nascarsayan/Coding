/**
 * <h1 style="font-family:Monaco"><center>Bibliography Manager</center></h1>
 * This class is created to demonstrate the characteristics and
 * behaviour of the Bibliography Manager built using the abstract class Resource
 * and the classes inherited from it.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class BibliographyManager
{
  /**
   * The main method creates one instance of each of the classes
   * <ul>
   *     <li>OnlineResource</li>
   *     <li>Book</li>
   *     <li>Journal</li>
   * </ul>
   * and demonstrates the behaviour of the respective class.
   * @param args unused
   */
  public static void main(String args[])
  {
    OnlineResource or = new OnlineResource("TLCL", "http://wiki.lib.sun.ac.za/images/c/ca/TLCL-13.07.pdf");
    System.out.print(or.print());
    Book bk = new Book("TLCL", "No Starch Press", 2012, "William E. Shotts, Jr.", "978159327427", 537);
    System.out.print(bk.print());
    Journal jn = new Journal("Linux shell", "University of Warwick", 2016, "Joni Uitto, Sampsa Ranti", 2, 1, 1, 15);
    System.out.print(jn.print());
  }
}

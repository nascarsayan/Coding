/**
 * <h1 style="font-family:Monaco"><center>Book</center></h1>
 * The Journal class implements the attributes of a journal.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class Journal extends OfflineResource
{
  /**
   * the name of this jornal
   */
  private String name;
  /**
   * the volume number of this publication
   */
  private int volume;
  /**
   * issue number of this publication
   */
  private int issue;
  /**
   * starting page of this journal
   */
  private int pageStart;
  /**
   * ending page of this journal
   */
  private int pageEnd;

  /**
   * Parameterised constructor to initialise the attributes of this journal.
   *
   * @param title the title of this journal
   * @param publisher the publisher of this journal
   * @param year the year of the publication
   * @param name the {@link #name} of this journal
   * @param volume the {@link #volume} of this journal
   * @param issue the {@link #issue} of this jounal
   * @param pageStart the {@link #pageStart starting page} of this journal
   * @param pageEnd the {@link #pageEnd ending page} of this journal
   */
  public Journal(String title, String publisher, int year, String name, int volume, int issue, int pageStart, int pageEnd)
  {
    super(title, publisher, year);
    this.name = name;
    this.volume = volume;
    this.pageStart = pageStart;
    this.pageEnd = pageEnd;
  }

  /**
   * A method to print the information about this journal
   * @return a string with the information about this journal
   */
  public String print()
  {
    return String.format("Journal Details :\n%-15s : %s\n%-15s : %s\n%-15s : %d\n%-15s : %s\n%-15s : %d\n%-15s : %d\n%-15s : %d\n%-15s : %d\n\n", "Title", getTitle(), "Publisher", getPublisher(), "Year", getYear(), "Name", name, "Volume", volume, "Issue", issue, "Starting Page", pageStart, "Ending Page", pageEnd);
  }
}

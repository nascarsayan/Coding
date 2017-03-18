/**
 * <h1 style="font-family:Monaco"><center>Online Resource</center></h1>
 * The OnlineResource class implements the attributes of a
 * resouce material which is available freely online.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class OnlineResource extends Resource
{
  /**
   * the web address or link to this online resource material
   */
  private String url;

  /**
   * A parameterised constructor to initialise the title and {@link #url}
   * of this online resorce material
   * @param title the title of the book
   * @param url the {@link #url} of the book
   */
  public OnlineResource(String title, String url)
  {
    super(title);
    this.url = url;
  }

  /**
   * A method to print the information about this online resource material
   * @return a string with the information about this online resource material
   */
  public String print()
  {
    return String.format("Online Resource Details :\n%-15s : %s\n%-15s : %s\n\n", "Title", getTitle(), "Url", url);
  }
}

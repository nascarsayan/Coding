/**
 * <h1 style="font-family:Monaco"><center>Book</center></h1>
 * The Book class implements the attributes of a book.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class Book extends OfflineResource
{
  /**
   * the author of this book
   */
  private String author;
  /**
   * the <a href="https://en.wikipedia.org/wiki/International_Standard_Book_Number">ISBN</a> of this book
   */
  private String isbn;
  /**
   * the number of pages in this book
   */
  private int pages;

  /**
   * Parameterised constructor to initialise the attributes of this journal.
   *
   * @param title the title of this book
   * @param publisher the publisher of this book
   * @param year the year of publication of this book
   * @param author the {@link #author} of this book
   * @param isbn the {@link #isbn ISBN} of this book
   * @param pages the {@link #pages number of pages} in this book
   */
  public Book(String title, String publisher, int year, String author, String isbn, int pages)
  {
    super(title, publisher, year);
    this.author = author;
    this.isbn = isbn;
    this.pages = pages;
  }

  /**
   * A method to print the information about this book
   * @return a string with the information about this book
   */
  public String print()
  {
    return String.format("Book Details :\n%-15s : %s\n%-15s : %s\n%-15s : %s\n%-15s : %s\n%-15s : %s\n%-15s : %d\n\n", "Title", getTitle(), "Publisher", getPublisher(), "Year", getYear(), "Author", author, "ISBN", isbn, "Pages", pages);
  }
}

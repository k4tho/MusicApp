/**
*This class contains an artist account. Artists accounts will contain a public name they will
*be known as. They will be able to create contents that have their profile attached to the content.
*/

import java.util.ArrayList;

public class Artist {
  /**
  *The name portion of the artist account
  */
  private String name;

  /**
  *The content creations portions of the artist account. Represents all of the content that the artist has created.
  */
  private ArrayList<Content> createdCont;

  /**
  *Default constructor that initializes the artist's name to n/a and createdCont to an empty list
  */
  public Artist() {
    name = "n/a";
    createdCont = new ArrayList<Content>();
  }

  /**
  *Overload constructor that initializes the artist's name and createdCont to an empty list
  *@param name String variable that represents the artist's name and what they will be known as
  */
  public Artist(String name) {
    this.name = name;
    createdCont = new ArrayList<Content>();
  }

  /**
  *sets the name of the artist
  *@param name String variable that represents the name of the artist
  */
  public void setName(String name) {
    this.name = name;
  }

  /**
  *gets the name of the artist
  *@return a String that represents the name
  */
  public String getName() {
    return this.name;
  }

  /**
  *gets the list of content that the artist has created
  *@return an ArrayList of content that the artist has created
  */
  public ArrayList<Content> getCreatedCont() {
    return this.createdCont;
  }

  /**
  *adds a content to the artist's list of created contents
  *@param a Content that represents the song
  */
  public void createCont(Content content) {
    createdCont.add(content);
  }

  /**
  *gets the artist's public name
  *@return a String that represents the name
  */
  public String toString() {
    return this.name;
  }
}

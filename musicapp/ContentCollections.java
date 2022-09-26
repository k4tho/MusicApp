/**
*This class creates a collection of content. Listeners will be able to create a playlist,
*add songs to it, and remove it. There is also a shuffle option that will allow
*them to play all songs in the playlist but randomized.
*/

import java.util.Random;
import java.util.ArrayList;

public class ContentCollections {
  /**
  *The title portion of the collection
  */
  private String collectionTitle;

  /**
  *The list of content portion of the collection. Collection stores these contents
  */
  private ArrayList<Content> contentCollection;

  /**
  *default constructor that initializes the title to n/a and an empty list of contents
  */
  public ContentCollections() {
    collectionTitle = "n/a";
    contentCollection = new ArrayList<Content>();
  }

  /**
  *overload constructor that initializes the title and an empty list of contents
  *@param collectionTitle user input a title for the collection
  */
  public ContentCollections(String collectionTitle) {
    this.collectionTitle = collectionTitle;
    contentCollection = new ArrayList<Content>();
  }

  /**
  *sets the title of the collection
  *@param name String variable that represents the name of the collection
  */
  public void setCollectionTitle(String collectionTitle) {
    this.collectionTitle = collectionTitle;
  }

  /**
  *gets the title of the collection
  *@return a String that represents the title
  */
  public String getCollectionTitle() {
    return this.collectionTitle;
  }

  /**
  *gets the list contents that is stored in the collection
  *@return an ArrayList of content that represents the stored contents
  */
  public ArrayList<Content> getContentCollection() {
    return this.contentCollection;
  }

  /**
  *adds a content to the collection
  *@param content a Content variable to be added to the collection
  */
  public void addToCollection(Content content) {
    contentCollection.add(content);
  }

  /**
  *removes a content from the collection
  *@param content a Content variable that will be removed from the collection
  */
  public void removeFromCollection(Content content) {
    contentCollection.remove(content);
  }

  /**
  *plays the collection's content in a randomized order
  *@see Content#play
  */
  public void shuffle() {
    Random rand = new Random();
    ArrayList<Content> tempContCollection = new ArrayList<Content>();
    for (int i = 0; i < this.contentCollection.size(); ++i) {
      tempContCollection.add(contentCollection.get(i));
    }
    while (tempContCollection.size() != 0) {                                    //while there is still at least one content in the collection
      int randNum = rand.nextInt(tempContCollection.size());                    //a random number will be generated to pick a song based on their index
      tempContCollection.get(randNum).play();                                   //and play the song and remove it from the temp collection
      tempContCollection.remove(randNum);
    }
  }

  /**
  *gets the collection's title
  *@return a String that represents the title
  */
  public String toString() {
    return this.collectionTitle;
  }
}

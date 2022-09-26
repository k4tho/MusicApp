/**
*This class represents a listener account. Listeners will be able to create a username and password
*to log into their accounts. They will be able to favorite contents that they like, which will be added
*their liked songs collection.
*/

import java.util.ArrayList;

public class Listener {
  /**
  *username portion of a listener account
  */
  private String username;

  /**
  *password portion of the listener account
  */
  private String password;

  /**
  *list of contents that the user has favorited
  */
  private ArrayList<Content> likedContent;

  /**
  *list of playlists that the user has created
  */
  private ArrayList<ContentCollections> createdPlaylists;

  /**
  *default constructor that initializes username and password to n/a, an empty list of liked contents and created playlist
  */
  public Listener() {
    this.username = "n/a";
    this.password = "n/a";
    likedContent = new ArrayList<Content>();
    createdPlaylists = new ArrayList<ContentCollections>();
  }

  /**
  *overload constructor that initializes the username and password, an empty list of liked contents and created playlist
  *@param username String variable that represents the name of the user
  *@param password String variable that represents the password
  */
  public Listener(String username, String password) {
    this.username = username;
    this.password = password;
    likedContent = new ArrayList<Content>();
    createdPlaylists = new ArrayList<ContentCollections>();
  }

  /**
  *sets the username of the listener acc
  *@param username String variable for the name of the user
  */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
  *sets the password of the listener acc
  *@param password String variable for the password of the user
  */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
  *gets the listener's username
  *@return a String that represents the username
  */
  public String getUsername() {
    return this.username;
  }

  /**
  *gets the listener's password
  *@return a String that represents the password
  */
  public String getPassword() {
    return this.password;
  }

  /**
  *gets the listener's favorited songs
  *@return an ArrayList of Content that the user likes
  */
  public ArrayList<Content> getLikedContent() {
    return this.likedContent;
  }

  /**
  *adds contents that the user likes to their favorites
  *@param content Content that the user liked
  */
  public void favorite(Content content) {
    likedContent.add(content);
  }

  /**
  *adds a playlist that the user created to their created playlists list
  *@param playlist ContentCollections variable that the user created
  */
  public void createPlaylist(ContentCollections playlist) {
    createdPlaylists.add(playlist);
  }

  /**
  *gets the username of the user
  *@return a String that represents the name of the user
  */
  public String toString() {
    return this.username;
  }
}

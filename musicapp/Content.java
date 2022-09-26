/**
*The content class represent a song. It will consist of the title of the song, the artist that created
*the song, and genres that the song falls under. Listeners will be able to play content, which increases
*the number of streams.
*/

import java.util.ArrayList;

public class Content {
  /**
  *The title portion of the content
  */
  private String title;

  /**
  *The artist(creator of content) portion of the content
  */
  private Artist artist;

  /**
  *The genres portion of the content. Represents the type of content
  */
  private String[] genres;

  /**
  *The number of streams portion of the content. Represents the number of times a content has been played
  */
  private int numStreams;

  public static ArrayList<Content> allAvailableContent = new ArrayList<Content>();

  /**
  *overload contructor initializing the title, artist, and genres
  *@param title String variable that represents name of the song
  *@param artist Artist variable that represents the artist, creator of the content
  *@param genres Array of string variable that represents the genres the content is a part of
  */
  public Content(String title, Artist artist, String[] genres) {
    this.title = title;
    this.artist = artist;
    this.genres = genres;
    artist.getCreatedCont().add(this);
    allAvailableContent.add(this);
  }

  /**
  *sets the title of the content
  *@param title String variable that represents the name of the content
  */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
  *sets the creator of the content
  *@param artist String variable that represents the creator of the content
  */
  public void setArtist(Artist artist) {
    this.artist = artist;
    artist.getCreatedCont().add(this);
  }

  /**
  *sets the genres of the content
  *@param genres String list that represents the type of content it is
  */
  public void setGenres(String genre1, String genre2, String genre3) {
    this.genres[0] = genre1;
    this.genres[1] = genre2;
    this.genres[2] = genre3;
  }

  /**
  *gets the title of the content
  *@return a String that represents the title
  */
  public String getTitle() {
    return this.title;
  }

  /**
  *gets the creator of the content
  *@return a String that represents the artist
  */
  public Artist getArtist() {
    return this.artist;
  }

  /**
  *gets the genre of the content
  *@return a String list that contains the genres of the content
  */
  public String[] getGenres() {
    return this.genres;
  }

  /**
  *gets the content's number of streams
  *@return an int that represents the content's number of streams
  */
  public int getNumStreams() {
    return this.numStreams;
  }

  /**
  *method that increases the number of streams each time a content is played.
  *@return an int that represents how many times the content was played
  */
  public int play() {
    this.numStreams += 1;
    return this.numStreams;
  }

  /**
  *prints out the title and the artist neatly
  *@return two strings that prints out the title and the artist in an orderly manner
  */
  public String toString() {
    return this.title + " by " + this.artist;
  }
}

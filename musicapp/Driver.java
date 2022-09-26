/**
*This class simulates a music app. It contains only the main method.
*Users will be able to create a listener account where they will be able to
*browse available content, favorite their liked songs, and create playlists.
*@see Accounts
*@see Content
*@see ContentCollections
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class Driver {
  public static void main(String[] args) {
    /**
    *premade artists on the music app
    */
    Artist artist1 = new Artist("Sleeping With Sirens");
    Artist artist2 = new Artist("Holding Absence");
    Artist artist3 = new Artist("Beabadoobee");
    Artist artist4 = new Artist("Paramore");
    Artist artist5 = new Artist("Hayd");

    /**
    *premade songs  already available on the music app
    */
    Content song1 = new Content("Better Off Dead", artist1, new String[] {"rock", "punk"});
    Content song2 = new Content("Crosses", artist1, new String[] {"rock", "punk"});
    Content song3 = new Content("Agree to Disagree", artist1, new String[] {"rock", "punk"});
    Content song4 = new Content("Dream of Me", artist2, new String[] {"rock", "punk"});
    Content song5 = new Content("Curse Me With Your Kiss", artist2, new String[] {"rock", "punk"});
    Content song6 = new Content("Die Alone", artist2, new String[] {"rock", "punk"});
    Content song7 = new Content("10:36", artist3, new String[] {"Alternative", "Indie", "Pop"});
    Content song8 = new Content("See You Soon", artist3, new String[] {"Alternative", "Indie", "Pop"});
    Content song9 = new Content("Perfect Pair", artist3, new String[] {"Alternative", "Indie", "Pop"});
    Content song10 = new Content("Turn It Off", artist4, new String[] {"Rock", "Alternative", "Indie"});
    Content song11 = new Content("All I Wanted", artist4, new String[] {"Rock", "Alternative", "Indie"});
    Content song12 = new Content("Where the Lines Overlap", artist4, new String[] {"Rock", "Alternative", "Indie"});
    Content song13 = new Content("Superman", artist5, new String[] {"R&B", "Alternative", "Indie"});
    Content song14 = new Content("Head in the Clouds", artist5, new String[] {"R&B", "Alternative", "Indie"});
    Content song15 = new Content("Closure", artist5, new String[] {"R&B", "Alternative", "Indie"});

    /**
    *Premade collections available on the music app
    */
    ContentCollections collection1 =  new ContentCollections("Drives");
    ContentCollections collection2 =  new ContentCollections("Rocking Out");
    ContentCollections collection3 =  new ContentCollections("All");

    collection1.addToCollection(song7);
    collection1.addToCollection(song8);
    collection1.addToCollection(song9);
    collection1.addToCollection(song10);
    collection1.addToCollection(song11);
    collection1.addToCollection(song12);
    collection2.addToCollection(song1);
    collection2.addToCollection(song2);
    collection2.addToCollection(song3);
    collection2.addToCollection(song4);
    collection2.addToCollection(song5);
    collection2.addToCollection(song6);
    collection3.addToCollection(song1);
    collection3.addToCollection(song2);
    collection3.addToCollection(song3);
    collection3.addToCollection(song4);
    collection3.addToCollection(song5);
    collection3.addToCollection(song6);
    collection3.addToCollection(song7);
    collection3.addToCollection(song8);
    collection3.addToCollection(song9);
    collection3.addToCollection(song10);
    collection3.addToCollection(song11);
    collection3.addToCollection(song12);
    collection3.addToCollection(song13);
    collection3.addToCollection(song14);
    collection3.addToCollection(song15);








    Scanner scnr = new Scanner(System.in);

    /**
    *Users are creating a listener account with a username and password
    */
    System.out.println("Creating a listener account.");
    System.out.println("Enter a username: ");
    String username = scnr.next();
    System.out.println("Enter a password: ");
    String password = scnr.next();

    Listener userListener = new Listener(username, password);

    /**
    *Home page of music app. Lets users explore different features.
    */
    System.out.println();
    System.out.println("Now entering home page. ");

    /**
    *Explore premadee albums
    */
    System.out.println();
    System.out.println("Here are some playlists curated for you.");
    System.out.println("  1: " + collection1.toString());
    System.out.println("  2: " + collection2.toString());
    System.out.println("  3: " + collection3.toString());

    /**
    *Shuffle premade albums
    */
    System.out.println();
    System.out.println("Which one would you like to play? ");
    int userChoice = scnr.nextInt();
    ContentCollections pickedCollection ;
    if (userChoice == 1) {
      pickedCollection = collection1;
    }
    else if (userChoice == 2) {
      pickedCollection = collection2;
    }
    else {
      pickedCollection = collection3;
    }
    System.out.println("Now shuffling " + pickedCollection.toString());
    for (int i = 0; i < pickedCollection.getContentCollection().size(); ++i) {
      pickedCollection.getContentCollection().get(i).play();
    }
    System.out.println(pickedCollection.getContentCollection());

    /**
    *Favoriting songs based on playlist user had just listened to
    */
    System.out.println();
    System.out.println("You can even favorite songs that you like!");
    System.out.println("Try it out.  Press the number of the song you would like to favorite.");
    for (int i = 0; i < pickedCollection.getContentCollection().size(); ++i) {
      System.out.println("  " + (i+1) + ": " + pickedCollection.getContentCollection().get(i));
    }
    System.out.println();
    System.out.println("Your pick: ");
    userChoice = scnr.nextInt();
    userListener.favorite(pickedCollection.getContentCollection().get(userChoice-1));
    System.out.println("You have added " + pickedCollection.getContentCollection().get(userChoice-1) + " to your favorites.");

    /**
    *Users make their own collections
    */
    System.out.println();
    System.out.println("You can also make your own collections!");
    System.out.println("Try it out! Enter a playlist name: ");
    String userPlaylistName = scnr.next();
    ContentCollections userPlaylist = new ContentCollections(userPlaylistName);
    userListener.createPlaylist(userPlaylist);
    System.out.println();
    System.out.println("Try adding five songs to your collection. Here are some to get you started.");
    for (int i = 0; i < song1.allAvailableContent.size(); ++i) {
      System.out.println("  " + (i+1) + ": " + song1.allAvailableContent.get(i));
    }
    System.out.println();
    System.out.println("Press on 5 numbers.");
    for (int i = 0; i < 5; ++i) {
      int userChoice2 = scnr.nextInt();
      userPlaylist.addToCollection(song1.allAvailableContent.get(userChoice2-1));
    }
    System.out.println();
    System.out.println("Your playlist " + userPlaylist.getCollectionTitle() + ": ");
    for (int i = 0; i < userPlaylist.getContentCollection().size(); ++i) {
      System.out.println("  " + (i+1) + ": " + userPlaylist.getContentCollection().get(i));
    }

    /**
    *user playlist will be outputted to a textfile called userplaylist.txt
    */
    try {
      FileOutputStream fileStream = null;
      PrintWriter outFS = null;

      fileStream = new FileOutputStream("userplaylist.txt");
      outFS = new PrintWriter(fileStream);

      for(int i = 0; i < userPlaylist.getContentCollection().size(); ++i) {
        outFS.println((i+1) + ": " + userPlaylist.getContentCollection().get(i));
        outFS.println("   Number of streams: " + userPlaylist.getContentCollection().get(i).getNumStreams());
      }
      outFS.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("Can't write out to text file.");
    }
  }
}

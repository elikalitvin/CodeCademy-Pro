import java.util.HashMap;

public class Library {
  
  public Library(){
    
  }
  
  public void getFinishedBooks(HashMap<String, Boolean> library){
    if (library.size() < 1) { //library is a subset of  finished books from ALL books
      System.out.println("Error! The HashMap library is empty!");
    } else {
      for (String book : library.keySet() ){
        if (library.get(book) == true){ //Dealing with the sublibrary
          System.out.println("This book has been completed: " + book);
        }
      }
    }
  }
  
  public void getUnfinishedBooks(HashMap<String, Boolean> library2){
    if (library2.size() < 1){
      System.out.println("Error! The HashMap library2 is empty!");
    } else {
      for (String book : library2.keySet() ){
        if (library2.get(book) == false){ //when a VALUE is equal to false
          System.out.println("This book has not been completed: " + book);
        }
      }
    }
  }
  
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
    
    Library myLibrary = new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getUnfinishedBooks(myBooks);
  }
}

  /* We create a method that is a hashmap library (with KEY and VALUE). First, we control if the
    hashmap library is empty; if so, then we get an error. Else, we iterate through the
    hashmap library KEYS and check if the VALUE of each KEY equals to true. If yes, print the 
    name of the book within a sentence. If the key is equal to false, the method just ignores
    those books. 
    In main, we create a HashMap where we put books and booleans. Then, we create a new CLASS OBJECT, and call the 
    method on it taking the HashMap myBooks as parameter. */

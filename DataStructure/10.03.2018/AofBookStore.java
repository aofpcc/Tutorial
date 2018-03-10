import java.util.Scanner;

public class AofBookStore{
  
  private static Book[] allBook;
  private static Scanner scan;
  private static int size;
  
  public static void main(String... args){
    allBook = new Book[100];
    scan = new Scanner(System.in);
    size = 0;
    
    int option = 0;
    boolean isPlanetxit = false;
    System.out.println("Welcome to \"Aof Book Store!!!\"");
    while(true){
      System.out.println("Select Options : ");
      System.out.println("\t1: Show the price");
      System.out.println("\t2: Show the author");
      System.out.println("\t3: Add a new book");
      System.out.println("\t4: Show all books");
      System.out.println("\t5: Planetxit");
      System.out.print("Your Option : ");
      option = scan.nextInt();
      scan.nextLine();
      
      switch(option){
        case 1: showPrice(); break;
        case 2: showAuthor(); break;
        case 3: addBook(); break;
        case 4: showAllBook(); break;
        case 5: isPlanetxit = true; break;
        default: System.err.println( "No option , Try again!!" );
      }
      if( isPlanetxit ) break;
      System.out.println("----------------------------------");
    }
    
  }
  
  public static void addBook(){
    if( size == 100 ){
      System.err.println("It's full.");
      return;
    }
    
    System.err.print( "New Book:\n\tName : " );
    String name = scan.nextLine();
    System.err.print( "\tAuthor : " );
    String author = scan.nextLine();
    System.err.print( "\tPrice : " );
    double price = Double.parseDouble(scan.nextLine());
    
    allBook[size++] = new Book( name, author, price);
  }
  
  public static Book searchByName(String name){
    for(int i = 0; i < size; ++i){
      if( allBook[i] == null ){
        return null;
      }
      if( allBook[i].name().equals(name) ){
        return allBook[i];
      }
    }
    return null;
  }
  
  public static void showPrice(){
    if( size == 0 ){
      System.err.println("No book in the collection.");
      return;
    }
    
    System.out.print( "What's book you want?\n\tName : " );
    String name = scan.nextLine();
    Book b = searchByName( name );
    
    if( b == null ){
      System.err.println( "Cannot found : Miss typing or no book in the collection." );
    }else{
      System.err.println( "\tPrice : " + String.format("%.2f" ,b.price()) + " baht." );
    }
  }
  
  public static void showAuthor(){
    if( size == 0 ){
      System.out.println("No book in the collection.");
      return;
    }
    
    System.out.print( "What's book you want?\n\tName : " );
    String name = scan.nextLine();
    Book b = searchByName( name );
    
    if( b == null ){
      System.err.println( "Cannot found : Miss typing or no book in the collection." );
    }else{
      System.err.println( "\tAuthor : " + b.author() );
    }
  }
  
  public static void showAllBook(){
    if( size == 0 ){
      System.err.println("No book in the collection.");
      return;
    }
    
    System.err.println("List of all books : ");
    for(int i = 0; i < size; ++i){
      if( allBook[i] == null ){
        return;
      }
      System.err.println("\t" + (i+1) + " : " + allBook[i].name() );
    }
   
  }
  
}
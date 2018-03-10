public class LinkedListTestBook{
  public static void main(String[] args){
    LinkedList<Book> list = new LinkedList<Book>();
    list.add( new Book("ABC" , "XYZ", 100) );
    list.add( new Book("DEF" , "UVW", 258) );
    
    list.showAll();
  }
}
public class Book {
  private String name;
  private String author;
  private double price;
  
  public Book(String n, String a, double p){
    name = n;
    author = a;
    price = p;
  }
  
  public String name(){
    return name;
  }
  
  public String author(){
    return author;
  }
  
  public double price(){
    return price;
  }
  
  public String toString(){
    StringBuilder b = new StringBuilder();
    b.append( "Name   : " + name + '\n' );
    b.append( "Author : " + author + '\n' );
    b.append( "Price  : " + String.format("%.2f", price) + " baht." );
    return b.toString();
  }
  
}
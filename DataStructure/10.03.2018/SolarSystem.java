import java.util.*;
public class SolarSystem{
  private Scanner scan = new Scanner(System.in);
  
  private int size = 0;
  private Node head = null;
  private Node tail = null;
  
  // Node for Planet
  private class Node{
    private Planet data;
    private Node next = null;
    public Node( Planet data){
      this.data = data;
    }
    public Planet data(){
      return data;
    }
    public void setNext(Node n){
      this.next = n;
    }
    public Node next(){
      return this.next;
    }
    public double distance(){
      return data.distance();
    }
  }
  
  public void add(Planet x){
    Node c = new Node(x);
    if( size == 0 ){
      head = c;
      tail = c;
    }else{
      if( c.distance() <= head.distance() ){ // add Head
        c.setNext( head );
        head = c;
      }
      else{
        Node iterator = head;
        while( iterator != null ){
          
          if( iterator.next() != null ){ // add Between
            if( c.distance() > iterator.distance() &&  c.distance() <= iterator.next().distance() ){
              c.setNext( iterator.next() );
              iterator.setNext(c);
              break;
            }
          }else {
            tail.setNext(c);
            tail = c;
            break;
          }
          iterator = iterator.next();
        }
        
      }
    }
    size++;
  }
  public void showAll(){
    System.out.println("***************");
    Node iterator = head;
    while( iterator != null ){
      System.out.println( iterator.data().name() + " : " + iterator.data().distance() );
      iterator = iterator.next();
      if( iterator != null ) System.out.println( "-------------");
    }
    System.out.println("***************");
    
  }
}
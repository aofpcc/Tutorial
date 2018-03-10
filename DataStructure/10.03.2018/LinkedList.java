public class LinkedList<Planet>{
  private int size = 0;
  private Node head;
  private Node tail;
  
  private class Node{
    private Planet data;
    private Node next;
    public Node( Planet data){
      this.data = data;
    }
    public Planet data(){
      return data;
    }
    public void setNext(Node next){
      this.next = next;
    }
    public Node next(){
      return next;
    }
  }
  
  public void add(Planet x){
    Node c = new Node(x);
    if( size == 0 ){
      head = c;
      tail = c;
    }else{
      tail.setNext( c );
      tail = c;
    }
    size++;
  }
  
  public void showAll(){
    Node iterator = head;
    while( iterator != null ){
      System.out.println( iterator.data() );
      iterator = iterator.next();
      if( iterator != null ) System.out.println( "----------");
    }
    System.out.println();
  }
  
}
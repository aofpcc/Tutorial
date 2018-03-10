public class LinkedList<E>{
  private int size = 0;
  private Node<E> head;
  private Node<E> tail;
  
  class Node<E>{
    private E data;
    private Node<E> next;
    public Node( E data){
      this.data = data;
    }
    public E data(){
      return data;
    }
    public void setNext(Node<E> next){
      this.next = next;
    }
    public Node<E> next(){
      return next;
    }
  }
  
  public void add(E x){
    Node<E> c = new Node<E>(x);
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
    Node<E> iterator = head;
    while( iterator != null ){
      System.out.print( iterator.data() );
      iterator = iterator.next();
      if( iterator != null ) System.out.print( ", ");
    }
    System.out.println();
  }
  
}
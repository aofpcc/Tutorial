public class SolarSystem{
  private int size = 0;
  private Node<E> head;
  private Node<E> tail;
  
  private class Node<E>{
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
    public double distance(){
      return ((Planet)data).distance();
    }
  }
  
  public void add(E x){
    Node<E> c = new Node<E>(x);
    if( size == 0 ){
      head = c;
      tail = c;
    }else{
      Node<E> iterator = head;
      if( c.distance() <= head.distance() ){ // add Head
        c.setNext( head.next() );
        head = c;
      }else{
        while( iterator != null ){
          if( iterator.next() != null ){ // add Between
            if( c.distance() > iterator.distance() &&  c.distance() <= iterator.next().distance() ){
              c.setNext( iterator.next() );
              head = c;
            }
          }else{
          
          }
          iterator = iterator.next();
        }
      }
      size++;
    }
  }
  public void showAll(){
    Node<E> iterator = head;
    while( iterator != null ){
      System.out.println( iterator.data() );
      iterator = iterator.next();
      if( iterator != null ) System.out.println( "----------");
    }
    System.out.println();
  }
}
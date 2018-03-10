public class Queue<E> {
  private int size;
  private Node<E> head;
  
  private class Node<E> {
    private E data;
    private Node<E> next;
    public Node(E data){
      this.data = data;
    }
    public void setNext(Node<E> next){
      this.next = next;
    }
    public E data(){
      return data;
    }
    public Node<E> next(){
      return next;
    }
  }
  
  public void add(E data){
    Node<E> newNode = new Node<E>( data );
    if( size == 0 ){
      head = newNode;
    }else{
      newNode.setNext( head );
      head = newNode;
    }
    size++;
  }
  
  public E peek(){
    if( size == 0 ) return null;
    Node<E> iterator = head;
    while( iterator.next() != null ){
      iterator = iterator.next();
    }
    return iterator.data();
  }
  
  public E poll(){
    if( size == 0 ) return null;
    Node<E> iterator = head;
    Node<E> previous = null;
    while( iterator.next() != null ){
      previous = iterator;
      iterator = iterator.next();
    }
    size-- ;
    if( size != 0 ) previous.setNext( null );
    else head = null;
    return iterator.data();
  }
  
}
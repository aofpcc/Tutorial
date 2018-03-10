public class Stack<E> {
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
  
  public void push(E data){
    Node<E> newNode = new Node<E>( data );
    if( size == 0){
      head = newNode;
    }else{
      newNode.setNext( head );
      head = newNode;
    }
    size++;
  }
  
  public E peek(){
    return head.data();
  }
  
  public E pop(){
    if( size == 0 ) return null;
    Node<E> temp = head;
    head = head.next();
    size-- ;
    return temp.data();
  }
  
  public boolean isEmpty(){
    return size == 0;
  }
  
  public int search(E data){
    int index = -1;
    Node<E> iterator = head;
    while( iterator != null ){
      index++;
      if( iterator.data() == data ){
        return index;
      }
      iterator = iterator.next();
    }
    return index;
  }
  
}
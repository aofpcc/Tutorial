// Binary Tree, Binary Search Tree, Max-Min Heap, Heap Sort
//              Inorder, Pre-order, Post-order

import java.util.*; // Arrays , Random, 

// Binary Tree based on array
public class BinaryHeap {
  private int[] t; // index 1 = root
  public BinaryHeap() {
    t = new int[2]; // 0 1
  }
  public BinaryHeap( int[] x) {
    this.t = x;
  }
  private int head(int i) { return i/2; }
  private int left(int i) { return 2*i; }
  private int right(int i) { return 2*i+1; }
  
  public int[] getHeap() {
    return t;
  }
  
  private void heapify(int i) { // make it be max heap
    int max = i;
    int left = left(i);
    int right = right(i);
    if( left < t.length && t[max] < t[left] ) {
      max = left;
    }
    if( right < t.length && t[max] < t[right] ) {
      max = right;
    }
    if( max != i ) {
      int temp = t[max];
      t[max] = t[i];
      t[i] = temp;
      heapify( max );
    }
  }
  
  // Overloading Heapify method
  private void heapify(int i, int size) {
    int max = i;
    int left = left(i);
    int right = right(i);
    if( left < size && t[max] < t[left] ) {
      max = left;
    }
    if( right < size && t[max] < t[right] ) {
      max = right;
    }
    if( max != i ) {
      int temp = t[max];
      t[max] = t[i];
      t[i] = temp;
      
      heapify( max, size );
    }
  }
  
  private void maxHeap() {
    int n = t.length;
    for(int i = n/2; i >= 1; i--) {
      heapify(i);
    }
  }
  
  private void heapSort() {
    for(int i = t.length-1; i >= 1; i--) {
      int temp = t[i];
      t[i] = t[1];
      t[1] = temp;
      
      heapify( 1, i);
      
    }
  }
  
  public static void main(String... args) {
    int[] x = new int[]{ 0, 3, 18, 16, 14, 5, 2, 1 };
    //getRandomArray( 8, 20);
    printArr( x);
    
    BinaryHeap bHeap = new BinaryHeap( x);
    bHeap.maxHeap();
    
    System.out.println( "---------Max Heap-----------" );
    printArr( bHeap.getHeap() );
    
    bHeap.heapSort();
    System.out.println( "----After using HeapSort----" );
    printArr( bHeap.getHeap() );
  }
  
  public static int[] getRandomArray(int size, int range) { // getRandom Array for bst
    Random rand = new Random();
    int[] arr = new int[size];
    for(int i = 0; i < size; ++i) {
      arr[i] = rand.nextInt(range) + 1;
    }
    arr[0] = 0;
    return arr;
  }
  
  public static void printArr(int[] num) {
    System.out.print( "[ ");
    for(int i = 0; i < num.length-1; ++i ) {
      System.out.print( num[i] + ", " );
    }
    System.out.println( num[num.length-1] + "]" );
  }
  
}
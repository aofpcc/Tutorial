// Binary Tree, Binary Search Tree, Max-Min Heap, Heap Sort
//              Inorder, Pre-order, Post-order

import java.util.*; // Arrays , Random, 

// Binary Tree based on array
public class BinaryTree {
  private int[] tree; // index 1 = root
  public BinaryTree() {
    tree = new int[2]; // 0 1
  }
  public BinaryTree( int[] x) {
    this.tree = x;
  }
  private int head(int i) { return i/2; }
  private int left(int i) { return 2*i; }
  private int right(int i) { return 2*i+1; }
  
  private void inOrder(int i) { // Travel
    if( i >= tree.length ) return;
    
    inOrder( left(i) );
    System.out.println( tree[i] );
    inOrder( right(i) );
  }
  
  private void preOrder(int i) { // Travel
    if( i >= tree.length ) return;
    
    System.out.println( tree[i] );
    preOrder( left(i) );
    preOrder( right(i) );
  }
  
  private void postOrder(int i) { // Travel
    if( i >= tree.length ) return;
    
    postOrder( left(i) );
    postOrder( right(i) );
    System.out.println( tree[i] );
  }
  
  public static void main(String... args) {
    int[] x = getRandomArray( 7, 20);
    printArr( x);
    
    BinaryTree bt = new BinaryTree( x);
    System.out.println("Start Tree Traversal");
    
    bt.postOrder(1);
    
  }
  
  public static int[] getRandomArray(int size, int range) { // getRandom Array for tree
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
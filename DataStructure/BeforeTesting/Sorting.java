//Bubble Sort, Insertion Sort, Selection Sort, Merge Sort , Quick Sort, Heap Sort
//O(n^2),      O(n^2),         O(n^2),         O(n log n ), O(n^2),     O( n log n)
import java.util.*;
public class Sorting {
  
  public static void main(String... args) {
    int[] arr = getRandomArray( 6, 100 );
    System.out.println( "--------Before--------" );
    printArr( arr);
    
    // Sort
    quickSort( arr, 0, arr.length-1);
    
    System.out.println();
    System.out.println( "---------After---------" );
    printArr( arr);
    
  }
  
  public static int[] getRandomArray(int size, int range) {
    Random rand = new Random();
    int[] arr = new int[size];
    for(int i = 0; i < size; ++i) {
      arr[i] = rand.nextInt(range) + 1;
    }
    return arr;
  }
  
  public static void printArr(int[] num) {
    System.out.print( "[ ");
    for(int i = 0; i < num.length-1; ++i ) {
      System.out.print( num[i] + ", " );
    }
    System.out.println( num[num.length-1] + "]" );
  }
  
  // ascendingly => min -> max
  public static void bubbleSort( int[] num) {
    boolean swapped = false;
    do {
      swapped = false;
      for(int i = 0; i < num.length-1; i++) {
        if( num[i] > num[i+1] ) {
          // swap
          int temp = num[i];
          num[i] = num[i+1];
          num[i+1] = temp;
          
          swapped = true;
        }
      }
    } while( swapped );
  }
  
  public static void insertionSort( int[] num) {
    for(int i = 1; i < num.length; ++i) {
      int key = num[i];
      int j = i-1;
      while( j >= 0 && key < num[j] ) {
        num[j+1] = num[j];
        j--;
      }
      num[j+1] = key;
    }
  }
  
  public static void selectionSort( int[] num) {
    for(int i = 0; i < num.length; ++i) {
      int min = i;
      for(int j = i+1; j < num.length; ++j) {
        if( num[j] < num[min] ) min = j;
      }
      // swap
      int temp = num[i];
      num[i] = num[min];
      num[min] = temp;
    }
  }
  
  //O(n log n)
  public static int[] mergeSort( int[] arr, int left, int right) { // #1 : left => 0 , right => n-1
    if( right <= left ) return arr;
    int mid = ( left + right) /2;
    arr = mergeSort( arr, left, mid ); // left array is sorted -> left to mid
    arr = mergeSort( arr, mid+1, right ); // right array is sorted -> mid + 1 to right
    
    // merge
    int[] temp = Arrays.copyOf( arr, arr.length );
    
    int x = left;
    int y = mid+1;
    
    for( int i = left; i <= right; ++i ){
      if( x > mid ) {
        temp[i] = arr[y];
        y++;
      } else if( y > right ) {
        temp[i] = arr[x];
        x++;
      } else {
        if( arr[x] < arr[y] ) {
          temp[i] = arr[x];
          x++;
        } else {
          temp[i] = arr[y];
          y++;
        }
      }
    }
    return temp;
  }
//  Merge Sort illustration
//  ------------------------
//  39, 70 ,100                |               88, 47, 96
//  39, 70      |     100      |              88, 47     | 96
//  39 | 70     |     100      |              88 | 47    | 96
//  39, 70      |     100      |              47 , 88    | 96
//  39, 70, 100                |              47 , 88, 96
//  39, 47, 70, 88, 96, 100
  
  // O(n^2)
  public static void quickSort(int[] num, int left, int right) { // #1 : left = 0, right = n-1
    if( left >= right + 1 ) return;
    int pivot = num[ (left + right) /2 ];
    int i = left;
    int j = right;
    while( i <= j ) {
      while( num[i] < pivot ) {
        i++;
      }
      while( num[j] > pivot ) {
        j--;
      }
      if( i <= j ) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        
        i++;
        j--;
      }
    }
    if( left < j ) {
      quickSort( num, left, j );
    }
    if( i < right ) {
      quickSort( num, i, right);
    }
  }
  
}
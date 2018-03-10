import java.util.*;
public class QuickSort {
  
  public static void main(String[] args){
    Random rand = new Random();
    int size = rand.nextInt( 5 ) + 8;
    int[] num = new int[ size ];
    for(int i = 0; i < size; ++i){
      num[i] = rand.nextInt( 100 );
      System.out.print( num[i] + " " );
    }
    System.out.println();
    
    System.out.println("---------------------");
    
    num = quickSort( num, 0, size - 1); 
    
    for(int i = 0; i < size; ++i){
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
  }
  private static int[] quickSort(int[] num, int low, int high){
    if( num.length == 0 || num == null ) return num;
    
    int pivot = num[ (low + high)/2 ]; 
    
    int i = low;
    int j = high;
    while( i <= j){
      
      while( num[i] < pivot ){
        i++;
      }
      while( num[j] > pivot ){
        j--;
      }
      
      if( i <= j ){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        
        i++;
        j--;
      }
    }
    
    if( low < j ){
      num = quickSort( num, low, j); 
    }
    if( i < high ){
      num = quickSort( num, i, high);
    }
    return num;
  }
}
import java.util.*;
public class InsertionSort{
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
    
    num = insertionSort(num); 
    
    for(int i = 0; i < size; ++i){
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
  }
  public static int[] insertionSort(int[] num){
    for(int i = 1; i < num.length; ++i){
      int j = i-1;
      int key = num[i];
      while( j >= 0 && key < num[j]){
        num[j+1] = num[j];
        j--;
      }
      num[j+1] = key;
    }
    return num;
  }
}
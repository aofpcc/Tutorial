import java.util.*;
public class SelectionSort{
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
    
    num = selectionSort( num ); 
    
    for(int i = 0; i < size; ++i){
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
  }
  
  public static int[] selectionSort(int[] num){
    for(int i = 0; i < num.length; ++i){
      int min = i;
      for(int j = i+1; j < num.length; ++j){
        if( num[min] > num[j] ) min = j;
      }
      int temp = num[min];
      num[min] = num[i];
      num[i] = temp;
    }
    return num;
  }
}
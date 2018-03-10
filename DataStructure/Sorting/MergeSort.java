import java.util.*;
public class MergeSort{
  public static void main(String[] args){
    Random rand = new Random();
    
    int size = rand.nextInt( 5 ) + 20;
    int[] num = new int[ size ];
    
    for(int i = 0; i < size; ++i){
      num[i] = rand.nextInt( 100 );
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
    
    num = mergeSort( num, 0, size); 
    
    for(int i = 0; i < size; ++i){
      System.out.print( num[i] + " " );
    }
    
    System.out.println();
    System.out.println("---------------------");
  }
  
  public static int[] mergeSort(int[] num, int first, int last){
    if( last - first <= 1) return num;
    
    int mid = ( first + last)/2;
    
    int[] newLeft = Arrays.copyOfRange( num, first, mid);
    int[] newRight = Arrays.copyOfRange( num, mid, last);
    
    newLeft = mergeSort( newLeft, 0, mid-first);
    newRight = mergeSort( newRight, 0, last-mid);
    
    num = new int[last-first];
    int x = 0;
    int y = 0;
    
    for(int i = 0; i < num.length; ++i){
      if( y == newRight.length || ( x != newLeft.length && newLeft[x] <= newRight[y])){
        num[i] = newLeft[x];
        x++;
      }else{
        num[i] = newRight[y];
        y++;
      }
    }
    return num;
  }
}
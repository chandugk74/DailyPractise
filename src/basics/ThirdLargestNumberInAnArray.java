package basics;

public class ThirdLargestNumberInAnArray {
public static void main(String args[]){
int array[] = {10, 20, 25, 63, 99, 96, 57};
		   int size = array.length;
 		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		           int temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
 System.out.println(array[size-3]);
		   }
}

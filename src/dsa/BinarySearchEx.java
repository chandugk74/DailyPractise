package dsa;

public class BinarySearchEx {
	   public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        int first=0;
        int last=arr.length-1;
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < target ){  
             first = mid + 1;     
           }else if ( arr[mid] == target ){  
 System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }  
    }
}

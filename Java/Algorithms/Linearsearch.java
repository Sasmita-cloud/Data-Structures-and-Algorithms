public class LinearSearchExample{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,43,31,50,7,9};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    

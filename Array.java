import java.util.Arrays;
public class Array {
public static void main(String[] args){
Object arr[]={1,2,3,4,5};
	Arrays.sort(arr);	
	System.out.println("The sorted array is:");
for(Object num: arr){
	System.out.println("Array element is"+num);
	
}
int val=2;
int returnV=Arrays.binarySearch(arr, val);
System.out.println("The index of element 2 is:"+returnV);
}
}
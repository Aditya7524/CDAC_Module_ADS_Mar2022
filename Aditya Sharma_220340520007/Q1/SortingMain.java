import java.util.*;
class InsertionSort{
	
	public static void insertionSort(int[] a,int n){
	
		int length = a.length;
		for(int i =1; i<length; i++){
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key){
				a[j+1] = a[j];
				j = j-1;
				
			}
			a[j+1] = key ;
			
		}
	}
	
	static void printArray(int a[]){
		int n = a.length ;
		 for(int i=0; i<n;i++){
			System.out.print(a[i] + " ");
		 }
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		InsertionSort is = new InsertionSort();
		is.insertionSort(a,n);
		printArray(a);
	}

}
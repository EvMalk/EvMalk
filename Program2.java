import java.util.Scanner;
import java.util.Arrays;

class Program2{
	public static int recursion(int array[], int left, int right, int middle, int numForSearch){
		while(left < right){
			
			middle = right + (left - right) / 2;
			if(array[middle] > numForSearch){
				recursion(array, left, middle - 1, middle, numForSearch);
			} else if(array[middle] < numForSearch){
				recursion(array, middle + 1, right, middle, numForSearch);
			} else if(array[middle] == numForSearch){
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = {1, 3, 5, 7, 9, 11};
		int numForSearch = scanner.nextInt(); 
		int left = 0;
		int right  = array.length - 1;
		int middle = 0;

		if(recursion(array, left, right, middle, numForSearch) == 1){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}
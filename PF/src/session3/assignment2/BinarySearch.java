package session3.assignment2;

public class BinarySearch {

	public static void main(String[] args) {
		int input[] = { 2, 5, 8, 9, 10, 77, 55 };
		System.out.println("result:" + binarySearch(input,0,input.length,77));
	}

	
	public static int binarySearch(int[] input, int low, int high, int key) {
        
        if (low < high) {
            int mid = low + (high - low) / 2; 
            if (key < input[mid]) {
                return binarySearch(input, low, mid, key);
                 
            } else if (key > input[mid]) {
                return binarySearch(input, mid+1, high , key);
                 
            } else {
                return mid;  
            }
        }
        return -1; 
    }
}

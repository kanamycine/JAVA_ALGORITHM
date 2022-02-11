import java.util.Arrays;

public class test{
	public static void main(String[] args) {
		int [] arr = new int[6];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 1;
		arr[5] = 2;
		System.out.println(Arrays.binarySearch(arr, 1));

	}
}
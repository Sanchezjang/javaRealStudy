import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D));//[[11, 12],[21, 22]]
		
		String[][] str2D = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.equals(str2D, str2D2));///false
		System.out.println(Arrays.deepEquals(str2D, str2D2));///true
		
		int[] array = {0,1,2,3,4};
		int[] array2 = Arrays.copyOf(array, arr.length); // =[0,1,2,3,4]
		int[] array3 = Arrays.copyOf(array, 3);			 // =[0,1,2]
		int[] array4 = Arrays.copyOf(array, 7);			 // =[0,1,2,3,4,0,0]
		int[] array5 = Arrays.copyOfRange(array, 2, 4);  // =[2,3]
		int[] array6 = Arrays.copyOfRange(array, 0, 7);  // =[0,1,2,3,4,0,0]
		
		//배열의 정렬 - sort()
		System.out.println();
		
	}

}

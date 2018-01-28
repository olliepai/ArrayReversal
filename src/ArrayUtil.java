import java.util.Stack;

public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		/* code goes here */
		Stack<Integer> reverseStack = new Stack<Integer>();
		for (int element : arr) {
			reverseStack.push(element);
		}

		for (int pos = 0; pos < arr.length; pos++) {
			arr[pos] = reverseStack.pop();
		}
		
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		/* code goes here */
		int[][] temp = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				temp[i][j] = mat[i][j];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				mat[i][j] = temp[i][temp[i].length - 1 - j];
			}
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		/* code goes here */
		int[][] temp = new int[mat.length][mat[0].length];
		int[][] temp2 = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				temp[i][j] = mat[i][j];
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			temp2[i] = temp[temp.length - 1 - i];
		}
		for (int i = 0; i < temp2.length; i++) {
			for (int j = 0; j < temp2[i].length; j++) {
				mat[i][j] = temp2[i][temp2[i].length - 1 - j];
			}
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}

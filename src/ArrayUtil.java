
public class ArrayUtil {
	public static void reverseArray(int[] arr){
		/* code goes here */
		int[] a = new int[arr.length];
		int temp = 0;
		
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	public void reverseAllRows(){
		/* code goes here */
		for(int i = 0; i < mat.length; i++){
			ArrayUtil.reverseArray(mat[i]);
		}
	}
	
	public void reverseMatrix(){
		/* code goes here */
		reverseAllRows();
		int temp = 0;
		for(int i = 0; i < mat.length / 2; i++){
			for(int j = 0; j < mat[0].length; j++){
				temp = mat[i][j];
				mat[i][j] = mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = temp;
			}
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
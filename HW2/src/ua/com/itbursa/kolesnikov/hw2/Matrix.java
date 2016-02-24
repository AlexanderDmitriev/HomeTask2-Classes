package ua.com.itbursa.kolesnikov.hw2;
public class Matrix {

	private double[][] matrix;
	private int rows;
	private int columns;
	public Matrix(int rows, int columns) {  // Constructor1
		double [][] array=new double [rows][columns]; 
	}
	
	public Matrix(double[][] data) {  // Constructor2
		double [][] array=new double [data.length][data.length];
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array.length; j++){
				array[i][j]=data[i][j];
			}
		}
	}
	public Matrix plus(Matrix matrix2, Matrix array1) {
		
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
				array1.matrix[i][j]=array1.matrix[i][j]+ matrix2.matrix[i][j];
			}
		}
		return array1;
	}
	
	public Matrix times(double number, Matrix array2) {
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
			array2.matrix[i][j]=array2.matrix[i][j]*number;
			}
		}
		return array2;
	}
	
	public Matrix times(Matrix matrix3, Matrix array3) {;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
			array3.matrix[i][j]=array3.matrix[i][j]*matrix3.matrix[i][j];
			}
		}
		return array3;
	}
	
	public Matrix transpose(Matrix array) {
		Matrix array4=new Matrix(array.matrix.length,array.matrix.length );
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
			array4.matrix[i][j]=array.matrix[j][i];
			}
		}
		return array4;
	}
	
	public void print(Matrix array5) {
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
			System.out.print(array5.matrix[i][j] + "  ");
			}  System.out.print("\n");
		}
	}
	//////////////////////////////////
}

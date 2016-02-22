package ua.com.itbursa.kolesnikov.hw2;
import javax.swing.*;
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
	public Matrix plus(Matrix matrix2) {
		Matrix [][] array1=new Matrix [rows][columns];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
				array1[i][j]=array1[i][j]+ matrix2[i][j];
			}
		}
		return array1;
	}
	
	public Matrix times(double number) {
		double [][] array=new double [array.length][];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++){
			array[i][j]=array[i][j]*number;
			}
		}
		return array;
	}
	//////////////////////////////////
}

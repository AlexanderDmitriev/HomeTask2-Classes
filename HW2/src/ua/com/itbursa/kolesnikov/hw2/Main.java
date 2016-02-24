package ua.com.itbursa.kolesnikov.hw2;
import javax.swing.*;
public class Main {
	public static void main (String[] args) {
		//////////////Circle
	int xobj=Integer.parseInt(JOptionPane.showInputDialog("Введите координаты центра окружности по оси Х"));
		int yobj=Integer.parseInt(JOptionPane.showInputDialog("Введите координаты центра окружности по оси Y"));
		double radobj=Integer.parseInt(JOptionPane.showInputDialog("Введите радиус окружности"));
		Circle obj1=new Circle(xobj,yobj,radobj);
		obj1.moving(2,4);
		JOptionPane.showMessageDialog(null, "После сдвига точки входят в окружность?   - "+  obj1.isPointInCircle(2,4));
		Circle obj2=new Circle(3,5,8.0);
		obj1.isCircleInCurrentCircle(obj1,obj2);
		obj1.toString(); 
	
	} 
}

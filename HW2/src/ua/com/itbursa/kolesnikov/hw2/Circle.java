package ua.com.itbursa.kolesnikov.hw2;
import javax.swing.*;
public class Circle {
	 private int x,y;
	 private double rad;
Circle(int x1, int y1, double rad1) {
	x = x1;
	y = y1;
	rad = rad1;}
public  void moving(int dx, int dy){
	x+=dx;
	y+=dy;
	JOptionPane.showMessageDialog(null, "После сдвига " + "x=  " + x + "\n" + "y=  " + y);
}
public static int abs(int n){  //Находит абсолютное значение числа (число по модулю)
	if (n<0) {n=n*(-1);}
	return n;
}
public static double abs(double n){  //Находит абсолютное значение числа (число по модулю)
	if (n<0) {n=n*(-1);}
	return n;}
public  boolean isPointInCircle(int x1, int y1) {
	int xp=x-x1;
	int yp=y-y1;
	if ((abs(xp)>rad)||((abs(yp)>rad))){return false;}
	else  return true;
}
public  boolean isCircleInCurrentCircle(Circle circle, Circle circle2) {
	double xc, radc;
	xc=Math.pow((circle.x-circle2.x), 2)-Math.pow((circle.y-circle2.y),2);
	radc=Math.pow((circle.rad-circle2.rad), 2);
	if (abs(xc)<abs(radc)){
	JOptionPane.showMessageDialog(null, "Окружность2 полностью лежит в окружности 1");
	return true;}
	else if ((isPointInCircle(circle2.x,circle2.y)==true)||((isPointInCircle((int)(circle2.x+circle.rad),circle2.y)==true)))
	{JOptionPane.showMessageDialog(null, "Окружность 2  пересекает окружность 1");
		return true;}
	else if ((isPointInCircle(circle2.x,(int)(circle2.y+circle.rad))==true)||((isPointInCircle(circle2.x,(int)(circle2.y-circle.rad))==true))||
			(isPointInCircle((int)(circle2.x-circle.rad),circle2.y)==true)){
		JOptionPane.showMessageDialog(null, "Окружность 2  пересекает окружность 1");
		return true;}
	else { JOptionPane.showMessageDialog(null, "Окружность 2  не  пересекает окружность 1");
	return false;}
}
public String toString() {
	JOptionPane.showMessageDialog(null, "x=  " + x + "  " + "y=   " + y + "\n" + "Радиус = " + rad + "\n" + "Диаметр = " + 2*rad);
	JOptionPane.showMessageDialog(null, "Длина дуги окружности =   " + (2*3.14*rad) + "\n" + "Площадь  круга =   " + (3.14*rad*rad));
	return super.toString();
}
//////////////////////////////////////////////////////////////////
public static void main (String[] args) {
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

package ua.com.itbursa.kolesnikov.hw2;
import javax.swing.*;
public class Vector {
	private Object[] objects;
	private int size;
	
	public Vector(int size) {
		String [] link=new String[size];
	}
	
	public void clear() {
		if (objects.length!=0){
		for (int i=0; i<objects.length; i++){
			objects[i]="none";	
		}} 
	}
	
	public void add(Object element) {
		Object [] link2=new Object[size+1];
		for (int i=0; i<objects.length; i++){
			link2[i]=objects[i]; }
		link2[objects.length+1]=element;
		size=size+1;
		for (int i=0; i<link2.length; i++){
			objects[i]=link2[i]; }
	}
	
	public Object get(int index) {
		return objects[index];
	}
	
	public void remove(int index) {
		Object [] link3=new Object[size-1];
		for (int i=0; i<index; i++){
			link3[i]=objects[i]; }
		for (int i=index+1; i<objects.length; i++){
			link3[i]=objects[i+1]; }
		size=size-1;
		for (int i=0; i<link3.length; i++){
			objects[i]=link3[i]; }
	}
	
	public String toString() {
		for (int i=0; i<objects.length; i++){
			System.out.print(objects[i]);}
		return super.toString();
		}
	////////////////////////////////////////////////////////////
	}

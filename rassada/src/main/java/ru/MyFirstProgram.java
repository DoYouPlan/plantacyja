package ru;
public class MyFirstProgram {
    public static void main(String[] args){

System.out.println("Hello fucking World!");
hello("world");
hello("user");
hello("human");
double l = 8;
double s = l*l;
double a = 4;
double b = 7;
System.out.println("Площадь квадрата со стороной "+l+" = "+s);
System.out.println("Площадь квадрата со стороной "+l+" равна "+S(l));
System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" равна "+S(a, b));
    }

public static void hello(String somebody) { 
    System.out.println("Hello Fucking "+ somebody + "!");
}
public static double S(double a) {
    return a*a;
    
}
public static double S(double a, double b){
    return a*b;
}
}
package ru;
public class MyFirstProgram {
    public static void main(String[] args){

System.out.println("Hello fucking World!");
hello("world");
hello("user");
hello("human");
double g = 4;
double s = g*g;
Square l = new Square(5);
Rectangle m = new Rectangle(666,13);

System.out.println("Площадь квадрата со стороной "+g+" = "+s);
System.out.println("Площадь квадрата со стороной "+l.a+" равна "+l.S());
System.out.println("Площадь прямоугольника со сторонами "+m.a+" и "+m.b+" равна "+m.R());
    }

public static void hello(String somebody) { 
    System.out.println("Hello Fucking "+ somebody + "!");
}


}
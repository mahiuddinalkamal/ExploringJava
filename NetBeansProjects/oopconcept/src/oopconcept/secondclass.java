package oopconcept;
public class secondclass {
double radius;    
public secondclass(double radius){
    this.radius=radius;//this second class ar object
 
}
public double getArea(){
 //radius=5.5d;
 double result=0d;
 result=radius*radius*3.1416;
        return result;

}
//public class Main {
 public static void main(String[] args) {
   secondclass circle1=new secondclass(9.5d);
  // circle1.radius=10.5d;  
   double result = circle1.getArea();
   System.out.println("the result is:" + result);
    }
}
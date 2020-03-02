package epam3.calculator;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Simple Calculator\nOption 1 to ADD two numbers\nOption 2 to SUBSTRACT two nubers\nOption 3 to MULTIPLY two numbers\nOption 4 to DIVIDE two numbers\n Option 0 to exit the calcultor");
            System.out.print("Enter the opion ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter number one ");
                    double a=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double b=sc.nextDouble();
                    Add a1=new Add(a,b);
                    a1.add();
                    break;
                case 2:
                    System.out.print("Enter number one ");
                    double s1=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double s2=sc.nextDouble();
                    Substract a2=new Substract(s1, s2);
                    a2.sub();
                    break;
                case 3:
                    System.out.print("Enter number one ");
                    double m1=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double m2=sc.nextDouble();
                    Multiply m = new Multiply(m1, m2);
                    m.mul();
                    break;
                case 4:
                    System.out.print("Enter number one ");
                    double d1=sc.nextDouble();
                    System.out.print("Enter number two ");
                    double d2=sc.nextDouble();
                    Divide d = new Divide(d1, d2);
                    d.divi();
                    break;
                case 0:
                    return ;
                default :
                    System.out.println("Enter valid option");
            }
        }
       
    }

}  



import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        System.out.println("enter 1 for add operation");
        System.out.println("enter 2 of sub operation");
        System.out.println("enter 3 for multiplacation operation ");
        System.out.println("enter 4 for division operation");
        Scanner sc =new Scanner(System.in);
        int value= sc.nextInt();
        System.out.println("enter first values to perfome operation");
        int value1=sc.nextInt();
        System.out.println("enter second values to perfome operation");
        int value2=sc.nextInt();

     switch (value){
         case 1:System.out.println("result ="+(value1+value2));
         break;
         case 2:System.out.println("result ="+(value1-value2));
             break;
         case 3:System.out.println("result ="+(value1*value2));
             break;
         case 4:
             if (value2!=0){
                 System.out.println("result ="+(value1/value2));

         }

             else {
                 System.out.println("Error: Division by zero is not allowed.");

             }

             break;
         default:
             System.out.println("invild option");
     }





    }

}
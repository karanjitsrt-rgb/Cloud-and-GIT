import java.util.Scanner;
class A{
    public static void main(String args[]){
    Scanner abc=new Scanner(System.in);
    System.out.println("Enter number:");
    int a=abc.nextInt();
    if(a==0||a>0){
        System.out.println("Number entered");}
        else{
            System.out.println("invalid number");
        }
}}
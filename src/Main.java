import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my code generator!");
        System.out.println("Please input the name of the instance variable");
        String variname = scanner.nextLine();
        System.out.println("Please input the type of variable " + variname + " is");
        String varitype = scanner.nextLine();
        System.out.println();
        System.out.println("//getter for " + variname);
        System.out.println("public " + varitype + " get" + variname + "(){");
        System.out.println("return " + variname + ";");
        System.out.println("}");
        System.out.println();
        System.out.println("//setter for " + variname);
        System.out.println("public void set" + variname + "(" + varitype + " " + variname + "){");
        System.out.println("this." + variname + " = " + variname + ";");
        System.out.println("}");
    }
}
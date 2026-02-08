public class Calculater {

    public static int multiply(int a,int b){
        return a * b;
    }

    public static int add(int a,int b){
        return a + b;
    }


    public static int square(int a){
        return multiply(a,a);
    }

    public static void main(String[]args){

        int num1 = multiply(3,4);
        int num2 = multiply(5,7);

        int x = square(add(num1,num2));
        System.out.print("Result of (3 * 4 + 5 * 7)^2: " +x);

        System.out.println();

        int num3 = add(4,7);
        int num4 = add(8,3);
        int y = add(square(num3),square(num4));
        System.out.print("Result of (4 + 7)^2 + (8 + 3)^2: " +y);
    }
}
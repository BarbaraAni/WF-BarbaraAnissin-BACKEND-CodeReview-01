import java.util.ArrayList;
import java.util.Scanner;

public class CodeReview01 {
    private static void calculateRectArea(int width, int height) {
        int area = height * width;
        System.out.println("The rectangular with a height of "+height+" and a width of "+width+" has an area of "+area+ "cm²");
    }
    private static void squareArea(int side){
        int sqArea = side*side;
        int sqPerimeter = side*4;
        System.out.println("Square-Area with side-length "+side+" is: "+sqArea+"cm²");
        System.out.println("Square-Circumference with side-length "+side+" is: "+sqPerimeter+"cm²");
    }

    private static void bonus() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        int now = 0;
        do {
            System.out.println("==Enter width==");
            int x = scanner.nextInt();
            System.out.println("==Enter height==");
            int y = scanner.nextInt();
            width.add(x);
            height.add(y);
            int ar = (width.get(now))*(height.get(now));
            System.out.println("==RESULT==\nArea = "+ar);
            now++;
        } while (now<4);
    }
    public static void main(String[] args) {
        System.out.println("====RECTANGLE====");
        calculateRectArea(20,30);
        calculateRectArea(40,40);
        calculateRectArea(10,60);
        calculateRectArea(5,2);
        System.out.println("====SQUARE====");
        squareArea(2);
        squareArea(4);
        squareArea(6);
        squareArea(23);
        System.out.println("====BONUS Part 1====");
        bonus();
        System.out.println("====BONUS Part 2====");

        // (10) create a Java program (.java) that can accept width and height of a rectangular as parameters to main()
        // and displays a solution in console. To do that, do some research on java programs that accept parameters.
    }
}

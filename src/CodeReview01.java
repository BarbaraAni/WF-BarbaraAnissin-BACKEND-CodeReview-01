import java.util.Scanner;

public class CodeReview01 {
    public static void calculateRectArea(int width, int height) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please input the rectangular width in cm:");
        //width = scanner.nextInt();
        //System.out.println("Please input the rectangular height in cm:");
        //height = scanner.nextInt();
        int area = height * width;
        System.out.println("The rectangular with a height of "+height+" and a width of "+width+" has an area of "+area+ "cm²");

        int[][] recArr = new int[4][2];
        for (int i=0; i<recArr.length; i++) {
            recArr[i][0] = height;
            recArr[i][1] = width;
        }
        System.out.println("recArr"+recArr[0][0]+" "+recArr[0][1]+" "+recArr[1][0]+" "+recArr[1][1]+" "+recArr[2][0]+" "+recArr[2][1]+" "+recArr[3][0]+" "+recArr[3][1]);
    }
    public static void squareArea(int side){
        int sqArr[] = new int [4];
        for (int i=0; i<sqArr.length; i++){
            sqArr[i] = side;
        }
        int sqArea = side*side;
        int sqPerimeter = side*4;
        System.out.println("Square-Area with side-length "+side+" is: "+sqArea+"cm²");
        System.out.println("Square-Circumference with side-length "+side+" is: "+sqPerimeter+"cm²");
    }
    public static void main(String[] args) {
        calculateRectArea(20,30);
        calculateRectArea(40,40);
        calculateRectArea(10,60);
        calculateRectArea(5,2);
        squareArea(2);
        squareArea(4);
        squareArea(6);
        squareArea(23);

        // (10) Save your test data (several widths / heights) for several different rectangles in two arrays.
        // Use the for loop to access the array elements, then perform rectangular surface calculation and display results

        // (10) create a Java program (.java) that can accept width and height of a rectangular as parameters to main()
        // and displays a solution in console. To do that, do some research on java programs that accept parameters.
    }
}

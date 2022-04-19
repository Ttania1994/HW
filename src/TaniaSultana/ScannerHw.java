package TaniaSultana;

public class ScannerHw {


    public static void main(String[] args) {


        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your product price");
        int num1=input.nextInt();
        System.out.println("Enter your product price1 ");
        int num2=input.nextInt();
        int total =num1+num2;
        System.out.println("Total product price :" +total);


        System.out.println("Total product price");
        int num3=input.nextInt();
        System.out.println("Enter your tax rate");
        int num4=input.nextInt();
        int totalAmountAfterTax =num3-num4;
        System.out.println("With out tax amount:" + totalAmountAfterTax );



        System.out.println("Enter product price");
        int num5=input.nextInt();
        System.out.println("Enter your same  product quantity");
        int num6=input.nextInt();
        int totalProductQuantity =num5*num6;
        System.out.println("totalProductQuantity: " + totalProductQuantity );





        System.out.println("Enter product quantity");
        int num7=input.nextInt();
        System.out.println("Enter person number");
        int num8=input.nextInt();
        int perPersonProductAmount =num7/num8;
        System.out.println("perPersonProductAmount"+ perPersonProductAmount);


    }

}

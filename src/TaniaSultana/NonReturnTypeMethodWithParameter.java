package TaniaSultana;

public class NonReturnTypeMethodWithParameter {

    public void  mango (int num1,int num2,int num3,int num4) {

        int total = num1 + num2 + num3 + num4;
        System.out.println("Total value:" + total);

    }


    public void  mango1 (int num1,int num2,int num3) {

        int total = num1 - num2 - num3;
        System.out.println("Total value:" + total);

    }
    public void  mango2 (int num1,int num2,int num3,int num4,int num5,int num6) {

        int total = num1 * num2 * num3 * num4 * num5 * num6 ;
        System.out.println("Total value:" + total);


    }
    public void  mango3 (double num1,double num2,double num3,double num4,double num5,double num6) {

        double total = (num1 +num2 + num3 ) /(num4 + num5 + num6);
        System.out.println("Total value:" + total);

    }


    public void  mango4 (int num1,int num2,int num3,int num4,int num5) {

        int total = (num1 + num2 + num3 +num4)/num5;
        System.out.println("Total value:" + total);

    }


    public void  mango5 (int num1,int num2,int num3,int num4,int num5,int num6) {

        int total = num1 + num2 + num3 - num4 * num5 / num6;
        System.out.println("Total value:" + total);

    }


        public static void main(String[] args) {


        NonReturnTypeMethodWithParameter obj=new NonReturnTypeMethodWithParameter();

        obj.mango(20,40,25,30);
        obj.mango1(200,30,70);
        obj.mango2(2,3,4,5,10,9);
        obj.mango3(50,30,50,2,4,1);
        obj.mango4(50,30,70,40,8);
        obj.mango5(50,40,50,20,12,34);
    }


    }

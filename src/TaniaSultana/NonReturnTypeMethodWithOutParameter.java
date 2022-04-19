package TaniaSultana;

public class NonReturnTypeMethodWithOutParameter {



    public void display() {

        System.out.println("I am Tania.I live in USA.");


    }
    public void display1() {
        int num = 100;
        int num1 = 60;
        int total = num + num1;


        System.out.println(total);


    }
    public void display2() {
        int num = 200;
        int num1 = 60;
        int total = num - num1;


        System.out.println(total);


    }
    public void display3() {
        int num = 20;
        int num1 = 60;
        int total = num * num1;


        System.out.println(total);


    }

    public void display4() {
        double num = 200;
        double num1 = 60;
        double total = num / num1;


        System.out.println(total);



        }

    public void display5() {
        double num = 400;
        double num1 = 60;
        double total = num * num1;


        System.out.println(total);




    }
        public static void main(String[] args) {

        NonReturnTypeMethodWithOutParameter obj=new NonReturnTypeMethodWithOutParameter();

          obj.display();
          obj.display1();
          obj.display2();
          obj.display3();
          obj.display4();
          obj.display5();



    }


}

package TaniaSultana;

public class ReturnTypeMethodWithoutParameter {

    public int dosummation1 (){


        int name = 100;
        int name1 = 50;
        int total = name1 + name1;
        System.out.println(total);

        return total;

    }


    public double dosummation2  () {


        double name=100;
        double name1=50;
        double total=name1+name1;

        System.out.println(total);

        return total;


    }


    public String dosummation3  () {


        String name = "Tania";
        String name1 = "Sultana";
        String fullName = name + " " +name1;

        System.out.println(fullName);

        return fullName;
    }


    public boolean dosummation4  () {


       boolean Avallable = true;


        System.out.println(Avallable);

        return Avallable;
    }

    public double dosummation5  () {


        double num = 100;
        double num1 = 500;
        double total = num + num1;

        System.out.println(total);

        return total;

    }

    public String dosummation6 () {

        String name1 = "Abu";
        String name2 = "Sayed";
        String fullName = name1 + " " +name2;

        System.out.println(fullName);

        return fullName;
    }

    public int dosummation7 (){


        int num = 120;
        int num1 = 60;
        int total = num + num1;
        System.out.println(total);

        return total;

    }


        public static void main (String[]args){

            ReturnTypeMethodWithoutParameter obj = new ReturnTypeMethodWithoutParameter();

            obj.dosummation1();
            obj.dosummation2();
            obj.dosummation3();
            obj.dosummation4();
            obj.dosummation5();
            obj.dosummation6();
            obj.dosummation7();
        }


    }

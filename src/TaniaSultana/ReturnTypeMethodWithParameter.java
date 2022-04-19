package TaniaSultana;

public class ReturnTypeMethodWithParameter {

    public String orange (String name ){

        System.out.println("Father name:"+name);

        return name;

    }

    public String orange1 (String name,int age ) {

        System.out.println("Father name:" + name + " " +"Age is:" + age);

        return name + age;

    }

    public String orange2 (String name,int age,String address) {


        System.out.println("Father name:" + name + " " +  "Age is:" + age + " His address is:" + address);

        return name + age + address;

    }
        public double orange3 (double num1,double num2,double num3,double num4){

            return num1*num2*num3*num4;

    }
    public int orange4 (int age ) {

        System.out.println("My age is:" + age);

        return age;
    }

    public String orange5 (String name,int age ) {

        System.out.println("My name is:" + name +" " + "Age is: " + age);

        return name+age;
    }


    public static void main(String[] args) {

        ReturnTypeMethodWithParameter obj=new ReturnTypeMethodWithParameter();

        obj.orange("Jamal nasser");
        obj.orange1("Jamal nasser",50);
        obj.orange2("Jamal nasser",50,"Bangladesh");

        System.out.println(obj.orange3(2,4,6,8));
        System.out.println(obj.orange4(30));
        System.out.println(obj.orange5("Tania",25));

    }


}


   public class personclass {

    int age ;
    String Name ;

    void m1(){

    }



    personclass[] m2 (){
        personclass p1 = new personclass();
            p1.age = 21;
            p1.Name = "Ram";

        personclass p2 =new personclass();
            p2.age = 31;
            p2.Name = "John";

        personclass p3 = new personclass();
            p3.age = 68;
            p3.Name = "Chaju laal";

            personclass[] arr = {p1,p2,p3};

            return arr;
    }

       public static void main(String[] args) {

        personclass pc = new personclass();

           personclass[] len = pc.m2();

           for(int i = 0 ; i < len.length ; i++){

               personclass a = len[i];  // intelligent line by me

               System.out.println( "Name--> " + a.Name + "    age--> " + a.age);
           }

       }
}

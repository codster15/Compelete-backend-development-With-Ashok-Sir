//logical program
//
//program => write a java method which will return player data based  n player id
//
//player Data --> id , name ,age
//
//7--- > dhoni
//
//18 --> kohali
//
//45 --> rohit sharma



public class PlayerData {
    public static void main(String[] args) {

        PlayerData pd = new PlayerData();

       player great =  pd.ShowPlayer(7);

        System.out.println(great.name);
        System.out.println(great.age);
        System.out.println(great.id);


    }
    player ShowPlayer (int id){
        player p = new player();


        if(id == 7){
            p.age = 42;
            p.name = "Dhoni";
            p.id = 7;
        } else if (id == 18) {
            p.age = 35;
            p.name = "Kohli";
            p.id = 18;
        }else if(id == 45){
            p.age = 37;
            p.name = "Rohit Sharma";
            p.id = 45;
        }

        return p;
    }
}


class player{
    int age ;
    String name ;

    int id;
}

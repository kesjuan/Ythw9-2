public class Pokemon {
    String name;
    int level;

   // Pokemon(){
     //   level = 1;}

    Pokemon (String pName, int pLevel){
        this.name = pName;
        this.level = pLevel;
    }

    void attack(){
        System.out.println(name + " attack!");
    }

}

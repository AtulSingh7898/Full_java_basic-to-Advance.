class Character {
    String name;
    double healthPoint;
    String ability;

    //Constructor overloading 
    Character(String name){
        this.name = name;
    }
    Character(String name, double healthPoint){
        this.name = name;
        this.healthPoint = healthPoint;
    }
    Character(String name, double healthPoint, String ability){
        this.name = name;
        this.healthPoint = healthPoint;
        this.ability = ability;
    }

    void Action(){
        System.out.println("The Action of Character "+ability);
    }
    void Attack(){
        System.out.println("The player attacking point "+healthPoint);
    }
}

class SpacializedCharacter{
    String Worrior;
    String Mage;
    String Rogou;

    
}



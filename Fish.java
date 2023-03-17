public class Fish extends Animal {
    public Fish (int Stamina){
        super(Stamina);
    }
    public void Swim(){
        System.out.println(" The fish swam away ");
        Stamina -= 50;
    }
    public void EatFood(){
        System.out.println(" The fish eat food ");
        Stamina += 30;
    }
    public void Hide(){
        System.out.println(" The fish hides ");
        Stamina -= 20;
    }
    public void Bite(){
        System.out.println(" The Fish Bites");
        Stamina -= 5;
    }
}

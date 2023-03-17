public class Animal{
        protected int Stamina = 100;
    public int ShowStamina(){
        System.out.print(" Current Stamina: " + Stamina);
        return Stamina;
    }
    public Animal(int Stamina){
     this.Stamina = Stamina;
    }
    public static void main(String args[]){
        Owl owl = new Owl(100);
        Lion lion = new Lion(100);
        Fish fish = new Fish(100);
        owl.LandTree();
        owl.Observe();
        owl.Fly();
        owl.SnatchPrey();
        System.out.println("_______________");
        lion.RunToPrey();
        lion.Attack();
        lion.Eat();
        lion.Sleep();
        System.out.println("_______________");
        fish.Swim();
        fish.EatFood();
        fish.Hide();
        fish.Bite();

        
    }
}


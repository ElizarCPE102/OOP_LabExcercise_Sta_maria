public class Lion extends Animal {
    public Lion (int Stamina){
        super(Stamina);
    }
    public void Attack(){
        System.out.println(" The Lion attacks ");
        Stamina -= 25;
    }
    public void RunToPrey(){
        System.out.println(" The Lion Ran to chase Prey ");
        Stamina -= 30;
    }
    public void Sleep(){
        System.out.println(" The Lion Sleep ");
        Stamina += 35;
    }
    public void Eat(){
        System.out.println(" The Lion Eats ");
        Stamina += 10;
    }
}

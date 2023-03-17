public class Owl extends Animal{
    public Owl (int Stamina){
        super(Stamina);
    }
    public void Fly(){
        System.out.println(" The owl flies ");
        Stamina -= 10;
    }
    public void SnatchPrey(){
        System.out.println(" The owl snatches the prey ");
        Stamina -= 30;
    }
    public void LandTree(){
        System.out.println(" The owl lands in the branches ");
        Stamina -= 5;
    }
    public void Observe(){
        System.out.println(" The owl is observing it's surroundings ");
        Stamina -= 1;
    }
}

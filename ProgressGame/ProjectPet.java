package Progress2;

public class ProjectPet extends Project{
    
        //parameters
        public int energy = 100;//energy of the pet
        public int health = 100;//health of the pet
        public int hunger = 100;//hunger of pet
        public int level = 1;//level of the pet
        public String petname = "";//name of the pet
        public String status = "";// to show pet if it's happy or sad
        public int hatchrate;// egg hatch timer

        public ProjectPet(String petname,int energy,int health,int hunger,int level){
            this.energy = energy;
            this.health = health;
            this.hunger = hunger;
            this.level = level;
            this.petname = petname;
           }

           //candy
    public void eatFood1(){
        energy += 5;
        hunger += 3;
    }
    //carrot
    public void eatFood2(){
        energy += 5;
        hunger += 3;
    }
    //Apple
    public void eatFood3(){
        energy += 5;
        hunger += 3;
    }
    //popsicle
    public void eatFood4(){
        energy += 5;
        hunger += 3;
    }
    //tomato
    public void eatFood5(){
        energy += 5;
        hunger += 3;
    }
    //orange
    public void eatFood6(){
        energy += 5;
        hunger += 3;
    }
    //round popsicle
    public void eatFood7(){
        energy += 5;
        hunger += 3;
    }
    //Eggplant
    public void eatFood8(){
        energy += 5;
        hunger += 3;
    }
    //Water Melon
    public void eatFood9(){
        energy += 5;
        hunger += 3;
    }

    public void Reaction(){
        
    }
}

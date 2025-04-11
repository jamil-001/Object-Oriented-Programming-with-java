
class Animal {
    private String habitat;
    private String diet;

    public Animal(String habitat, String diet) {
        this.habitat = habitat;
        this.diet = diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void displayCharacteristics() {
        System.out.println("Habitat: " + habitat);
        System.out.println("Diet: " + diet);
    }
}

class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String habitat, String diet, boolean hasFur) {
        super(habitat, diet);
        this.hasFur = hasFur;
    }

    @Override
    public void displayCharacteristics() {
        super.displayCharacteristics();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String habitat, String diet, boolean canFly) {
        super(habitat, diet);
        this.canFly = canFly;
    }
    public void displayCharacteristics() {
        super.displayCharacteristics();
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

public class task07 {
    public static void main(String[] args) {
        Animal tiger = new Mammal("Forest", "Carnivore", true);
        Animal eagle = new Bird("Mountains", "Carnivore", true);

        System.out.println("=== Mammal (Tiger) ===");
        tiger.displayCharacteristics();

        System.out.println("\n=== Bird (Eagle) ===");
        eagle.displayCharacteristics();
    }
}

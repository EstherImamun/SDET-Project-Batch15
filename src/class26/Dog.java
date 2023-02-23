package class26;

public class Dog {
    private String name;
    private String colour;
    private String breed;

    public Dog(String name, String colour, String breed) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

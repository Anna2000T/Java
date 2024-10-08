package zoo;

import zoo.Animal;

public abstract class Bird extends Animal {

    String breed = "";
    String sound ="cspcpscpsc";
    boolean isLandAnimal;

    public Bird( String breed, int age,String name)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    String breed() {

        return this.breed;
    }


    void sound() {
        System.out.println(this.sound + " " + this.sound);

    }


    boolean isLandAnimal() {

        return this.isLandAnimal;
    }
    public void setSound(String sound)
    {
        this.sound =sound;

    }
    public void setIsLandAnimal(boolean isLandAnimal)
    {
        this.isLandAnimal = isLandAnimal;
    }
}

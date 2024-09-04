public class NormalCar {
    int wheel=4;
    String color="white";
  // constructor
    public void NormalCar(){
       this.wheel=wheel;
       this.color=color;
       System.out.println("I am a constructor");
    }

    public void run(){
        System.out.println("Car is running.");
    }
    public void carBreak(){
        System.out.println("Car is applying a break");
    }
}

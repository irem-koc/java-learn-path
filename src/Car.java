import java.sql.SQLOutput;

class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;
    //Constructor
    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 180;
        this.color = color;
        System.out.println("Nesne oluşturuldu");
    }
    // davranışlar
    void increaseSpeed(int increment){
        if (speedLimit<speed+increment){
            speed = speedLimit;
        }else{
            speed += increment;
        }
    }
    void decreaseSpeed(int decrement){
        if (speed>0){
            speed -= decrement;
        }
    }
    void printSpeed(){
        System.out.println("Speed: " + speed);
    }
}

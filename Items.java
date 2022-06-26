//Amal Mo-Allahyiddi
//Sadiya Halimat Mohammed
//Abubakar Al-amin Garba
//Abubakar Umar Dangi
//Ahmad Mohamed Abdulwahab Ali Rabeea
//Chinecherem Joseph Okoli Onumazi
package Avengers_Group;


public class Items {

    private String name;
    private String shape;
    private double weight;
    private double length;
    private double radius;
    private double baseLength;
    private double apothem;
    private double height;
    
    
    public Items(String name, String shape, double weight, double length, double radius, double baseLength,double apothem, double height) {
        this.name = name;
        this.shape = shape;
        this.weight = weight;
        this.length = length;
        this.radius = radius;
        this.baseLength = baseLength;
        this.apothem = apothem;
        this.height = height;
     
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }
    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

  public double calculateVolume() {
        double volume = 0;
        switch (this.shape) {
            case "pentagon" : {volume = 5*0.5* this.baseLength *this.apothem* this.height; break;}
            case "cubic" : {volume = this.length * this.length * this.length; break;}
            case "cylindrical" : {volume = Math.PI * this.radius * this.radius * this.height; break;}
            default : {break;}
        }
        return volume;
    }

    public void printInfo() {
        System.out.println("Name : " + this.name + " , " + "Shape : " + this.shape + " , " + "Weight : " + this.weight);
    }
}

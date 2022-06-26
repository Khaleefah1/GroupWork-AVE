//Amal Mo-Allahyiddi
//Sadiya Halimat Mohammed
//Abubakar Al-amin Garba
//Abubakar Umar Dangi
//Ahmad Mohamed Abdulwahab Ali Rabeea
//Chinecherem Joseph Okoli Onumazi
package Avengers_Group;
public class Containers {
    private String size;
    private double length;
    private double width;
    private double height;

    public Containers(String size) {
        this.size = size;
        if (size.equals("small")) {
            this.length = 6.06;
            this.width = 2.43;
            this.height = 2.59;
        } else if (size.equals("big")) {
            this.length = 12.01;
            this.width = 2.43;
            this.height = 2.59;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    public void printInfo() {
        System.out.println("Size : " + this.size + " , Length : " + this.length + " , Width : " + this.width + " , Height : " + this.height);
    }
}

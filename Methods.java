package Avengers_Group;


import java.util.*;
import javax.swing.JOptionPane;

public class Methods {
    List<Items> itemList = new ArrayList<>();
    Map<Items, Integer> order = new HashMap<>();

    public double totalVolume() {
        double volume = 0;
        for (Map.Entry<Items, Integer> entry : this.order.entrySet()) {
            Items item = entry.getKey();
            Integer quantity = entry.getValue();
            volume += (item.calculateVolume() * quantity);
        }
        return volume;
    }

    public double totalWeight() {
        double weight = 0;
        for (Map.Entry<Items, Integer> entry : this.order.entrySet()) {
            Items item = entry.getKey();
            Integer quantity = entry.getValue();
            weight += (item.getWeight() * quantity);
        }
        return weight;
    }
  //Amal Mo-Allahyiddi
  //Sadiya Halimat Mohammed
  //Abubakar Al-amin Garba
  //Abubakar Umar Dangi
  //Ahmad Mohamed Abdulwahab Ali Rabeea
  //Chinecherem Joseph Okoli Onumazi
    public String bestShipmentMethod() {
        if(!this.order.isEmpty()) {
            double volume = this.totalVolume();
            Containers smallContainers = new Containers("small");
            Containers bigContainers = new Containers("big");
            double bigContainerVolume = bigContainers.calculateVolume();
            double smallContainerVolume = smallContainers.calculateVolume();
            int smallContainersNumber = (int) Math.ceil(volume / smallContainerVolume);
            int smallContainersCount = smallContainersNumber % 2;
            int bigContainersNumber = smallContainersNumber - smallContainersCount;
            double totalVolume = bigContainerVolume * bigContainersNumber;
            double smallContainerWeight = 0;
            double bigContainerWeight = 0;
            List<Items> itemsOrder = new ArrayList<>();
            this.order.forEach((item, quantity) -> {
                for(int j=0; j<quantity; j++) {
                    itemsOrder.add(item);
                }
            });
            itemsOrder.sort((o1, o2) -> ((Double.compare(o1.calculateVolume(), o2.calculateVolume()))));
            for (int i = itemsOrder.size() - 1; i >= 0; i--) {
                if (totalVolume - itemsOrder.get(i).calculateVolume() >= 0) {
                    totalVolume -= itemsOrder.get(i).calculateVolume();
                    bigContainerWeight += itemsOrder.get(i).getWeight();
                }
            }
            smallContainerWeight = this.totalWeight() - bigContainerWeight;
            double cost = bigContainersNumber * 1800 + (smallContainerWeight <= 500 ? 1000 : 1200);
            
            String Result = cost +"€„  - Best Shipement method: "+bigContainersNumber + " Big Container With Weight Of " + bigContainerWeight + "Kg & " + smallContainersCount + " Small Container With Weight Of " + smallContainerWeight+" KG";
            return Result;
        }
        else{
            JOptionPane.showMessageDialog(null, "Place an order first");
            return "€„  - Best Shipement method: ";
        }
    }

    public void addItems(String name, String shape, double weight, double length, double radius, double baseLength,double apothem, double height) {
        Items item = new Items(name, shape, weight, length, radius, baseLength,apothem, height);
        this.itemList.add(item);
    }

}

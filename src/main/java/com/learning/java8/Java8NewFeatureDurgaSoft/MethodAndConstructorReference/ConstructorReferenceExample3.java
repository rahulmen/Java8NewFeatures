package com.learning.java8.Java8NewFeatureDurgaSoft.MethodAndConstructorReference;

interface SoldierInfo{

    Soldier getInfo();

}

class Soldier{

    String soldierName;
    String regiment;
    String medals;

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public String getRegiment() {
        return regiment;
    }

    public void setRegiment(String regiment) {
        this.regiment = regiment;
    }

    public String getMedals() {
        return medals;
    }

    public void setMedals(String medals) {
        this.medals = medals;
    }

    Soldier(){
        this("Rahul Mendiratta","BSF Indian Army","Bharat Rathan & Bravery Award");
    }

    public Soldier(String name,String regiment, String medals) {
        this.soldierName=name;
        this.regiment = regiment;
        this.medals = medals;
    }

    @Override
    public String toString(){
        return "Soldier Name : "+this.soldierName+"\nSoldier Regiment : "+this.regiment+"\nSoldier medals : "+this.medals;
    }
}

public class ConstructorReferenceExample3 {

    public static void main(String[] args) {
        SoldierInfo soldierInfo = Soldier::new;
        System.out.println(soldierInfo.getInfo());
    }
}

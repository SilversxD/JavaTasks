package ru.silversxd.javaTasks.task3.ex2;

public class Human {
    Head head;
    Leg leg1,leg2;
    Hand hand1,hand2;
    public Human(){
        head = new Head("Brown","Straight");
        leg1 = new Leg(4,60);
        leg2 = new Leg(5,61);
        hand1 = new Hand("Blue",35);
        hand2 = new Hand("Blue",34);
    }
    public Human(String hairColor, String hairType, int length, int weight, String color,int handLength){
        head = new Head(hairColor,hairType);
        leg1 = new Leg(length,weight);
        leg2 = new Leg(length,weight);
        hand1 = new Hand(color,handLength);
        hand2 = new Hand(color,handLength);
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leg1=" + leg1 +
                ", leg2=" + leg2 +
                ", hand1=" + hand1 +
                ", hand2=" + hand2 +
                '}';
    }

    public static void main(String[] args) {
//    Head head = new Head("Brown","Straight");
//    Leg leg = new Leg(4,60);
//    Hand hand = new Hand("Blue",34);
//        System.out.println(head.getHairColor()+ " " + head.getHairType()+ " " +leg.getLength()+ " " +leg.getWeight()+ " " +hand.getColor()+ " " +hand.getHandLength());
//        System.out.println(head.changeHairType("Strong"));
//        System.out.println(head.changeColor("Red"));
//        System.out.println(leg.changeLength(100));
//        System.out.println(leg.changeWeight(65));
//        System.out.println(hand.changeColor("Green"));
//        System.out.println(hand.changeLength(43));
        System.out.println(new Human());
        System.out.println(new Human());
    }
}

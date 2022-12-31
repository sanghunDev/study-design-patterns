package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPoint = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPoint);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    //가장 추상적인 타입을 사용한다
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}

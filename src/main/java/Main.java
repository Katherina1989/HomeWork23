public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();
        for (int i = 0; i < 5; i++) {
            box1.addFruit(new Apple());
            box2.addFruit(new Orange());
        }
        for (int i = 0; i < 3; i++) {
            box3.addFruit(new Apple());
        }
        box4.addFruit(new Orange());
        box4.addFruit(new Orange());
        System.out.println(box3.compare(box4));
        System.out.println(box1.compare(box4));
        System.out.println("Вес коробки с " + box1.getBoxType() + " равен " + box1.getWeight());
        System.out.println("Вес коробки с " + box2.getBoxType() + " равен " + box2.getWeight());
        System.out.println("Вес коробки с " + box3.getBoxType() + " равен " + box3.getWeight());
        System.out.println("Вес коробки с " + box4.getBoxType() + " равен " + box4.getWeight());

        box1.move(box2);
        box1.move(box3);


        System.out.println("Вес коробки с " + box1.getBoxType() + " равен " + box1.getWeight());
        System.out.println("Вес коробки с " + box2.getBoxType() + " равен " + box2.getWeight());
        System.out.println("Вес коробки с " + box3.getBoxType() + " равен " + box3.getWeight());
        System.out.println("Вес коробки с " + box4.getBoxType() + " равен " + box4.getWeight());

    }
}

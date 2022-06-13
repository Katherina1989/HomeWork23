import java.util.ArrayList;
import java.util.List;

public class Box {
    public static final String EMPTY_BOX = "пустая коробка";
    public static final String APPLE = "Яблоко";
    public static final String ORANGE = "Апельсин";
    private List<Fruit> fruits = new ArrayList<>();

    private String boxType = EMPTY_BOX;

    public void addFruit(Apple apple) {
        addFruit((Fruit) apple);
    }

    public void addFruit(Orange orange) {
        addFruit((Fruit) orange);
    }
    private void addFruit(Fruit fruit) {
        if (EMPTY_BOX.equals(boxType)) {
            boxType = fruit.getClass().equals(Apple.class) ? APPLE : ORANGE;
        }
        if (!fruit.getName().equals(boxType)) {
            System.out.println("Коробка не для " + (boxType.equals(APPLE) ? "яблок" : "апельсинов"));
            return;
        }
        fruits.add(fruit);
    }

    public void addFruits(List<Fruit> fruits) {
        if (fruits == null || fruits.isEmpty()) {
            System.out.println("А фруктов то и нет");
            return;
        }
        if (EMPTY_BOX.equals(boxType)) {
            boxType = fruits.get(0).getClass().equals(Apple.class) ? APPLE : ORANGE;
        }
        if (!boxType.equals(getType(fruits))) {
            System.out.println("Коробка не для " + (boxType.equals(APPLE) ? "яблок" : "апельсинов"));
            return;
        }
        this.fruits.addAll(fruits);
    }

    public float getWeight() {
        return boxType.equals(APPLE) ? 1.0f * fruits.size() : 1.5f * fruits.size();
    }

    public boolean compare(Box box) {
        return box.getWeight() == getWeight();
    }

    public void move(Box box) {
        if (box.getBoxType().equals(boxType) || EMPTY_BOX.equals(box.getBoxType())) {
            box.addFruits(fruits);
            fruits.clear();
        } else {
            System.out.println("Коробка не для " + (boxType.equals(APPLE) ? "яблок" : "апельсинов"));
        }
    }

    public String getBoxType() {
        return boxType;
    }

    private String getType(List<Fruit> fruits) {
        return fruits.get(0).getClass().equals(Apple.class) ? APPLE : ORANGE;
    }
}


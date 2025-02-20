package generic_type;

public class Main {
    public static void main(String[] args) {
        String tipoString = "Genérico String";
        Integer tipoInteger = 1;
        Double tipoDouble = 2.0;

        Box<String> box = new Box<>();
        box.set(tipoString);
        System.out.println(box.get());

        Box<Integer> box2 = new Box<>();
        box2.set(tipoInteger);
        System.out.println(box2.get());

        Box<Double> box3 = new Box<>();
        box3.set(tipoDouble);
        System.out.println(box3.get());
    }
}

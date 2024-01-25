package task06;

public class task06 {
    public static void main(String[] args) {
        // Введите свое решение ниже

        // Работа со StringBuilder
        StringBuilder builder = new StringBuilder("Hello");

        System.out.println(builder.toString());

        builder.append(" World");
        builder.append("!");
        System.out.println("After append: " + builder.toString());

        builder.insert(0, "Greetengs: ");
        System.out.println("After insert: " + builder.toString());

        builder.delete(0, 6);
        System.out.println("After deletion: " + builder.toString());

        builder.replace(7, 12, "Universe ");
        System.out.println("After replacement: " + builder.toString());

        String finalString = builder.toString();
    }
}

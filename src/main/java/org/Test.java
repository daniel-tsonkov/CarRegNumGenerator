package org;

public class Test {
    public static void main(String[] args) {
        // Цветове на текста
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";
        String purple = "\u001B[35m";
        String cyan = "\u001B[36m";
        String white = "\u001B[37m";

        // Пример за използване на цветове
        System.out.println(red + "Това е червен текст" + reset);
        System.out.println(green + "Това е зелен текст" + reset);
        System.out.println(blue + "Това е син текст" + reset);
    }
}

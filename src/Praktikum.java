public class Praktikum {
    public static void main(String[] args) {
        Hamster homka = new Hamster();
        int food = 15;
        homka.name = "Хомка";
        homka.age = 1;
        homka.weight = 420;
        homka.color = "Чёрный";
        System.out.println("Имя: " + homka.name);
        System.out.println("Возраст: " + homka.age);
        System.out.println("Вес: " +  homka.weight);
        System.out.println("Цвет: " +  homka.color);

        // Покормите хомяка и напечатайте его вес
        public static int eat(int food){
            homka.weight = homka.weight - food;
            return homka.weight;
        }
        homka.
        System.out.println("Новый вес: " + homka.weight);
    }
}
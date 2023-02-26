package kz.tishuk.geekbrainscourse.lesson5;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Тишук", "5425267");
        phoneBook.add("Романенко", "12435347498");
        phoneBook.add("Руткевич", "6758522");
        phoneBook.add("Куракин", "2523627");
        phoneBook.add("Кащук", "23526");
        phoneBook.add("Мышук", "2526262");
        phoneBook.add("Филимонова", "2526-262626");
        phoneBook.add("Аргимбаев", "444441157489");
        phoneBook.add("Лакида", "084562342");
        phoneBook.add("Тишук", "23426");

        System.out.println("Запрос телефона " + phoneBook.getPhone("Тишук"));
        System.out.println("Вся книга " + phoneBook.getAll());
    }
}

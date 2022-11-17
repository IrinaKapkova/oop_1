public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
//        До конструктора создание объектов происходило в таком ключе:
//        Human maxim1 = new Human();
//        maxim1.yearOfBirth=1988;
//        maxim1.name="Максим";
//        maxim1.town="Минск" ;
//        maxim1.jobTitle="бренд-менеджером";
//        System.out.println(maxim1);
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджером");
        System.out.println(maxim);
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        System.out.println(anya);
        Human katya = new Human(1992, "Калининград", "Минск", "продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);
        System.out.println("Задача 3");

        Automobile ladaGranta = new Automobile("Lada", "Granta", 1.7f, "желтый", 2015, "России");
        System.out.println(ladaGranta);
        Automobile audiA8 = new Automobile("Audi", "A8", 3.0f, "черный", 2020, "Германии");
        System.out.println(audiA8);
        Automobile bmvZ8 = new Automobile("BMW", "Z8", 3.0f, "черный", 2021, "Германии");
        System.out.println(bmvZ8);
        Automobile kiaSportage4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южной Корее");
        System.out.println(kiaSportage4);
        Automobile hyundaiAvante = new Automobile("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южной Корее");
        System.out.println(hyundaiAvante);

    }
}
public class Main {
    public static void main(String[] args) {
//Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
//Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
//Задача №6
        var fighterOne = 78.2;
        System.out.println("Вес первого бойца " + fighterOne + " кг");
        var fighterTwo = 82.7;
        System.out.println("Вес второго бойца " + fighterTwo + " кг");
        var totalWeight = fighterOne + fighterTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var differenceWeight = fighterTwo - fighterOne;
        System.out.println("Разница в весе с помощью вычитания " + differenceWeight + " кг");
//Задача №7
        differenceWeight = fighterTwo % fighterOne;
        System.out.println("Разница в весе с помощью остатка деления " + differenceWeight + " кг");
//Задача №8.1
        var workHours = 640;
        var oneWorkerHours = 8;
        var amountWorkers = workHours / oneWorkerHours;
        System.out.println("Всего работников в компании - " + amountWorkers + " человек");
//Задача №8.2
        amountWorkers = amountWorkers + 94;
        workHours = amountWorkers * oneWorkerHours;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}
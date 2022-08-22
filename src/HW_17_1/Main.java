package HW_17_1;

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow(150, "Alex", "female", 6);
        Cow cow2 = new Cow(160, "Felix", "female", 5);
        Cow cow3 = new Cow(140, "Elix", "female", 4);
        Cow cow4 = new Cow(145, "Dilix", "female", 3);
        Cow cow5 = new Cow(145, "Relix", "female", 2);
        Cow cow6 = new Cow(146, "Lelix", "female", 3);
        Cow[] cowBarn1 = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cowBarn2 = {cow6};

        Sheep sheep1 = new Sheep(30, "Andrey", "male", 7);
        Sheep sheep2 = new Sheep(22, "Sergey", "female", 4);
        Sheep sheep3 = new Sheep(27, "Ivan", "male", 5);
        Sheep sheep4 = new Sheep(27, "Ivan", "male", 5);
        Sheep[] sheepBarn1 = {sheep1, sheep2, sheep3};
        Sheep[] sheepBarn2 = {sheep4};


        Horse horse1 = new Horse(200, "Herhules", "male", 8);
        Horse horse2 = new Horse(230, "Aygashka", "male", 10);
        Horse horse3 = new Horse(210, "Toru", "male", 9);
        Horse[] horseBarn1 = {horse1, horse2};
        Horse[] horseBarn2 = {horse3};

        Farm farm1 = new Farm("Samarbek", "KoyTash", cowBarn1, sheepBarn1, horseBarn1);
        Farm farm2 = new Farm("Samarbek", "KumTuu", cowBarn2, sheepBarn2, horseBarn2);

        farm1.getInformation();
        System.out.println();
        farm2.getInformation();
    }
}
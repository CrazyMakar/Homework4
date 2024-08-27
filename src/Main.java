public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        System.out.println();

        System.out.println("Задание №2");
        int temp = 5;
        if (temp >= 5){
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        System.out.println();

        System.out.println("Задание №3");
        int speedAuto = 70;
        if (speedAuto > 60) {
            System.out.println("Если скорость " + speedAuto + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedAuto + ", то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задание №4");
        int ageHuman = 3;
        if (ageHuman >= 2 &&  ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman >= 7 &&  ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (ageHuman >= 18 &&  ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }
        System.out.println();

        System.out.println("Задание №5");
        int ageChild = 5;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на  аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

//        System.out.println("Задание №6"); // Простое решение
//        int placeInTheCarriage = 56;
//        if (placeInTheCarriage < 60) {
//            System.out.println("В вагоне " + placeInTheCarriage +  " человек, а значит есть ещё сидячие и стоячие места");
//        } else if (placeInTheCarriage >= 60 && placeInTheCarriage < 102) {
//            System.out.println("В вагоне " + placeInTheCarriage +  " человек, а значит есть ещё стоячие места");
//        } else if (placeInTheCarriage == 102) {
//            System.out.println("В вагоне " + placeInTheCarriage +  " человек, а значит в вагоне нет свободных мест");
//        }
//        else {
//            System.out.println("В вагоне уже 102 человека, а значит " + (placeInTheCarriage - 102) + " должны перейти в другой вагон");
//        }
//        System.out.println();

        System.out.println("Задание №6"); // Усложненное решение
        int passengers = 65;
        byte placeInTheCarriage = 102;
        byte placeInTheCarriageSedentary = 60;
        byte placeInTheCarriageStanding = (byte) (placeInTheCarriage - placeInTheCarriageSedentary);
        if (passengers < 60) {
            System.out.println("В вагоне " + passengers +  " человек, а значит есть ещё " + (placeInTheCarriageSedentary - passengers) + " сидячих и " + placeInTheCarriageStanding+ " стоячих места");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("В вагоне " + passengers +  " человек, а значит в вагоне нет сидячих, но есть " + (placeInTheCarriageStanding - (passengers - placeInTheCarriageSedentary)) + " стоячих места");
        } else if (passengers == 102) {
            System.out.println("В вагоне " + passengers +  " человека, а значит в вагоне нет свободных мест");
        }
        else {
            System.out.println("В вагоне уже " + placeInTheCarriage + " человека, а значит " + (passengers - placeInTheCarriage) + " должны перейти в другой вагон");
        }
        System.out.println();

        System.out.println("Задание №7");
        int one = 188;
        int two = 188;
        int three  = 188;
        boolean bigOneLittleTwo = one > two;
        boolean bigOneLittleThree = one > three;
        boolean bigTwoLittleOne = two > one;
        boolean bigTwoLittleThree = two >three;
        boolean bigThreeLttleOne = three > one;
        boolean bigThreeLttleTwo = three > two;
        boolean oneEqualsTwo = one == two;
        boolean oneEqualsThree = one == three;
        boolean twoEqualsThree = two == three;
        boolean equality = oneEqualsTwo && twoEqualsThree;
        if (bigOneLittleThree && bigOneLittleTwo) {
            System.out.println("Первое число больше второго и больше третьего числа");
        } else if (bigTwoLittleOne && bigTwoLittleThree) {
            System.out.println("Второе число больше первого и больше третьего числа");
        } else if (bigThreeLttleOne && bigThreeLttleTwo) {
            System.out.println("Третье число больше второго и больше первого числа");
        } else if (equality) {
            System.out.println("Все числа между собой равны");
        } else if (oneEqualsTwo && bigOneLittleThree){
            System.out.println("Первое и второе число между собой равны, и больше третьего");
        } else if (oneEqualsThree && bigOneLittleTwo){
            System.out.println("Первое и третье число между собой равны, и больше второго");
        } else {
            System.out.println("Второе и третье число между собой равны, и больше первого");
        }
        System.out.println();
    }
}
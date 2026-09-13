void main() {
//Задача 1
    int age = 17;
    if (age >= 18) {
        System.out.println("Если возраст человека = " + age + " ты достиг совершеннолетия");
    } else {
        System.out.println("Если возраст человека = " + age + " ты не достиг совершеннолетия, нужно немного подождать");
    }

//Задача 2
    int temperanure = 6;
    if (temperanure <= 5) {
        System.out.println("На улице холодно, нужно надеть шапку, если температура = " + temperanure);
    } else {
        System.out.println("Сегодня тепло, можно идти без шапки, если температура = " + temperanure);
    }
    // Задача 3
    int speed = 40;
    if (speed > 60) {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
    } else {
        System.out.println("Если скорость " + speed + ", можно ездить спокойно");
    }

    // Задача 4
    int manAge = 40;
    if (manAge >= 2 && manAge <= 6) {
        System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в детский сад");
    } else if (manAge >= 7 && manAge <= 17) {
        System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в школу");
    } else if (manAge >= 18 && manAge <= 24) {
        System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в университет");
    } else if (manAge > 24) { // В ТЗ: "больше 24"
        System.out.println("Если возраст человека равен " + manAge + ", то ему пора ходить на работу");
    }

    // Задача 5
    int babyAge = 13;
    if (babyAge < 5) {
        System.out.println("Если возраст ребенка равен " + babyAge + ", то ему нельзя кататься на аттракционе");
    } else if (babyAge >= 5 && babyAge <= 14) {
        System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
    } else if (babyAge > 14) {
        System.out.println("Если возраст ребенка равен " + babyAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
    }

    // Задача 6
    int trainPeople = 10;
    int totalSeats = 102;
    int sittingSeats = 60;

    if (trainPeople < sittingSeats) {
        System.out.println("Есть сидячие места");
    } else if (trainPeople < totalSeats) {
        System.out.println("Есть стоячие места");
    } else {
        System.out.println("Нет мест");
    }

    // Задача 7
    int one = 1;
    int two = 2;
    int three = 3;

    if (one >= two && one >= three) {
        System.out.println("Наибольшее число " + one);
    } else if (two >= one && two >= three) {
        System.out.println("Наибольшее число " + two);
    } else {
        System.out.println("Наибольшее число " + three);
    }
}

    }
}




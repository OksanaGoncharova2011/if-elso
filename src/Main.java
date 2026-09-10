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
    //Задача 3
    int speed = 40;
    if (speed >= 60) {
        System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
    } else {
        System.out.println(" Если скорость " + speed + " , можно ехать спокойно");
    }
    //Задача 4

    int man = 40;
    if (man >= 2 && man <= 6) {
        System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в садик");
    } else if (man >= 7 && man <= 17) {
        System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в школу");
    } else if (man >= 18 && man <= 24) {
        System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить в университет");
    } else if (man >= 24 && man <= 60) {
        System.out.println("Если возраст человека равен " + man + ", то ему нужно ходить на работу");
    }
    //Задача 5
    int baby = 16;
    if (baby >= 5 && baby <= 14) {
        System.out.println(" Если возраст ребенка равен " + baby + ", нельзя кататься на аттракционе без сопровождения взрослого.");
    } else if (baby >= 14 && baby <= 54) {
        System.out.println("Если возраст человека равен " + baby + ", можно кататься на аттракционе без сопровождения взрослого");
    }
    //Задача 6

    int trainPeople = 10;
    if (trainPeople < 60) {
        System.out.println("Есть сидячие места");
    } else if (trainPeople < 102) {
        System.out.printf("есть стоячие места");
    } else {
        System.out.printf(" нет мест");
    }
//Задача 7
    int one;
    int two;
    int three;

}




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
    int speed = 40 ;
    if (speed >= 60 ) {
        System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
    } else {
        System.out.println(" Если скорость " + speed + " , можно ехать спокойно");
    }
    //Задача 4
    int baby = 9 ;
    if (baby <= 6 ) {
        System.out.println("Если возраст человека равен " + baby + ", то ему нужно ходить в садик");
    } else {
        System.out.println("Если возраст человека равен " + baby + ", то ему нужно ходить в школу");
    }
}

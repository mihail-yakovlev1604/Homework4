public class Main {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("Еси возраст человека равен," + age + "то он совешеннолетний");
        } else {
            System.out.println("Если возраст человека равен" + age + "то он не достиг совершеннолетия,стоит немного подождать");
        }

        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице" + temp + "градусов,нужно надеть шапку.");
        } else {
            System.out.println("На улице" + temp + "градусов,можно идти без шапки");
        }

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость" + speed + ",то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость" + speed + ",придеться заплатить штраф.");
        }

        byte ageX = 25;
        if (ageX >= 2 && ageX <= 6) {
            System.out.println("Если возраст человекаравен" + ageX + "лет,то ему нужно ходить в детский сад.");
        }
        if (ageX >= 7 && ageX <= 17) {
            System.out.println("Если возраст человека" + ageX + "лет, то ему нужно ходить в школу.");
        }
        if (ageX >= 18 && ageX <= 24) {
            System.out.println("Если возраст человека" + ageX + "лет,то ему нужно ходить в университет.");
        } else if (ageX < 0 || ageX > 24) {
            System.out.println("Если возраст человека" + ageX + "лет, то ему пора на работу.");
        }

        byte ageL = 16;
        if (ageL < 5) {
            System.out.println("Если возраст ребенка равен" + ageL + ",то ему нельзя кататься на аттракционе.");
        }
        if (ageL > 5 && ageL < 14) {
            System.out.println("Если возраст ребенка равен" + ageL + ",то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (ageL > 14) {
            System.out.println("Если возраст ребенка равен" + +ageL + ", то ему можно кататься без сопроваждения взрослого.");
        }

        int owerPlaces = 102;
        int seating = 61;
        int standig = owerPlaces - seating;
        if (seating < 60 || standig < standig) {
            System.out.println("Места в вагоне есть.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else  {
            System.out.println(three);
        }

    }
}
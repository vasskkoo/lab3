package battle;

import droids.TeamDroids;
import java.util.Scanner;
public class Battle1vs1 {
    Scanner sc = new Scanner(System.in);
    TeamDroids info = new TeamDroids();
    int attacker;
    int defender;
    String newFirstName;
    String newSecondName;
    int[] first = {info.first.health, info.first.damage, info.first.percentOfDefend, info.first.vampirism};
    int[] second = {info.second.health, info.second.damage, info.second.percentOfDefend, info.second.vampirism};
    int[] third = {info.third.health, info.third.damage, info.third.percentOfDefend, info.third.vampirism};
    int[] fourth = {info.fourth.health, info.fourth.damage, info.fourth.percentOfDefend, info.fourth.vampirism};
    int[] fifth = {info.fifth.health, info.fifth.damage, info.fifth.percentOfDefend, info.fifth.vampirism};
    int[] sixth = {info.sixth.health, info.sixth.damage, info.sixth.percentOfDefend, info.sixth.vampirism};
    public int[] pickOwnDroids()
    {
        System.out.println("Виберіть бажаного дроїда");
        int droid = sc.nextInt();
        int[] newFirst = new int[4];
        if (droid == 1) {
            newFirst = first;
            newFirstName = info.first.name;
        }
        if (droid == 2) {
            newFirst = second;
            newFirstName = info.second.name;
        }
        if (droid == 3) {
            newFirst = third;
            newFirstName = info.third.name;
        }
        if (droid == 4) {
            newFirst = fourth;
            newFirstName = info.fourth.name;
        }
        if (droid == 5) {
            newFirst = fifth;
            newFirstName = info.fifth.name;
        }
        if (droid == 6) {
            newFirst = sixth;
            newFirstName = info.sixth.name;
        }
        return newFirst;
    }
    public int[] pickOpponentDroids()
    {
        System.out.println("Виберіть суперника");
        int opponent = sc.nextInt();
        int[] newSecond = new int[4];
        if (opponent == 1) {
            newSecond = first;
            newSecondName = info.first.name;
        }
        if (opponent == 2)
        {
            newSecond = second;
            newSecondName = info.second.name;
        }
        if (opponent == 3)
        {
            newSecond = third;
            newSecondName = info.third.name;
        }
        if (opponent == 4)
        {
            newSecond= fourth;
            newSecondName = info.fourth.name;
        }
        if (opponent == 5) {
            newSecond = fifth;
            newSecondName = info.fifth.name;
        }
        if (opponent == 6) {
            newSecond = sixth;
            newSecondName = info.sixth.name;
        }
        return newSecond;
    }
    public int[] createOwnDroids()
    {
        System.out.println("Створення власного дроїда");
        System.out.println("Введіть імʼя дроїда");
        System.out.println(" ");
        newFirstName = sc.next();
        int[] newFirst = new int[4];
        System.out.println("Здоровʼя");
        newFirst[0] = sc.nextInt();
        System.out.println("Урон");
        newFirst[1] = sc.nextInt();
        System.out.println("Захист");
        newFirst[2] = sc.nextInt();
        System.out.println("Вампіризм:");
        newFirst[3] = sc.nextInt();
        return newFirst;
    }
    public int[] createOpponentDroids()
    {
            System.out.println("Cтворення опонента");
            System.out.println("Введіть імʼя дроїда");
            System.out.println(" ");
            newSecondName = sc.next();
            int[] newSecond = new int[4];
            System.out.println("Здоровʼя");
            newSecond[0] = sc.nextInt();
            System.out.println("Урон");
            newSecond[1] = sc.nextInt();
            System.out.println("Захист");
            newSecond[2] = sc.nextInt();
            System.out.println("Вампіризм:");
            newSecond[3] = sc.nextInt();
            return newSecond;
    }
    public void battle1vs1(int[] first, int[] second)
    {
        int i = 1;
        while (true)
        {
            System.out.println("Раунд №" + i);
            if (attacker == 1)
            {
                System.out.println(newFirstName + " бʼє " + newSecondName + " і знімає " + first[1] + " урону ");
                second[0] -= first[1];
                System.out.println("Гравець відновлює здоровʼя своїм захистом");
                if (Math.random() > 0.5) second[0] += second[2];
                System.out.println("Гравець відновлює здоровʼя вампіризмом");
                if (Math.random() > 0.5) second[0] += second[3];

                attacker++;
            }
            if (attacker == 2)
            {
                System.out.println(newSecondName + " бʼє " + newFirstName + " і знімає " + second[1] + " урону ");
                first[0] -= second[1];
                System.out.println("Гравець відновлює здоровʼя своїм захистом");
                first[0] *= first[2];
                System.out.println("Гравець відновлює здоровʼя вампіризмом");
                first[0] += first[3];

                attacker--;
            }
            i++;
            if (first[0] < 0)
            {
                System.out.println("Гравець №2 переміг, вітаємо");
                break;
            }
            if (second[0] < 0)
            {
                System.out.println("Гравець №1 переміг, вітаємо");
                break;
            }
        }
    }
    public void chooseFirst()
    {
        System.out.println("Рандомом виберемо хто перший буде атакувати\nВгадайте, число більше 5 чи ні\n 1 - так\n 2 - ні");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            if (Math.random() * 10 > 5) {
                System.out.println("Першою атакує команда 1");
                attacker = 1;
                defender = 2;
            } else {
                System.out.println("Першою атакує команда 2");
                attacker = 2;
                defender = 1;
            }
        }
        if (choice2 == 2) {
            if (Math.random() * 10 < 5) {
                System.out.println("Першою атакує команда 2");
                attacker = 2;
                defender = 1;
            } else {
                attacker = 1;
                defender = 2;
                System.out.println("Першою атакує команда 1");
            }
        }
    }
}

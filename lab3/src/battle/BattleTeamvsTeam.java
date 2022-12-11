package battle;
import droids.TeamDroids;
import java.util.Scanner;
public class BattleTeamvsTeam
{
    int attacker = 0;
    int defender = 0;
    Scanner sc = new Scanner(System.in);
    TeamDroids info = new TeamDroids();
    int[] first = {info.first.health, info.first.damage, info.first.percentOfDefend, info.first.vampirism};
    int[] second = {info.second.health, info.second.damage, info.second.percentOfDefend, info.second.vampirism};
    int[] third = {info.third.health, info.third.damage, info.third.percentOfDefend, info.third.vampirism};
    int[] fourth = {info.fourth.health, info.fourth.damage, info.fourth.percentOfDefend, info.fourth.vampirism};
    int[] fifth = {info.fifth.health, info.fifth.damage, info.fifth.percentOfDefend, info.fifth.vampirism};
    int[] sixth = {info.sixth.health, info.sixth.damage, info.sixth.percentOfDefend, info.sixth.vampirism};

    public void pickOrChooseTeam()
    {
        System.out.println("Арена битви команда на команду\n1 - грати існуючою командою\n2 - створити власних дроїдів");
        int b = sc.nextInt();
        if (b == 2) {
            for (int c = 0; c < 6; c++) {
                System.out.println("Виберіть номер команди, яку хочете змінити, для кінця вибору введіть 6");
                int d = sc.nextInt();
                if (d == 1)
                {
                    System.out.println("Виберіть гравця якого хочете змінити");
                    int j = sc.nextInt();
                    if (j == 1) info.renameFirst();
                    else if (j == 3) info.renameThird();
                    else if (j == 5) info.renameFifth();
                    else System.out.println("Некоректно введене число");
                }
                else if (d == 2)
                {
                    System.out.println("Виберіть гравця якого хочете змінити");
                    int k = sc.nextInt();
                    if (k == 2) info.renameSecond();
                    else if (k == 4) info.renameFourth();
                    else if (k == 6) info.renameSixth();
                    else System.out.println("Некоректно введене число");
                }
                else if (d == 6) c = 6;
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
        public void fightTeam()
        {
            int i = 1;
            while (true)
            {
                System.out.println("Раунд №" + i);
                if (attacker == 1)
                {
                    System.out.println(info.first.name + " бʼє " + info.second.name + " і знімає " + info.first.damage + " урону ");
                    second[0] -= first[1];
                    System.out.println(info.third.name + " бʼє " + info.fourth.name + " і знімає " + info.third.damage + " урону ");
                    fourth[0] -= third[1];
                    System.out.println(info.fifth.name + " бʼє " + info.sixth.name + " і знімає " + info.fifth.damage + " урону ");
                    sixth[0] -= fifth[1];

                    System.out.println("Гравці відновлюють здоровʼя своїм захистом");
                    second[0] += info.getPercentOfDefendSecond();
                    fourth[0] += info.getPercentOfDefendFourth();
                    sixth[0] += info.getPercentOfDefendSixth();

                    System.out.println("Гравці відновлюють здоровʼя вампіризмом");
                    second[0] += info.getVampirismSecond();
                    fourth[0] += info.getVampirismFourth();
                    sixth[0] += info.getVampirismSixth();

                    attacker++;
                }
                if (attacker == 2)
                {
                    System.out.println(info.second.name + " бʼє " + info.first.name + " і знімає " + info.second.damage + " урону ");
                    first[0] -= second[1];
                    System.out.println(info.fourth.name + " бʼє " + info.third.name + " і знімає " + info.fourth.damage + " урону ");
                    third[0] -= fourth[1];
                    System.out.println(info.sixth.name + " бʼє " + info.fifth.name + " і знімає " + info.sixth.damage + " урону ");
                    fifth[0] -= sixth[1];

                    System.out.println("Гравці відновлюють здоровʼя своїм захистом");
                    first[0] += info.getPercentOfDefendFirst();
                    third[0] += info.getPercentOfDefendThird();
                    fifth[0] += info.getPercentOfDefendFifth();

                    System.out.println("Гравці відновлюють здоровʼя вампіризмом");
                    first[0] += info.getVampirismFirst();
                    third[0] += info.getVampirismThird();
                    fifth[0] += info.getVampirismFifth();

                    attacker--;
                }
                i++;
                if (first[0] < 0 && third[0] < 0 && fifth[0] < 0)
                {
                    System.out.println("Команда №2 перемогла, вітаємо");
                    break;
                }
                if (second[0] < 0 && fourth [0] < 0 && fifth[0] < 0)
                {
                    System.out.println("Команда №1 перемогла, вітаємо");
                    break;
                }

            }
        }
}

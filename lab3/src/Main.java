import battle.Battle1vs1;
import battle.BattleTeamvsTeam;
import droids.TeamDroids;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        TeamDroids teamDroids = new TeamDroids();
        BattleTeamvsTeam battleTeamvsTeam = new BattleTeamvsTeam();
        Battle1vs1 battle1vs1 = new Battle1vs1();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(" Битва дроїдів: \n1 - cписок команд \n2 - бій команда на команду \n3 - бій 1 на 1\n4 - кінець програми");
            int a = sc.nextInt();
            if (a == 1)
            {
                System.out.println("Перша команда \n");
                teamDroids.getFirstTeam();
                System.out.println("Друга команда \n");
                teamDroids.getSecondTeam();
            }
            if (a == 2)
            {
                battleTeamvsTeam.pickOrChooseTeam();
                battleTeamvsTeam.chooseFirst();
                battleTeamvsTeam.fightTeam();
            }
            if (a == 3)
            {
                int[] newFirst = new int[4];
                int[] newSecond = new int[4];
                System.out.println("Арена битви 1 на 1\n1 - грати за існуючого дроїда\n2 - створити власний дроїд");
                int f = sc.nextInt();
                if (f == 1) {
                    teamDroids.getFirstTeam();
                    teamDroids.getSecondTeam();
                    newFirst = battle1vs1.pickOwnDroids();
                    newSecond = battle1vs1.pickOpponentDroids();
                }
                if (f == 2) {
                    newFirst = battle1vs1.createOwnDroids();
                    newSecond = battle1vs1.createOpponentDroids();
                }
                battle1vs1.chooseFirst();
                battle1vs1.battle1vs1(newFirst, newSecond);
            }
            if (a >= 4)
            {
                i = 10;
            }
        }

    }
}
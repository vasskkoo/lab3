package droids;

import java.util.Scanner;

public class TeamDroids
{
    Scanner sc = new Scanner(System.in);
    public BasicDroids first = new BasicDroids("Leonardo", 300, 40, 10, 3);
    public BasicDroids second = new BasicDroids("Rafael", 280, 55, 5, 2);
    public BasicDroids third = new BasicDroids("Donatello", 330, 35, 15, 4);
    public BasicDroids fourth = new BasicDroids("Michelangelo", 350, 30, 20, 5);
    public BasicDroids fifth = new BasicDroids("Splinter", 400, 50, 10, 7);
    public BasicDroids sixth = new BasicDroids("Shreder", 380, 60, 10, 4);

    public void getFirstTeam()
    {
        System.out.println("Name - " + first.name + " Health - " + first.health + " Damage - " + first.damage + " percentOfDefend - " + first.percentOfDefend + " Vampirism - " + first.vampirism);
        System.out.println("Name - " + third.name + " Health - " + third.health + " Damage - " + third.damage + " percentOfDefend - " + third.percentOfDefend + " Vampirism - " + third.vampirism);
        System.out.println("Name - " + fifth.name + " Health - " + fifth.health + " Damage - " + fifth.damage + " percentOfDefend - " + fifth.percentOfDefend + " Vampirism - " + fifth.vampirism);
    }
    public void getSecondTeam()
    {
        System.out.println("Name - " + second.name + " Health - " + second.health + " Damage - " + second.damage + " percentOfDefend - " + second.percentOfDefend + " Vampirism - " + second.vampirism);
        System.out.println("Name - " + fourth.name + " Health - " + fourth.health + " Damage - " + fourth.damage + " percentOfDefend - " + fourth.percentOfDefend + " Vampirism - " + fourth.vampirism);
        System.out.println("Name - " + sixth.name + " Health - " + sixth.health + " Damage - " + sixth.damage + " percentOfDefend - " + sixth.percentOfDefend + " Vampirism - " + sixth.vampirism);
    }

    public void setFirstTeam() {
        System.out.println("Виберіть гравця якого хочете змінити");
        int i = sc.nextInt();
        if (i == 1) renameFirst();
        else if (i == 3) renameThird();
        else if (i == 5) renameFifth();
        else System.out.println("Некоректно введене число");
    }
    public void setSecondTeam() {
        System.out.println("Виберіть гравця якого хочете змінити");
        int i = sc.nextInt();
        if (i == 2) renameSecond();
        else if (i == 4) renameFourth();
        else if (i == 6) renameSixth();
        else System.out.println("Некоректно введене число");
    }
    public BasicDroids renameFirst()
    {
        System.out.println("Імʼя");
        String newName = sc.next();
        first.name = newName;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        first.health = newHealth;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        first.damage = newDamage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        first.percentOfDefend = newPercentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        first.vampirism = newVampirism;
        BasicDroids first = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return first;
    }
    public BasicDroids renameSecond()
    {
        System.out.println("Iмʼя");
        String newName = sc.next();
        newName = second.name;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        newHealth = second.health;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        newDamage = second.damage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        newPercentOfDefend = second.percentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        newVampirism = second.vampirism;
        BasicDroids second = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return second;
    }
    public BasicDroids renameThird()
    {
        System.out.println("Імʼя");
        String newName = sc.next();
        third.name = newName;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        third.health = newHealth;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        third.damage = newDamage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        third.percentOfDefend = newPercentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        third.vampirism = newVampirism;
        BasicDroids third = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return third;
    }
    public BasicDroids renameFourth()
    {
        System.out.println("Імʼя");
        String newName = sc.next();
        fourth.name = newName;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        fourth.health = newHealth;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        fourth.damage = newDamage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        fourth.percentOfDefend = newPercentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        fourth.vampirism = newVampirism;
        BasicDroids fourth = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return fourth;
    }
    public BasicDroids renameFifth()
    {
        System.out.println("Імʼя");
        String newName = sc.next();
        fifth.name = newName;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        fifth.health = newHealth;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        fifth.damage = newDamage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        fifth.percentOfDefend = newPercentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        fifth.vampirism = newVampirism;
        BasicDroids fifth = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return fifth;
    }
    public BasicDroids renameSixth()
    {
        System.out.println("Імʼя");
        String newName = sc.next();
        sixth.name = newName;
        System.out.println("Здоровʼя");
        int newHealth = sc.nextInt();
        sixth.health = newHealth;
        System.out.println("Урон");
        int newDamage = sc.nextInt();
        sixth.damage = newDamage;
        System.out.println("Відсоток захисту");
        int newPercentOfDefend = sc.nextInt();
        sixth.percentOfDefend = newPercentOfDefend;
        System.out.println("Вамріризм");
        int newVampirism = sc.nextInt();
        sixth.vampirism = newVampirism;
        BasicDroids sixth = new BasicDroids(newName, newHealth, newDamage, newPercentOfDefend, newVampirism);
        return sixth;
    }
    public int getPercentOfDefendFirst() {
        if (Math.random() > 0.5) return first.percentOfDefend;
        else return 1;
    }
    public int getPercentOfDefendSecond() {
        if (Math.random() > 0.5) return second.percentOfDefend;
        else return 1;
    }
    public int getPercentOfDefendThird() {
        if (Math.random() > 0.5) return third.percentOfDefend;
        else return 1;
    }
    public int getPercentOfDefendFourth() {
        if (Math.random() > 0.5) return fourth.percentOfDefend;
        else return 1;
    }
    public int getPercentOfDefendFifth() {
        if (Math.random() > 0.5) return fifth.percentOfDefend;
        else return 1;
    }
    public int getPercentOfDefendSixth() {
        if (Math.random() > 0.5) return sixth.percentOfDefend;
        else return 1;
    }
    public int getVampirismFirst() {
        if (Math.random() > 0.5) return first.vampirism;
        else return 1;
    }
    public int getVampirismSecond() {
        if (Math.random() > 0.5) return second.vampirism;
        else return 1;
    }
    public int getVampirismThird() {
        if (Math.random() > 0.5) return third.vampirism;
        else return 1;
    }
    public int getVampirismFourth() {
        if (Math.random() > 0.5) return fourth.vampirism;
        else return 1;
    }
    public int getVampirismFifth() {
        if (Math.random() > 0.5) return fifth.vampirism;
        else return 1;
    }
    public int getVampirismSixth() {
        if (Math.random() > 0.5) return sixth.vampirism;
        else return 1;
    }
}
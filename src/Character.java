import java.io.FilterOutputStream;

public class Character {
    Character(int h, int at, String n) {
        HP = h;
        ATK = at;
        name = n;
        System.out.println("Вы создали персонажа " + name + ", с " + HP + " HP и " + ATK + " ATK.");
    }
    int HP;
    int ATK;
    String name;

    void kill() {
        HP = 0;
        System.out.println(name + " умер по неизвестным обстоятельствам..");
        System.out.println();
    }

    void attack(int EnemyHP) {
        EnemyHP -= ATK;
        if(EnemyHP < 0) EnemyHP = 0;
        System.out.println(name + " ударил врага и нанёс " + ATK + " урона. HP врага: " + EnemyHP);
        System.out.println();
    }

    void hello() {
        System.out.println("Дарова ботики, меня зовут " + name + ", у меня " + HP + " HP и " + ATK + " ATK" + "\n...\n...\n...\nЧто? Настолько неинтересно?");
        System.out.println();
    }
}

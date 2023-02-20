public class Archer extends Character{
    Archer (int arr,int hp, int att, String n) {
        super(hp, att, n);
        arrows = arr;
        System.out.println("Данный персонаж лучник и он имеет дополнительные характеристики - урон от попадания стрелой: "
                + ArrowDamage + " и кол-во стрел: " + arrows);
        System.out.println();
    }

    final int ArrowDamage = 3;
    int arrows;

    void hello() {
        System.out.println("Привет, я " + name + ", я богом дан, бог мне дал " +HP + " HP, " + ATK + " ATK и " + arrows + " стрелы");
    }

    @Override
    void attack(int EnemyHP) {
        super.attack(EnemyHP);
        EnemyHP -= ATK;
        if(EnemyHP > 0) {
            EnemyHP -= ArrowDamage;
            arrows--;
            if (EnemyHP < 0) EnemyHP = 0;
        }
        System.out.println(name + " воткнул в голову врага стрелу и оставил ему " + EnemyHP + " HP. Оставшиеся стрелы: " + arrows +
                " Кажется Богдан где-то посеял свой лук..");
        System.out.println();
    }

    void kill() {
        HP = 0;
        System.out.println(name + " умер по неизвестным обстоятельствам.. За день до похорон его тело пропало..." );
        System.out.println();
    }
}

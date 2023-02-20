public class Wizard extends Character {
    Wizard(int m, int hp, int att, String na) {
        super(hp, att, na);
        mana = m;
        System.out.println("Данный персонаж маг и он имеет дополнительную характеристику - ману: " + m);
        System.out.println();
    }

    private int mana;


    void kill() {
        HP = 0;
        System.out.println(name + " умер по неизвестным обстоятельствам..." +
                " Не удивительно, ему же уже было давно за сотню. Даже магия бессильна перед старением(если она вообще существует...)");
        System.out.println();
    }

    @Override
    void attack(int EnemyHP) {
        super.attack(EnemyHP);
        EnemyHP -= ATK;
        double g = Math.sqrt(mana);
        if (EnemyHP > 0) EnemyHP -= g;
        System.out.println(name + " долбанул врага по голове волшебной палочкой и нанёс " + g + " урона." +
                " И причём тут магия???\nHP врага: " + EnemyHP);
        System.out.println();
    }

    void hello(){
        System.out.println("Здраствуйте, меня зовут " + name + ", у меня " + HP + " HP, " + ATK + " ATK и " + mana + " маны" +
                "\nНе смотрите на меня так из-за моего возраста, магия защищает меня от старения. Магия правда существует, без неё я бы не смог херачить врагов по голове этой палочкой!!!");
        System.out.println();
    }
}

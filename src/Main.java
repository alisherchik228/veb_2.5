public class Main {
    public static void main(String[] args) throws CharacterCreateException {
        Character CH = new Character(3, 5, "Игорь");
        CH.hello();
        CH.attack(4);
        CH.kill();

        Wizard WZ = new Wizard(9, 2, 3, "Александр");
        WZ.hello();
        WZ.attack(5);
        WZ.kill();

        Archer ARCH = new Archer(2, 3, 4, "Богдан");
        ARCH.hello();
        ARCH.attack(7);
        ARCH.kill();

        TestCharacter kakaha = new TestCharacter(0, 0, "0");
        String g = "kakaha";
        CharacterCreateException e = new CharacterCreateException();
        if (g.indexOf("Test") == -1) throw e;
    }
}
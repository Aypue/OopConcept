abstract class Character {

    protected String name;
    protected int hp;
    protected int def;
    protected int basicAttack;

    public Character(String name, int hp, int def, int basicAttack) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.basicAttack = basicAttack;
    }

    public abstract void skill();
}

class MaleCharacter extends Character {

    public MaleCharacter() {
        super("Noah", 100, 50, 20);
    }

    @Override
    public void skill() {
        System.out.println(name + " uses Technology to predict enemy moves!");
    }
}

class FemaleCharacter extends Character {

    public FemaleCharacter() {
        super("Pam", 120, 40, 25);
    }

    @Override
    public void skill() {
        System.out.println(name + " uses psychology to read enemy's mind!");
    }
}

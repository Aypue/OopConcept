class Story {

    String introduction;
    String encounter;
    String defeat;

    public Story(String introduction, String encounter, String defeat) {
        this.introduction = introduction;
        this.encounter = encounter;
        this.defeat = defeat;
    }

    public void Intro() {
        System.out.print("\n-----INTRODUCTION-----");
        System.out.println(introduction);
    }

    public void Encounter() {
        System.out.println(encounter);
    }

    public void Defeat() {
        System.out.println(defeat);
    }
}


class CharacterStory extends Story {
    String name;
    String ability;

    public CharacterStory(String introduction, String encounter, String defeat, String name, String ability) {
        super(introduction, encounter, defeat);
        this.name = name;
        this.ability = ability;
    }

    public void characterInfo() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
    }
}


class FemaleCharacter extends CharacterStory {

    public FemaleCharacter(String introduction, String encounter, String defeat, String name, String ability) {
        super(introduction, encounter, defeat, name, ability);
    }
}


class MaleCharacter extends CharacterStory {

    public MaleCharacter(String introduction, String encounter, String defeat, String name, String ability) {
        super(introduction, encounter, defeat, name, ability);
    }
}


class EnemyStory extends Story {
    int strength;

    public EnemyStory(String introduction, String encounter, String defeat, int strength) {
        super(introduction, encounter, defeat);
        this.strength = strength;
    }

    public void enemyInfo() {
        System.out.println("Strength: " + strength);
    }
}

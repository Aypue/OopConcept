abstract class CharacterBackgroundStory extends Story {
    public CharacterBackgroundStory(String introduction, String encounter, String defeat) {
        super(introduction, encounter, defeat);
    }
}
 
class FemaleCharacterStory extends CharacterBackgroundStory {
    public FemaleCharacterStory(String introduction, String encounter, String defeat) {
        super(introduction, encounter, defeat);
    }
}
 
class MaleCharacterStory extends CharacterBackgroundStory {
    public MaleCharacterStory(String introduction, String encounter, String defeat) {
        super(introduction, encounter, defeat);
    }
}
 
class EnemyCharacterStory extends Story {
    public EnemyCharacterStory(String introduction, String encounter, String defeat) {
        super(introduction, encounter, defeat);
    }
}

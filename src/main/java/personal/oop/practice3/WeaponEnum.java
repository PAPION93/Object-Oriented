package personal.oop.practice3;

public enum WeaponEnum {
    ROCK("바위"),
    PAPER("보자기"),
    SCISSORS("가위");

    private WeaponEnum(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

}

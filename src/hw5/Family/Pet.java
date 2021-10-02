package hw4.Family;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickname;
    private int age;
    private int trickLevel; //from 0 to 100
    private String[] habits;

    static {
        System.out.println("загружается новый класс Pet");
    }

    {
        System.out.println("создается новый объект Pet");
    }

    Pet() {
    }

    Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    Pet(String species, String nickname, int age, int trickLevel) {
        this(species, nickname);
        this.age = age;
        this.trickLevel = trickLevel;
    }


    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void respond() {
        System.out.println("Привет, хозяин. Я - " + this.nickname + ". Я соскучился!");
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }


    public String getSpecies() {
        return species;
    }

    ;

    public void setSpecies(String species) {
        this.species = species;
    }

    ;

    public String getNickname() {
        return nickname;
    }

    ;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    ;

    public int getAge() {
        return age;
    }

    ;

    public void setAge(int age) {
        this.age = age;
    }

    ;

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    ;

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    ;


    @Override
    public String toString() {
        return species + " {nickname='" + nickname + "',  age=" + age + ", trickLevel=" +
                trickLevel +
                "habits=" + Arrays.toString(getHabits()) +
                "}\n";
    }
}



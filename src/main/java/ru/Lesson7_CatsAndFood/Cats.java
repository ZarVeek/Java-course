package ru.Lesson7_CatsAndFood;

class Cats {

    private String name;
    private Boolean satiety;
    private int appetite;

    protected Cats(String name, Boolean satiety, int appetite){
        this.appetite = appetite;
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }
}

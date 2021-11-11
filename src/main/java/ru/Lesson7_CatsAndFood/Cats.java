package ru.Lesson7_CatsAndFood;

class Cats {

    private final String name;
    private Boolean satiety;
    private int appetite;

    protected Cats(final String name, final int appetite){
        this.appetite = appetite;
        this.name = name;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety)// сытый котик не будет кушать
            return;
        this.satiety = plate.decreaseFood(appetite); // если удалось утолить аппетит, котик сыт, иначе - нет
    }

    public String f() {
        return "Котик " + name + (satiety ? " сыт" : " голоден");
    }
}


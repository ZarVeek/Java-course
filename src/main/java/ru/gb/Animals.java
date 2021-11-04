package ru.gb;

public class Animals {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;
    private static int count;

    public Animals() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return  "Вид/порода:" + type + '\n' +
                "Кличка: " + name + "\n" +
                "Может проплыть " + swims + "\n"+
                "Может пробежать " + run + "\n";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  - УСПЕШНО пробежал(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- сошел(а) с дистанции ---- ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "   - УСПЕШНО проплыл(а) " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " ---- не выполнил норматив ---- ");
        }
    }
}
package ru.silversxd.javaTasks.task7;

public class Chair extends Furniture {
    private String type;

    public Chair(String color, int weight, int height, String type) {
        super(color, weight, height);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}

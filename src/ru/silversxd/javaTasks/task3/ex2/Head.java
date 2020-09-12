package ru.silversxd.javaTasks.task3.ex2;

public class Head {
    private String hairColor;
    private String hairType;

    public Head(String hairColor, String hairType){
        this.hairColor = hairColor;
        this.hairType=hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
    public String changeHairType(String newhairType){
        return this.hairType = newhairType;
    }
    public String changeColor(String newColor){
        return this.hairColor = newColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + hairColor + '\'' +
                ", hairType='" + hairType + '\'' +
                '}';
    }
}

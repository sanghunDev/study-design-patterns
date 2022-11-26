package me.whiteship.designpatterns._01_creational_patterns._02_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._01_before.SanghunAnchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._01_before.SanghunWheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public void setAnchor(SanghunAnchor sanghunAnchor) {
    }

    public void setWheel(SanghunWheel sanghunWheel) {

    }
}

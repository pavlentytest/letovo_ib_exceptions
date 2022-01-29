package ru.samsung.itschool.mdev;

public class ECar extends Car {
    protected int batery; // 0

    public ECar(String name) {
        super(name);
    }

    public ECar(String name, int batery) {
        super(name);
        this.batery = batery;
    }
}

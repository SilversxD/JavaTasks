package ru.silversxd.javaTasks.task24.task2;

public interface ChairAbstractFactory {
    public FuncChair creatFuncChair();
    public MagicChair creatMagicChair(String material);
    public VictorianChair creatVictorianChair(String owner);

}
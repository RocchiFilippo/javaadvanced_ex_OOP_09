package _2;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "la macchina prosegue";
    }
    @Override
    public String moveBackward() {
        return "la macchina fa retro";
    }
}

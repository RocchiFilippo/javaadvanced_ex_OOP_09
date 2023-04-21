package _2;

public class Boat implements Movable{
    @Override
    public String moveForward() {
        return "la barca procede";
    }
    @Override
    public String moveBackward() {
        return "la barca fa retro";
    }
}

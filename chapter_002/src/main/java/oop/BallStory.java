package oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        WolfBall wolfBall = new WolfBall();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolfBall.tryEat(ball);
        fox.tryEat(ball);
    }
}

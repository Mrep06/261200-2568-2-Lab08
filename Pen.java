public class Pen implements Runnable {
    String color;
    double positionsX;
    double positionsY;
    public Pen(String color){
        this.color = color;
    }

    public Pen(String color, double positionsX, double positionsY){
        this.color = color;
        this.positionsX = positionsX;
        this.positionsY = positionsY;
    }

    public void run(){
        Turtle bob = new Turtle(this.positionsX,this.positionsY);
        bob.penColor(this.color);
        bob.speed(5);
        for (int i = 0; i < 360; i++) {
            bob.forward(5);
            //square
            for(int j = 0;j <= 3;j++) {
                bob.forward(20);
                bob.left(90);
            }
            bob.left(1);

        }
        bob.up();
        bob.hide();
    }
}
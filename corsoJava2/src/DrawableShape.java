import java.util.Scanner;

public abstract class DrawableShape {
    private int xAxis;
    private int yAxis;
    private String color;
    private int inputSpace;

    public DrawableShape(){
        this.xAxis = 0;
        this.yAxis = 0;
        this.inputSpace = 0;
        this.color = null;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }
    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void setInputSpace(int inputSpace) {
        this.inputSpace = inputSpace;
    }

    public int getInputSpace(){
        return inputSpace;
    }

    public static void jumpSPace(int n){
        for(int i = 0; i < n; i++){
            System.out.print(' ');
        }
    }
    public abstract void drawHere();
}

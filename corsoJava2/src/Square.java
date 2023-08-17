import java.util.Scanner;

public class Square extends DrawableShape{
    private int side;

    public Square (){
        super();
        this.side = 0;
    }

    public Square(int side){
        this.side = side;
    }
    public void setSide(int newSide) {
        this.side = newSide;
    }
    public int getSide() {
        return side;
    }
    public int calculateArea(){
        return side * side;
    }

    public int calculatePerimeter(){
        return side * 4;
    }
    public void drawHere(){
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Indicare il numero di spazi vuoti: ");
        int space = tastiera.nextInt();
        setInputSpace(space);
        drawHorizontalLine();
        drawVerticalLine();
        drawHorizontalLine();
    }
    public void drawHorizontalLine(){
        jumpSPace(getInputSpace());
        for (int i = 0; i<side; i++){
            System.out.print('_');
        }
        System.out.println();
    }
    public void drawVerticalLine(){
        for (int i = 0; i < side; i++){
            drawAVerticalLine();
        }
    }
    public void drawAVerticalLine(){
        jumpSPace(getInputSpace());
        System.out.print('|');
        jumpSPace(side - 2);
        System.out.println('|');
    }
}

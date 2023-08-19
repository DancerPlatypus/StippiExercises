public class Rhombus extends StandardShape{
    private int majorD;
    private int minorD;
    public Rhombus(){
        super();
        majorD = 0;
        minorD = 0;
    }
    public Rhombus(int initialMajorD, int initialMinorD){
        super();
        this.majorD = initialMajorD;
        this.minorD = initialMinorD;
    }
    public void setMajorD(int majorD) {
        this.majorD = majorD;
    }
    public void setMinorD(int minorD) {
        this.minorD = minorD;
    }
    public int getMajorD() {
        return majorD;
    }
    public int getMinorD() {
        return minorD;
    }
    public void drawHere() {
        drawSide();
        drawHorizontalLine();
        drawUpsidedownSide();
    }

    public void drawSide(){
        int start = (getOffset() + (minorD/2));
        jumpSpaces(start);
        System.out.println('*');
        int linesCounter = majorD/2 - 1;
        int innerSpaces = 1;
        for (int i = 0; i<linesCounter; i++){
            start --;
            jumpSpaces(start);
            System.out.print('*');
            jumpSpaces(innerSpaces);
            System.out.println('*');
            innerSpaces = innerSpaces + 2;
        }
    }
    public void drawHorizontalLine(){
        jumpSpaces(getOffset()- 1);
        for(int i = 0; i<minorD + 3 ; i++){
            System.out.print('*');
        }
    }

    public void drawUpsidedownSide(){
        System.out.println();
        int space = getOffset() - 1;
        int linesCounter = majorD/2 - 1;
        int innerSpace = minorD + 1;
        for(int i = 0; i<linesCounter; i++){
            jumpSpaces(space);
            space++;
            System.out.print('*');
            jumpSpaces(innerSpace);
            System.out.println('*');
            innerSpace = innerSpace - 2;
        }
        jumpSpaces(getOffset() + minorD/2);
        System.out.println('*');
    }
}

public abstract class StandardShape {
    private int offset;
    public StandardShape(){
        offset = 0;
    }
    public StandardShape(int initialOffset){
        offset = initialOffset;
    }

    public void setOffset(int newOffset) {
        offset = newOffset;
    }

    public int getOffset(){
        return offset;
    }

    public void drawFrom(int nLines){
        for (int i = 0; i< nLines; i++){
            System.out.println();
        }
        drawHere();
    }
    public abstract void drawHere();

    protected static void jumpSpaces(int n){
        for(int i = 0; i < n; i ++){
            System.out.print(' ');
        }
    }
}

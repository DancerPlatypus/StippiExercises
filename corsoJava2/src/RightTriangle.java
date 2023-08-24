public class RightTriangle extends StandardShape{

    private int minusCathetus;
    private int majorCathetus;

    private double hypotenuse = Math.hypot(minusCathetus, majorCathetus);

    public RightTriangle(){
        super();
        minusCathetus = 0;
        majorCathetus = 0;

    }
    public RightTriangle(int minC, int majC){
        super();
        this.minusCathetus = minC;
        this.majorCathetus = majC;
        swap();

    }

    public void setMinusCathetus(int newMinusCathetus) {
        this.minusCathetus = newMinusCathetus;
    }
    public void setMajorCathetus(int newMajorCathetus) {
        this.majorCathetus = newMajorCathetus;
    }

    public int getMinusCathetus() {
        return minusCathetus;
    }
    public int getMajorCathetus() {
        return majorCathetus;
    }
    public double getHypotenuse() {
        return hypotenuse;
    }
    public void swap(){
        int c;
        if(majorCathetus<minusCathetus){
            c = majorCathetus;
            majorCathetus = minusCathetus;
            minusCathetus = c;
        }
    }
   /* public void drawTop(){
        int innerSpaces = 1;

        System.out.println('*');
        for(int i = 0; i<minusCathetus - 2; i++){
            innerSpaces = innerSpaces + 2;
            System.out.print('*');
            jumpSpaces(innerSpaces);
            System.out.println('*');
        }
    }
    public void drawBottom(){
        for (int i = 0; i < majorCathetus; i++){
            System.out.print('*');
            System.out.print(' ');
        }
     }

    */

    public char[][] findMatrix(){
        char[][] matrix = new char[minusCathetus][majorCathetus];
        for(int i = 0; i<minusCathetus; i++){
            for(int j = 0; j<majorCathetus; j++){
                matrix[i][j] = '*';
            }
        }
        return matrix;
    }

    public void printMatrix(){
        int innerSpaces = 0;
        char[][] matrix = findMatrix();
        for(int i = 0; i< minusCathetus; i++){
            for(int j = 0; j< majorCathetus; j++){

                if(j == 0){
                    System.out.print(matrix[i][j]);
                    System.out.print(' ');
                }

                if(i==matrix.length - 1){
                    System.out.print(matrix[i][j]);
                    System.out.print(' ');
                }
                innerSpaces++;
            }
            System.out.println();
        }
    }
    public void drawHere() {
        printMatrix();
    }

}

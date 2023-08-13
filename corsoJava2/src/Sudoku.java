public class Sudoku {

    private int [][] sudokuGrid;
    private int row =0;
    private int column=0;

    public Sudoku(){
        setSudokuGrid();
        randomFill();
    }

    public void setSudokuGrid(){
        sudokuGrid = new int[9][9];
        for (int i = 0; i<sudokuGrid.length; i++){
            for (int j = 0; j<sudokuGrid.length; j++){
                sudokuGrid[i][j] = 0;
            }
        }
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getSudokuGrid() {
        return sudokuGrid;
    }

    public void randomFill(){
        int counter = 1;
        int filledBox = 15;
        while(counter<=filledBox){
            int inputInteger = (int) ((9.0 * Math.random() + 1));
            this.row = (int) (Math.random() * 9);
            this.column = (int) (Math.random() * 9);
            boolean finCk =!finalCheck(inputInteger);
            if(finCk){
                sudokuGrid[row][column] = inputInteger;
                counter++;
            }
        }
    }

    public void outputSudoku(){
        for (int i = 0; i<sudokuGrid.length; i++){
            for (int j = 0; j<sudokuGrid.length; j++){
                System.out.print(sudokuGrid[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean checkRow(int input){
        int i = this.row;
        for(int j = 0; j<sudokuGrid.length; j++){
            if(j == column) continue;
            if(sudokuGrid[i][j] ==input){
                return true;
            }
        }
        return false;
    }

    public boolean chechColumn(int input){
        int j = this.column;
        for(int i = 0; i<sudokuGrid.length; i++){
            if(i==row) continue;
            if(sudokuGrid[i][j] == input){
                return true;
            }
        }
        return false;
    }

    public boolean checkSquare(int input){

        int indexR = this.row/3;
        int indexC = this.column/3;

        int upperLimitR = (indexR + 1)*3;
        int lowerLimitR = indexR*3;
        int upperLimitC = (indexC + 1)*3;
        int lowerLimitC = indexC*3;

        //int a = sudokuGrid[row][column];
        //for(int i = lowerLimitR; i<upperLimitR; i++){
        //    for (int j = lowerLimitC; j<upperLimitC; j++){
        //        if((sudokuGrid[i][j] != 0) && (i != this.row && j != this.column) && (sudokuGrid[i][j] == a)){
        //            return true;
        //        }
        //    }
        //}

        if(sudokuGrid[row][column]==0) {

            for (int i = lowerLimitR; i < upperLimitR; i++) {
                for (int j = lowerLimitC; j < upperLimitC; j++) {
                    if (i != row && j != column) {
                        if(sudokuGrid[i][j]==input) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean finalCheck(int inputInteger){
        if (checkRow(inputInteger) || chechColumn(inputInteger) || checkSquare(inputInteger)){
            System.out.println("Hai completato il sudoku!");
            return true;
        }
        return false;
    }
}

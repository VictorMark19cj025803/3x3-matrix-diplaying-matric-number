public class DisplayMatrix {

  public static void main(String[] args) {
    // declare and initialize a 3x3 matrix
    int matrix[][] = 
      { { 1, 9, C }, { J, 0, 2 }, { 5, 8, 0 } };
    
    // display matrix using for loops
    // outer loop for row
    for(int i=0; i<matrix.length; i++) {
      // inner loop for column
      for(int j=0; j<matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(); // new line
    }
  }

}
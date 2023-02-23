/*
 * Import everything else needed as well. (Including MyPanel() if its in a library)
 * Import a java graphics library, then use the java graphics library, to draw a circle, and fill it with blue.
 */
// make a 
public class Test{    
  static public boolean checkIndexes(double[][] data, int row, int col)
{
    int numRows = data.length;
    if (row < numRows)
    {
        int numCols = data[0].length;
        return col < numCols;
    }
    else
        return false;
}
public static void main(String args[]) {
  int[][]table ={{9,8,7},{6,5,4},{3,2,1}};
int n = table.length;
for (int p=0; p < n; p++)
System.out.print(table[p][n-p-1] + " ");
}
}

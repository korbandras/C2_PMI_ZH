import java.util.ArrayList;

public class Matrix {
    public static int numberOfNonZeroValues(int[][] matric){
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < matric.length; i++){
            for(int j = 0;  j < matric[i].length; j++){
                if(matric[i][j] != 0){
                    array.add(matric[i][j]);
                }
            }
        }
        int result = array.size();
        return result;
    }

    public static ArrayList indexOfColumnsWithSameValues(int[][] matric2){
        ArrayList<Integer> array2 = new ArrayList<>();
        for(int i = 0; i < matric2.length; i++){
            for(int j = 0; j < matric2.length; j++){
                if(i != matric2.length){
                    if(matric2[i][j] == matric2[i+1][j]){
                        array2.add(i);
                    }
                    i++;
                }
                else{
                    if(matric2[i][j] == matric2[i-1][j]){
                        array2.add(i);
                    }
                }
            }
        }
        //int result = array2.size();
        return array2;
    }
}

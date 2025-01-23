package lw6.example14_6;

public class classTest {
    private static int[] arrayNew;

    public static int[] getNewArray(int[] arrayOld, int newLength){

        if(arrayOld.length > newLength) {
            int[] array = new int[newLength];
            for( int i = 0; i < newLength; i++){
                array[i] = arrayOld[i];
            }
            arrayNew = array;
        }
        else{

            arrayNew = arrayOld;
        }
        return arrayNew;
    }
}

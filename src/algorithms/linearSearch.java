package algorithms;

public class linearSearch {

    int[] array;
    int value;

   public linearSearch(int[] array, int value) {
        this.array=array;
        this.value=value;
    }

    public int  LinearSearchFunc(){
        for(int i = 0; i < this.array.length; i++) {
            if( this.array[i] == this.value) {
                return i;
            }
        }

        return -1;    }

}


public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int a = 0, b = 0;
        int cLen = arr1.length + arr2.length;
        int[] combined = new int[cLen];

        while(a < cLen){
            if(a < arr1.length){
                combined[a] = arr1[a];
            }
            else{
                combined[a] = arr2[b];
                b++;
            }
            a++;
        }

        return combined;
    }
}

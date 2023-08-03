public class ModeCalculator2{
    static final int MAX_RESPONSE=10;
        static final int ARRAY_SIZE=12;
    public static void main(String[] args){
        int[] histogram=new int[MAX_RESPONSE];
        int[] intArray={4, 7, 3, 8, 9, 7, 3, 9, 9, 3, 3, 10};
        for(int i=0;i<MAX_RESPONSE;i++){
                histogram[i]=0;
        }
        for(int i=0;i<ARRAY_SIZE;i++){
            histogram[intArray[i]-1]++;
        }
        for(int i=0;i<MAX_RESPONSE;i++){
            System.out.print(histogram[i]+" ");
        }
    }
}

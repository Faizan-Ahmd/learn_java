public class ModeCalculator{
    public static void main(String[] args){
        int intArray[]={4, 7, 3, 8, 9, 7, 3, 9, 9, 3, 3, 10};
        int start=0;
        for(int i=start+1;i<intArray.length;i++){
            for(int j=i;j>start;j--){
                if(intArray[j-1]>intArray[j]){
                    int temp=intArray[j-1];
                    intArray[j-1]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
       int mostFrequent=0;
       int highestFrequency=0;
       int currentFrequency=0;
       for(int i=0;i<intArray.length-1;i++){
        currentFrequency++;
        if(intArray[i]!=intArray[i+1] || i==intArray.length-1){
            if(currentFrequency>highestFrequency){
                highestFrequency=currentFrequency;
                mostFrequent=intArray[i];
            }
            currentFrequency=0;
        }

       }
       System.out.println("Most Frequent Number "+mostFrequent+" with frequency "+highestFrequency);
    }
}
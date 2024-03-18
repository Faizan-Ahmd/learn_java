public class TwoSum{
	public static void main(String[] args){
		TwoSum obj=new TwoSum();
		int[] array={2,7,8,11};
		int target=9;
		int[] arr=obj.twoSum(array,target);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public int[] twoSum(int[] array,int target){
		int[] indices=new int[2];
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]+array[j]==target){
					indices[0]=i;
					indices[1]=j;
				}
			}
		}
		return indices;
	}
}

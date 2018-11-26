package programmes;

public class SortAnArray {

	public static void main(String[] args)
   {
	int array[] = {8,5,0,1,9,6};
	
	for(int i=0,j=i+1;i<array.length && j<array.length;)
	{
		if(array[i]>array[j])
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i=0;
			j=i+1;
		}
		else
		{
			i++;
			j++;
		}
	}
	
	for(int arr:array)
	{
		System.out.println(arr);
	}
 }
}

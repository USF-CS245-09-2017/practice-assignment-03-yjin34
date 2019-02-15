public class BinaryIterativeSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary Iterative Search";
	}

	public int search(int [] arr, int target)
	{
		int start = 0, end = arr.length-1, mid;
		while (start <= end)
		{
			mid = (start + end)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}

		return -1;
	}
}
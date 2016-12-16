//Link to question (Google Interview Question)
//https://www.youtube.com/watch?v=XKu_SEDAykw

class Solution {
	public static void main(String[] args) {
		int [] set1 = {1,2,3,9};
		int [] set2 = {-2,1,2,4,4,5};
		
		if(checkPair(set2,8)){
			System.out.println("Passed");
		}
		else{
			System.out.println("Failed");
		}
	}
	
	public static boolean checkPair(int [] set, int sum){
		int low = 0;
		int high = set.length - 1;
		
		while(low < high){
			if(set[low] + set[high] == sum){
				return true;
			}
			else if(set[low] + set[high] < sum){
				low++;
			}
			else{
				high--;
			}
		}
		return false;
	}
}
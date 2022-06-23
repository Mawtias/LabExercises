import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Question2 {	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		Random ram = new Random();
		
		for (int i = 0; i < 10; i++)nums1.add(ram.nextInt(50)+1);
		
		for(int n: nums1)nums2.add(n);
		nums1.set(nums1.size()-1, -5);
		System.out.println(nums1);
		System.out.println(nums2);
		
		
	}
}

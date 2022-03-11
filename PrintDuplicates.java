package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		int count;
		for(int i=0;i<=s1.size()-1;i++) {
			count=0;
			for(int j=i+1;j<s1.size();j++) {
				if(s1.get(i)==s1.get(j))
					count++;
			}
			if(count>0)
			System.out.println(s1.get(i));
			}

	}

}

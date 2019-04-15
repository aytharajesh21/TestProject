import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {

		List<Integer> largest = new ArrayList<Integer>();
		largest.add(1);
		largest.add(2);
		largest.add(3);
		largest.add(4);
		largest.add(5);
		largest.add(6);

		Collections.sort(largest, Collections.reverseOrder());
		
		for (Integer desc : largest) {
			if(desc > 5){
				System.out.println(desc);
			}
		}
	}
}

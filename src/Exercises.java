import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		//Check
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}

		if ((a.get(a.size()-1) == b.get(b.size()-1)) || (a.get(0) == b.get(0))){
			return true;
		}

		return  false;	// default return value to ensure compilation
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		//Check
		ArrayList<String> empty = new ArrayList<String>();
		if (values == null || values.size() < n || n <= 0) {
			return empty;
		}

		ArrayList<String> firstLast = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			firstLast.add(values.get(i));
		}

		int placeHolder = n;
		for (int i = n; i < 2*n; i++) {
			firstLast.add(values.get(values.size()-placeHolder));
			placeHolder--;
		}

		return firstLast;	// default return value to ensure compilation
	}

	public int difference(ArrayList<Integer> numbers) {
		//Check
		if (numbers == null || numbers.size() < 1) {
			return -1;
		}

		int largest = numbers.get(0);
		int smallest = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > largest) {
				largest = numbers.get(i);
			}
			if (numbers.get(i) < smallest) {
				smallest = numbers.get(i);
			}
		}

		return (largest - smallest);
	}

	public double biggest(ArrayList<Double> numbers) {
		//Check
		if (numbers == null || numbers.size() < 3 || numbers.size()%2 == 0) {
			return -1;
		}

		int midIndex = (int)(Math.ceil(numbers.size() / 2));
		double max = -1;
		for (int i = 0; i < numbers.size(); i++) {
			 if (numbers.get(i) < 0) {
				 return -1;
			 }
		   if ((i == 0 || i == numbers.size() - 1 || i == midIndex) && numbers.get(i) > max) {
				 max = numbers.get(i);
			 }
		 }
		 return max;
	}

	public ArrayList<String> middle(ArrayList<String> values) {
		//Check
		ArrayList<String> empty = new ArrayList<String>();
		if (values == null || values.size() < 3 || (values.size() % 2) == 0) {
			return empty;
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return empty;
			}
		}

		int middle = values.size() / 2;
		int first = middle - 1;
		int last = middle + 1;

		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get(first));
		result.add(values.get(middle));
		result.add(values.get(last));
		return result;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		//Check
		if (numbers == null || numbers.size() < 3) {
			return false;
		}

		int lowest = numbers.get(0);
		int middle = numbers.get(1);
		int last = numbers.get(2);
		for (int i = 0; i < numbers.size(); i++) {
			if (lowest < middle && middle < last) {
				return true;
			}

			if (i + 2 < numbers.size()) {
					lowest = numbers.get(i);
					middle = numbers.get(i + 1);
					last = numbers.get(i + 2);
				} else {
					return false;
			}
		}

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(ArrayList<String> values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}

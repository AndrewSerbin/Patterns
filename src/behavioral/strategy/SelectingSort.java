package behavioral.strategy;

import java.util.Arrays;

class SelectingSort implements Sorting {

    @Override
    public void sort(int[] arr) {
	for (int i = 0; i < arr.length - 1; i++) {
	    int index = i;
	    for (int j = i + 1; j < arr.length; j++)
		if (arr[j] < arr[index])
		    index = j;

	    int smallerNumber = arr[index];
	    arr[index] = arr[i];
	    arr[i] = smallerNumber;
	}

	System.out.println(Arrays.toString(arr));
    }

}
package com.myworkout.practice;

public class TrickyQues {
	
	public int[] bubbleSort(int[] arraySort) {
		for(int i=0;i<=arraySort.length-1;i++) {
			for(int j=0;j<arraySort.length-1;j++) {
				if(arraySort[j]>arraySort[j+1]) {
					int temp=arraySort[j];
					arraySort[j]=arraySort[j+1];
					arraySort[j+1]=temp;
				}
			}
		}
		return arraySort;
	}
	
	public int Equalizing(int[] initialArray) {
		initialArray=bubbleSort(initialArray);
		int count=0;
		while(!repeatedNum(initialArray)) {
			if(initialArray[2]-initialArray[1]>=2 || initialArray[2]-initialArray[0]>=2) {
				initialArray[0]++;
				initialArray[1]++;
				initialArray[2]--;
				count++;
				initialArray=bubbleSort(initialArray);
			}
			else
				return count=-1;
		}
		return count;
	}
	
	public boolean repeatedNum(int[] checkArr) {
		int count=0;
		int i=0;
		boolean isEqual=false;
		for(int j=0;j<=checkArr.length-1;j++) {
			if(checkArr[i]==checkArr[j]) {
				count++;
			}
			if(count==3) {
				isEqual=true;
			}
		}
		return isEqual;
	}
	public static void main(String[] args) {
		
		TrickyQues input=new TrickyQues();
		
		int[] abc = {1,9,11};
		
		int numbers=input.Equalizing(abc);
		
		System.out.println(numbers);
	}

}



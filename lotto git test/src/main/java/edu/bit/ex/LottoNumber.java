package edu.bit.ex;

import java.util.ArrayList;
import java.util.Arrays;

public class LottoNumber {
	
	ArrayList lottoNumber;
	

	int[] getLotto() {
		int[] arr = new int[7]; // 방 개수
		// int[] arr2 = {0,0,0,0};

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1); // 중복제거 .....
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		int i = 0;
		while (i < arr.length) {
			arr[i] = (int) (Math.random() * 45 + 1);

			int j = 0;
			while (j < i) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
				j++;
			}
			i++;
		}

		return arr;

	}
	
	public ArrayList getLottoNumber() {

		int[] arr = getLotto();
		lottoNumber = new ArrayList<Integer>();
	
		for(int i=0; i<arr.length; i++) {
			lottoNumber.add(arr[i]);
		}
		
		System.out.println(Arrays.toString(lottoNumber.toArray()));
		
		return lottoNumber;
	}

	public void setLottoNumber(ArrayList lottoNumber) {
		this.lottoNumber = lottoNumber;
	}

	
}

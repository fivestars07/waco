package com.play.waco.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CommonService {
	
	/*
	 * 정해진 범위에서 무작위 정렬
	 */
	public int[] randomElementsRepeat(List<Integer> randList) {
		
		Random rand = new Random();
		/*
		 * List 리스트로 변환
		 */
		int numberOfElements = randList.size();
		int[] randomElements = new int[numberOfElements - 1];
		
		for( int i=0; i<numberOfElements; i++ ) {
			
			int randomIndex = rand.nextInt(randList.size());
			randomElements[i] = randList.get(randomIndex);
			randList.remove(randomIndex);

		}
		
		return randomElements;
		
	}
	
}

package com.itbank.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class Quiz1Service {
	
	public List<String> lotto(int count) throws InterruptedException {
		// 1. 1 ~ 45 사이 숫자를 무작위로 뽑는다
		// 2. 단, 중복없이 6개를 뽑아야 한다
		// 3. 결과 발표는 낮은 숫자부터 발표
		Random ran = new Random();
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		String rString = "";
		List<String> rList = new ArrayList<String>();
		
		for(int i = 1; i <= count; i++) {
			while(set.size() != 6) {
				int n = ran.nextInt(45) + 1;
				set.add(n);
			}	
			
			list.addAll(set);
			list.sort(null);

			rString += i + " : ";
			rString += list.toString();
			rString += "\n";
			
			rList.add(rString);
			
			list.clear();
			set.clear();
			rString = "";
		}
		
		return rList;
	}
	
}

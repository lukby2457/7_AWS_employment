package com.itbank.service;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class Quiz1Serivce {
	
	private TreeSet<Integer> lotto() {
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<>();
		
		while (ts.size() != 6) {
			int num = ran.nextInt(45) + 1;
			ts.add(num);
		}
		
		return ts;
	}

	public Object getLottos(int n) {
		ArrayList<TreeSet<Integer>> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			list.add(lotto());
		}
		
		return list;
	}

}

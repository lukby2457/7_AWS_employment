package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

// 강사 풀이(class)
class Lotto {
	private static Random ran = new Random();
	
	static List<Integer> getLotto() {
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			int n = ran.nextInt(45) + 1;
			set.add(n);
		}
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
		list.sort(null);
		return list;
	}
	
}

public class Quiz3 {
	public static void main(String[] args) throws InterruptedException {
		// 로또 추첨기를 구현
		// 1. 1 ~ 45 사이 숫자를 무작위로 뽑는다
		// 2. 단, 중복없이 6개를 뽑아야 한다
		// 3. 결과 발표는 낮은 숫자부터 발표
		Random ran = new Random();
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; set.size() < 6; i++) {
			int n = ran.nextInt(45) + 1;
			set.add(n);
		}	
		
		list.addAll(set);
		list.sort(null);
		System.out.println(list);
		
		list.clear();
		set.clear();
		
		// 강사 풀이(main)
		while(set.size() != 6) {
			int n = ran.nextInt(45) + 1;
			set.add(n);
		}
//		System.out.println(set);
		list.addAll(set);
		list.sort(null);
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("장수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(Lotto.getLotto());
			Thread.sleep(500);
		}
		sc.close();
	}
}

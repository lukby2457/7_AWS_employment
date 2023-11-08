package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itbank.components.SHA512;
import com.itbank.model.vo.AccountVO;

@Component
@Aspect
public class AccountAOP {

	@Autowired private SHA512 hash;
	
	// Around : 지정 메서드 실행 전/후로 모두 수행
	@Around("execution(* com.itbank.service.AccountService.*(com.itbank.model.vo.AccountVO, ..))")
	public Object hash(ProceedingJoinPoint jp) throws Throwable {
		
		// Before
		AccountVO input = (AccountVO) jp.getArgs()[0];
//		System.out.println(input.getUserid());
//		System.out.println(input.getUserpw());
		
		if(input.getUserpw() == null) {
			input.setUserpw("0");
		}
		
		input.setUserpw(hash.getHash(input.getUserpw()));
		
		// 지정 메서드 실행
		Object result = jp.proceed(jp.getArgs());
		
		// After
//		System.out.println(input.getUserpw());

		return result;
	}

}

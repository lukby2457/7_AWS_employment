package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itbank.beans.AccountVO;
import com.itbank.components.SHA512;

@Component
@Aspect
public class AccountAOP {
	
	@Autowired private SHA512 hash;

	@Before("execution(* com.itbank.service.AccountService.*(com.itbank.beans.AccountVO, ..))")
	public void hash(JoinPoint jp) {
		AccountVO input = (AccountVO) jp.getArgs()[0];
		
		if(input.getUserpw() == null) {
			input.setUserpw("0");
		}
		
		input.setUserpw(hash.getHash(input.getUserpw()));
	}
	
}

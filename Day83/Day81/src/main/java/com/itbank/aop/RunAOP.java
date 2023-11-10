package com.itbank.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunAOP {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private long startTime, endTime;
	private Date start, end;

	@Around("execution(* com.itbank.service.*.*(..))")
	public Object runTime(ProceedingJoinPoint jp) throws Throwable {
//		log.trace("실행 전");
		startTime = System.currentTimeMillis();
		start = new Date(startTime);
		
		Object result = jp.proceed(jp.getArgs());
		
//		log.trace("실행 후");
		endTime = System.currentTimeMillis();
		end = new Date(endTime);
		
		log.trace("시작 시간 : " + start);
		log.trace("마친 시간 : " + end);
		log.trace(jp.getSignature().getName() + "걸린 시간 : " + (endTime - startTime) / 1000.0 + "초");
		
		return result;
	}
	
}

package com.gavin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 
 * @author wenguang.xu
 * 观众
 */
@Component
public class Audience {

		//表演之前
		public void takeSeats() {
			System.out.println("The audience is taking their seats.");
		}
		
		//表演之前
		public void turnOffPhones() {
			System.out.println("The audience is turning off their phones.");
		}
		
		//表演之后
		public void applaud() {
			System.out.println("CLAP CLAP CLAP CLAP");
		}
		
		//表演失败之后
		public void demandRefound() {
			System.out.println("Boo! We want our money back!");
		}
		
		//环绕通知
		public void watchPerformance(ProceedingJoinPoint joinpoint) {
			
			try {
				//表演之前
				System.out.println("The audience is taking their seats.");
				System.out.println("The audience is turning off their phones");
				long start = System.currentTimeMillis();
				
				//执行被通知的方法
				joinpoint.proceed();
				
				//表演之后
				long end = System.currentTimeMillis();
				System.out.println("CLAP CLAP CLAP CLAP ");
				System.out.println("The performance took " + (end - start) + " milliseconds.");
			} catch (Throwable e) {
				//表演失败之后
				System.out.println("Boo! We want our money back!");
			}
			
		}
}

package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalculationMain {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		// ExecutorService executorService1 = Executors.newFixedThreadPool(3);
		long startTime = System.nanoTime();
		Future<Integer> result11 = executorService.submit(new CalculationMain());
		Future<Integer> result12 = executorService.submit(new CalculationMain());
		Future<Integer> result13 = executorService.submit(new CalculationMain());

		executorService.shutdown();
		try {

			System.out.println("result11_" + result11.get());
			System.out.println("result12_" + result12.get());
			System.out.println("result13_" + result13.get());
		}

	
		catch (Exception e) {
			e.printStackTrace();
		}
		long elapsedTime = System.nanoTime() - startTime;
		
		double millisecond = ((elapsedTime / 3) / 1000);
		System.out.println("Time taken in millisecond to execute all the tasks " + millisecond);
	}
}

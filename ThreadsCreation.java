package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadsCreation {
	
	public class ThreadCreationUsingExecutor 
	{
	  public void main(String[] args) 
	 {

	      ExecutorService executorServices = Executors.newSingleThreadExecutor();


	    for(int i=0;i<10;i++)
	    {
	    
	    	executorServices.submit(new ThreadTask());
	    }
	    executorServices.shutdown();
	 }
	}
	static class ThreadTask implements Runnable
	{
		String id="Thread_";
		static int instance_number=0;
		public void run()
		{
			System.out.println("******["+id+"]started working*****");
			for(int i=0;i<10;i++)
			{
				System.out.println("<"+id+">"+ i);
			}
			System.out.println("******["+id+"stopped working*****");
		}
		public ThreadTask()
		{
			instance_number++;
			id=id+instance_number;
		}
	}
}

package Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class PrioritySetting {
	

	
		private static int priority ;
		private static int count=0;
		private static String name="thread";
		

		public Thread newThread(Runnable r)
		{
			// TODO Auto-generated method stub

			Thread t = new Thread(r, name+ ++count);
//			Thread t1= new Thread(r, name+ ++count);
//			t.setPriority(5);
			return t;
		}
		public PrioritySetting()
		{
			this.setPriority(5);
			this.setPriority(2);
		}
		public static int getPriority() {
			return priority;
		}
		public static void setPriority(int priority) {
			PrioritySetting.priority = priority;
		}
		
	}


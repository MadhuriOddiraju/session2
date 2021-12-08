package model

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Hashmap 
{
		
	public static void main(String[]args)
	{
	Map<Integer,String>hash_map = new HashMap<Integer,String>();
	hash_map.put(1, "Madhuri");
	hash_map.put(2,"Shri");
	Iterator<Entry<Integer,String>>it = hash_map.entrySet().iterator();
	
	hash_map.(foreach(key,value)->System.out.println(key+ " = " +value));

	}



	}


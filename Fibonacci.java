import java.util.HashMap;

public class Fibonacci{
	public static void main(String[] args){
		HashMap<Integer, Integer> list = new HashMap<>();
		int n = 10;
		int first = 0;
		int second = 1;
		int count = 0;
		list.put(count+1, first);
		list.put(count+2, second);
		System.out.print("Fibonacci series: "+first+" "+second);
		
		for(int i = 3; i <= n; i++){
			int next = first + second;
			list.put(i, next);
			System.out.print(" "+next);
			first = second;
			second = next;
		}
		System.out.println();
		System.out.println(list);

		for(int key : list.keySet()){
			if(key % 2 == 0){
				System.out.println("Even position : "+key+" : "+list.get(key));
			}
		}
	}
}
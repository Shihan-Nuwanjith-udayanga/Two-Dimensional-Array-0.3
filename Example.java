import java.util.*;
public class Example {
	public static void main(String[] args) {
		int[][] f={{12,23,34},{54,23,85,34},{23,65,76,35,75}};

		for(int []ar : f ){
			for(int a : ar){
				System.out.print(a+"\t");	
			}
			System.out.println();
		}
    }
}

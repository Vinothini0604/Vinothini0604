package Predicate;
import java.util.function.Predicate;
public class FunctionalInterType {

	public static void main(String[]args){
		Predicate<Integer> grater=x->x>10;
		
		System.out.println(grater.test(30));
		
		
		Predicate<Integer> lesser=y->y<2;
		boolean ans2 = lesser.test(25);
		System.out.println(ans2);
		
		
		
		boolean ans3 = grater.and (lesser).test(15);
		System.out.println(ans3);
	}
}

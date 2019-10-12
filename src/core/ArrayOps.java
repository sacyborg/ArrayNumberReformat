package core;

import java.util.ArrayList;
import java.util.List;

public class ArrayOps {

	
	ArrayModel arrMod= new ArrayModel();
	
	public List<Integer> arrayOpsReturn(List<Integer> arrayModel){
		
		int digit=0;
		int UnsNumber=0;
		int lastDigit=0;
		int count=0;
		int ipNumber=0;
		List<Integer> scheNumber= new ArrayList<Integer>();
		
		System.out.println("\n Each formatted digits are: \n");

		for(int i=0;i<4;i++) {
			

			UnsNumber=arrayModel.get(i);
			ipNumber=UnsNumber;
			while(UnsNumber>0) {
				digit=UnsNumber%10;
				System.out.print(" "+digit);
				scheNumber.add(digit);
				UnsNumber= UnsNumber/10;
				count++;
			}count--;
			lastDigit= scheNumber.get(0);
			System.out.print(" ld> "+lastDigit+" Number: "+ ipNumber+" Formatted: ");
			
			
			if(lastDigit==7 && ipNumber>100) {
				System.out.print("-3");
			}else if(ipNumber>100) {
				System.out.print("-2");
			}else if(lastDigit==7) {
				System.out.print("-1");
			}else {
				System.out.println(ipNumber);
			}
			
			
			scheNumber.clear();
			count=0;
			System.out.println("\n");
			//System.out.println("\n > "+scheNumber.get(0));
		}
		
		
		return arrayModel;
	}
	
	
	
}

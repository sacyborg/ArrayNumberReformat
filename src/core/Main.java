package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayModel arrMod= new ArrayModel();
		ArrayOps arrayOps= new ArrayOps();
		BufferedReader intBuff= new BufferedReader(new InputStreamReader(System.in));
		int[] ip= new int[5];
		List<Integer> array = new ArrayList<Integer>();
		System.out.println("Array number reformat \n Enter 4 numbers:");
		try {
		for(int i=0;i<4;i++) {
			//ip[i]= Integer.parseInt(intBuff.readLine());
			array.add(Integer.parseInt(intBuff.readLine()));
			
		}
		//arrMod.setArray(ip);
		arrMod.setArrayIP(array);
		
		for(int i=0;i<4;i++) {
			System.out.println(arrMod.getArrayIP().get(i)+"\n");
		}
		
		arrayOps.arrayOpsReturn(arrMod.getArrayIP());
		
		//System.out.println(arrMod.getArray());
		}catch(NumberFormatException num) {
			num.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			array.clear();
		}
		
	}

}

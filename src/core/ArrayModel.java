package core;

import java.util.ArrayList;
import java.util.List;

public class ArrayModel {
	
	private int[] array= new int[5];
	
	private List<Integer> arrayIP = new ArrayList<Integer>();

	public List<Integer> getArrayIP() {
		return arrayIP;
	}

	public void setArrayIP(List<Integer> arrayIP) {
		this.arrayIP = arrayIP;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}

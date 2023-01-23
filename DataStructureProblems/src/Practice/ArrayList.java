package Practice;

public class ArrayList {
	private int[] array = new int[5];
	private int size =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.insertArray(23);
		al.insertArray(2);
		al.insertArray(3);
		al.insertArray(31);
	

		al.printArray();

		
	}
	 void insertArray(int val) {
		if(size>=array.length) {
			int temp[] = array.clone();
			array = new int[size+5];
			for(int i=0;i<array.length;i++) {
				array[i]= temp[i];
			}
		}
		array[size]=val;
		size++;
	}
	
	void delete() {
		int temp[] = array.clone();
		array = new int[size-1];
		for(int i=0;i<array.length;i++) {
			array[i]= temp[i];
		}
		size--;
	}
	void printArray() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}


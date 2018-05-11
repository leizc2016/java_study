package bitmap;

public class BitMapTest {

	int numSize = 100;
	int arraySize = (int) Math.ceil((double) numSize / 32);
	private int array[] = new int[arraySize];
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BitMapTest test = new BitMapTest();
		test.initBitMap();
		int sortArray[] = new int[] { 1, 8, 3, 11, 55, 23 };
		for (int i = 0; i < sortArray.length; i++) {
			test.set1(sortArray[i]);
		}
		for (int i = 0; i < test.numSize; i++) {
			if (test.get(i) != 0) {
				System.out.print((i) + " ");
			}
		}

	}

	public void initBitMap() {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}

	public void set1(int pos) {
		array[pos >> 5] = array[pos >> 5] | (1 << (pos % 32));
	}

	//32就是pos >> 5实际上返回二维数组的序号
	public int get(int pos) {
		return array[pos >> 5] & (1 << (pos % 32));
	}

}

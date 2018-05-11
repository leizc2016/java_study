package bitmap;

public class BitMapTest2 {

	public static void main(String[] args) {

		int[] data = new int[] { 5, 10, 15, 3, 16, 17, 6, 8, 11 }; // 待排序数组
		int model = 0; // bitmap初始化为0
		for (int i : data) {
			model = model | (1 << i); // 把对应位设置为1
		}
		for (int i = 1; i <= 32; i++) { // 遍历32位，判断是否为1，为1的话取出数据
			if ((model & (1 << i)) != 0) {
				System.out.println(i);
			}

		}

	}

}

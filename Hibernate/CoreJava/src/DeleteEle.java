class DeleteEle {
	public static void main(String[] args) {
		System.out.println("---------------------");
		int arr[] = { 10, 20, 30, 40, 50 };
		int nar[] = new int[arr.length - 1];
		int del = 2, iv = 0;
		for (int i = 0; i < arr.length; i++) {
			if (del != i) {
				nar[iv] = arr[i];
				iv++;
			}
		}
		for (int i : nar) {
			System.out.println(i);
		}
	}
}

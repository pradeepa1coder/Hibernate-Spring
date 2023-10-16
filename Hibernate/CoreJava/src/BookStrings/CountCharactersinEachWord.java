package BookStrings;

import java.util.Arrays;

public class CountCharactersinEachWord {
	public static void main(String[] args) {

//		String str = "Sheeela is a beautiful girl";		
//		String[] arr=str.split(" ");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]+"-->"+arr[i].length());
//		}

		String str = "Sheeela is a beautiful girl";
		char ch[] = str.toCharArray();
		//ch[] =[S, h, e, e, e, l, a,  , i, s,  , a,  , b, e, a, u, t, i, f, u, l,  , g, i, r, l]
		System.out.println("ch.length is-> " + ch.length);// 27
		for (int i = 0; i < ch.length; i++) {
			String st = "";
			while (i < ch.length && ch[i] != ' ') {
				st = st + ch[i];
				i++;

			}
			System.out.println(st + "-->" + st.length());

		}

	}
}


public class Pdf {

	}

	Jump to Page 6
You are
	on page 6 of 89

	Search inside
	document Search
	document

	PROGRAMS
	onNUMBERS

	Write
	a program
	to Print 1
	to N numbers?

	class Printnums {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter value of n");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
	}OUTPUT:

enter value
	of n:1012345678910
	Write a
	program to
	Print REVERSE
	of N to 1 numbers?

	class Printnums {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter value of n");
			int n = sc.nextInt();
			for (int i = n; i >= 1; i--) {
				System.out.print(i);
			}
		}
	}OUTPUT:

enter value
	of n:1010 9 8 7 6 5 4 3 2 1

	Write a
	program to
	display sum of 1
	to N numbers?

	class Sumnum {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter value of n");
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}OUTPUT:

enter value
	of n:1055
	Write a
	program to
	check given
	number is
	EVEN or ODD?

	class EvenOdd {public static void main(String[] args){java.util.Scanner sc=new java.util.Scanner(System.in);System.out.println("enter the num");int n=sc.nextInt();if(n%2==0)
System.out.println(n+” is even");
 elseSystem.out.println(n+" is odd");}
	}OUTPUT:

enter the num:2020
	is evenF:\Practice>java Even(Command prompt)enter the num: 1111 is odd
 
Write a program to display PRIME NUMBERS from 1 to n?
class Prime{public static void main (String [] args){java.util.Scanner sc=new java.util.Scanner (System.in);System.out.println ("enter number");int n=sc.nextInt ();System.out.println ("Prime numbers between 1 and " + n);//loop through the numbers one by onefor (int i=1; i < n; i++){boolean isPrime = true;//check to see if the number is primefor (int j=2; j < i ; j++){if (i % j == 0){isPrime = false;break;}}// print the numberif (isPrime)System.out.print (i + " ");}}}
OUTPUT:
enter number25Prime numbers between 1 and 251 2 3 5 7 11 13 17 19 23
 
Write a program to check whether the given number is PRIME or not?
class Prime{public static void main(String[] args){java.util.Scanner sc=new java.util.Scanner(System.in);System.out.println("enter number");int n=sc.nextInt();int i;if(n==1){System.out.println("Prime starts from 2");}for(i=2;i<n ;i++){if(n%i==0)System.out.println("not a prime");break;}if(n==i)System.out.println("prime");}}
OUTPUT:
Enter the number : 17Prime
Write a program to find SUM OF PRIME numbers?

import java.util.Scanner;

public class SumofPrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the range to print sum of prime Nos.....");
		int range = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			if (isPrime(i))
				sum = sum + i;
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}}OUTPUT:

	Enter the
	range to
	print sum
	of prime Nos.....1017
	Write a
	program to
	display MULTIPLICATION table?

	class Multiplication {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter value of n");
			int n = sc.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + "*" + i + "=" + (n * i));
			}
		}
	}Output:

enter value
	of n:22*1=22*2=42*3=62*4=82*5=102*6=122*7=142*8=162*9=182*10=20

Write a
	program to
	display MULTIPLICATION TABLES?

	class Tables {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("enter value of n");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.print(j + "*" + i + "=" + j * i + "\t");
				}
			}
			System.out.println();
		}
}OUTPUT:

enter value
of n:51*1=1 2*1=2 3*1=3 4*1=4 5*1=51*2=2 2*2=4 3*2=6 4*2=8 5*2=101*3=3 2*3=6 3*3=9 4*3=12 5*3=151*4=4 2*4=8 3*4=12 4*4=16 5*4=201*5=5 2*5=10 3*5=15 4*5=20 5*5=251*6=6 2*6=12 3*6=18 4*6=24 5*6=301*7=7 2*7=14 3*7=21 4*7=28 5*7=351*8=8 2*8=16 3*8=24 4*8=32 5*8=401*9=9 2*9=18 3*9=27 4*9=36 5*9=451*10=10 2*10=20 3*10=30 4*10=40 5*10=50

Write program
weather the
number is
PERFECT NUMBER
or not?Def:
Perfect number, a
positive integerthat
is equal
to the
sum of
its properdivisors.
The smallest
perfect number is 6,
which is
the sum of 1,2,and
3.
import java.util.*;

class Perfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum = 1;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				sum = sum + i;
		}
		if (sum == num) {
			System.out.println(num + "is a Perfect number");
		}
		elseSystem.out.println(num + " is not a Perfect number");
	}
}OUTPUT:

enter a
number66 is
a Perfect
number

Write
a program
to display
RANGE of
PERFECT NUMBERS
?
import java.util.*;

class Rangeperfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int num = 1; num <= n; num++) {
			int sum = 1;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0)
					sum = sum + i;
			}
			if (sum == num) {
				System.out.println(num + "is a Perfect number");
			}
		}
	}
}OUTPUT:

enter a
number1001is a
perfect number6is
a perfect
number28is a
perfect number

Write a
program to
check the
given number
is PALINDROME
or not
?
import java.util.*;

class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int t = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		if (rev == t)
			System.out.println(t + " is a palindrome number");
		elseSystem.out.println(t + " is not a palindrome number");
	}
}OUTPUT:

enter a
number121121 is
a palindrome
numberenter a
number143143 is
not a
palindrome number

Write a
program to
find the
FACTORIAL of
a given number
?
import java.util.*;

class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scn.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}OUTPUT:

Enter the
number5120 Write
a program
to find
the FACTORIAL
of a
given RANGE
of numbers
?
import java.util.*;

class FactRange {
	static int fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the factorial range number");
		int k = scn.nextInt();
		for (int i = 1; i <= k; i++) {
			System.out.println(i + "!---->" + fact(i));
		}
	}
}

OUTPUT:

enter the
factorial range number:71!---->12!---->23!---->64!---->245!---->1206!---->7207!---->5040
Write program
to check
the given
number is
STRONG or not?Def:
Strong numbers
are the
numbers whose
sum of
factorial of
digits is
equal to
the original number.Example:145
is a
strong number
.
import java.util.*;

class Strongnumber {
	static int fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int num = n;
		int sum = 0;
		int t = num;
		while (num != 0) {
			int r = num % 10;
			sum = sum + fact(r);
			num = num / 10;
		}
		if (sum == t)
			System.out.println(t + " is a strong number");
		elseSystem.out.println(t + " not a strong number");
	}
}

OUTPUT:

enter a
number143143not a
strong number
Write program
weather to
find range
of STRONG NUMBER
?
import java.util.*;

class Strongnumber {
	static int fact(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Range");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			int t = num;
			while (num != 0) {
				int r = num % 10;
				sum = sum + fact(r);
				num = num / 10;
			}
			if (sum == t)
				System.out.println(t + " is a strong number");
		}
	}}OUTPUT:

	enter a
	Range1451is a
	strong number2is
	a strong
	number145 is
	a strong
	number

	Write
	a program
	to display
	FIBONACCI series
	of a number?

	Def:
	a series
	of numbers
	in which

	each number (
Fibonacci number 
 ) is the sum of the two precedingnumbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.class Fibonacci{static int fib(int n){if(n==0)return 0;if(n==1)return 1;return fib(n-1)+fib(n-2);}public static void main(String[] args){java.util.Scanner sc=new java.util.Scanner(System.in);System.out.println("Enter the number");int m=sc.nextInt();int f=fib(m);System.out.println(f);}}
OUTPUT:
Enter the number1055
Write a program to display range of FIBONACCI numbers?
import java.util.Scanner;

class FibonacciSeries1 {public static void main(String[] args){Scanner scn=new Scanner(System.in);System.out.println("enter the range:.........");int range=scn.nextInt();int a=0;int b=1;int c=0;System.out.print(a);System.out.print(b);for (int i = 2; i <=range; i++){c=a + b;

 
 if(c<=range){//c=a + b;System.out.print(c);a=b;b=c;}}}}
OUTPUT:
Enter the range….
 500 1 1 2 3 5 8 13 21 34
 Write a program to REVERSE the number?
import java.util.Scanner;

class Reversenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int t = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println(rev);
	}
}OUTPUT:

enter the
number105501

Write
a program
to display
GCD of
two numbers
?
import java.util.Scanner;

class Gcd {
	static int gcd(int m, int n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the two numbers");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int a = gcd(p, q);
		System.out.println(a);
	}
}OUTPUT:

Enter the
two numbers9012030
Write a
program to
check the
given number
is PRIME
PALINDROME or not
?
import java.util.*;

class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int t = n;
		int rev = 0;
		int i;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		if (rev == t)

		{
			for (i = 2; i < rev; i++) {
				if (rev % i == 0) {
					System.out.println("not a prime palindrome");
					break;
				}
			}
			if (rev == i)
				System.out.println(t + "is a prime palindrome number");
		}
		elseSystem.out.println(t + "is not a prime palindrome number");
	}
}OUTPUT:

enter a
number313313 is
a prime
palindrome numberenter
a number103103
is not
a prime
palindrome number
Write a
Program to
check the
given number
is ARMSTRONG
or not?Def:
An Armstrong
number is
an integer
such that
the sum
of the
power of
its digits
isequal to
the number
itself.For example,371
is an
Armstrong number since 3**3+7**3+1**3=371.9
is an
Armstrong number since 9*1=
9.
import java.util.Scanner;

public class Armstrong1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		boolean r = isArmstrong(n);
		if (r)
			System.out.println("Given num is Armstrong");
		elseSystem.out.println("Given num is not Armstrong");

	}

	static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	static boolean isAmstrong(int x) {
		int nd=countDigit(x);int t=x;int sum=0;while(t>0){int r=t%10;sum=sum+pow(r,nd);t=t/10;}if(sum==x)return true;elsereturn false;
	}
}OUTPUT:

enter the
number153Given num
is Armstrongenter
the number1Given
num is
Armstrong

Write
a Program
to display
the range
of ARMSTRONG numbers
?
import java.util.Scanner;

public class Armstrong2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			boolean r = isAmstrong(i);
			if (r)
				System.out.println(i + " is Armstrong");
		}
	}

	static int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	static boolean isAmstrong(int x) {
		int nd=countDigit(x);int t=x;int sum=0;

		while(t>0){int r=t%10;sum=sum+pow(r,nd);t=t/10;}if(sum==x)return true;elsereturn false;
	}}OUTPUT:

	enter the number:3000
	is Armstrong1
	is Armstrong2
	is Armstrong3
	is Armstrong4
	is Armstrong5
	is Armstrong6
	is Armstrong7
	is Armstrong8
	is Armstrong9
	is Armstrong153
	is Armstrong
	Write a
	program to
	Swap two
	numbers without using 3
	rd variable?

	class Swap {
		public static void main(String[] args) {
			int i=10;int j=20;i=i+j;j=i-j;i=i-j;System.out.println(“i=”+i);System.out.println(“j=”+j);
		}
	}OUTPUT:i=20 j=10

	Write a
	program to
	Swap two
	numbers with using 3
	rd variable?

	class Swapv {
		public static void main(String[] args) {
			int i=10;int j=20;int k;k=i;i=j;j=k;System.out.println(“i=”+i);

			System.out.println(“j=”+j);
		}
}OUTPUT:i=20 j=10

NUMBERCONVERSIONS

Write
a program
to convert
BINARY to DECIMAL
?
import java.util.*;

public class Bintodec {
	public static void main(String[] args) {
		System.out.println("enter the binary number");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long dec = 0;
		int count = 0;
		while (n > 0) {
			long r = n % 10;
			dec = dec + r * pow(2, count);
			count++;
			n /= 10;
		}
		System.out.println("decimal Equivalent:" + dec);
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}
}OUTPUT:

enter the
binary number111100001111decimal Equivalent:3855

Write a
program to
convert DECIMAL
to BINARY
?
import java.util.*;

public class Dectobin {
	public static void main(String[] args) {
		System.out.println("enter the decimal number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String bin = "";
		while (n > 0) {
			int r = n % 2;
			bin = r + bin;
			n = n / 2;
		}
		System.out.println("Binary Equivalent:" + bin);
	}
}OUTPUT:

enter the
decimal number3855Binary Equivalent:111100001111
Write a
program to
convert OCTAL
to DECIMAL
?
import java.util.*;

public class Octtodec {
	public static void main(String[] args) {
		System.out.println("enter the octal number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dec = 0;
		int count = 0;
		while (n > 0) {
			int r = n % 10;
			dec = dec + r * pow(8, count);
			count++;
			n /= 10;

		}
		System.out.println("decimal Equivalent:" + dec);
	}

	static int pow(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}
}OUTPUT:

enter the
octal number763decimal Equivalent:499
Write a
program to
convert DECIMAL
to OCTAL
?
import java.util.*;

public class Dectooct {
	public static void main(String[] args) {
		System.out.println("enter the decimal number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String oct = "";
		while (n > 0) {
			int r = n % 8;
			oct = r + oct;
			n = n / 8;
		}
		System.out.println("Octal Equivalent:" + oct);
	}
}OUTPUT:

enter the
decimal number56Octal Equivalent:70

Write program
weather the
string is
PANAGRAM or not?Def:
a sentence
containing every
letter of
the alphabet
.
import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		System.out.println("given string is :" + "\n" + s);
		String st = removeSpace(s);
		int d = check(st);
		if (d == -1)
			System.out.print(s + "\n" + "is not pangram");
		elseSystem.out.print(s + "\n" + "is a pangram");
	}

	public static String removeSpace(String s) {
		char ch[] = s.toCharArray();
		String nstr = "";
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] != ' ') {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static int check(String st) {
		int n=26;/*
					 * if(s.length() < n){return -1; use these lines only for perfect Panagram i.e.,
					 * it must contain only}
					 */ 26 letters(alphabets)without any repetition.for(char i='A';i<='Z';i++){if((st.indexOf(i)<0)&&(st.indexOf((char)(i+32))<0)){

		return-1;}}return 1;
	}
}OUTPUT:

enter the string:
the quick
brown fox
jumps over
a lazy
doggiven string is:
the quick
brown fox
jumps over
a lazy
dogthe quick
brown fox
jumps over
a lazy
dogis a
pangram Write
a program
check the
given string
is PALINDROME
or not
?
import java.util.Scanner;

public class PalindromeStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();
		String nstr = "";
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;
		}
		nstr = new String(ch);
		if (nstr.equalsIgnoreCase(st))
			System.out.println(st + " string is palindrome ");
		elseSystem.out.println(st + " string is not palindrome");
	}
}OUTPUT:

Enter the string:
MalayalamMalayalam string
is palindrome

Write a
program to
display REVERSE
of a STRING
?
import java.util.Scanner;

class Revstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;
		}
		st = new String(ch);
		System.out.println("Reserved string is :" + st);
	}
}OUTPUT:

enter the
stringrama and
laxmanaReserved string is:
anamxal dna
amar Write
a program
to COUNT
number of
CHARACTERS in
a String
?
import java.util.Scanner;

public class NoOfCharactersInaString {
	public static void main(String[] args) {
		int count = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string:..........");
		String st = scn.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122
					|| ch[i] >= 48 && ch[i] <= 57 && ch[i] != 32 && ch[i] != ',' && ch[i] != '.')
				count++;
		}
		System.out.println("No of Characters=" + count);
	}
}

OUTPUT:

Enter a string:..........
adkvdh dodkskNo
of Characters = 12
Write a
program to
find the
sum of
numbers in
an ALPHA
NUMERIC STRING
?
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alpha numeric string");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {
				j += ch[i] - 48;
			}
		}
		System.out.println(j);
	}
}OUTPUT:

enter the
alpha numeric
string139y1d580128 Write
a Program for
number of
characters in
each WORD
and count them
?
import java.util.Scanner;

class Countword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		String nst = " ";
		int nc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')

			{
				nst = nst + nc;
				nc = 0;
			} else {
				nc++;
				nst = nst + s.charAt(i);
			}
		}
		nst = nst + nc;
		System.out.println(" no of character in each word in a string is " + nst);
	}
}OUTPUT:

enter the
stringrama and
laxmanano of
character in
each word
in a
string is rama 4 and 3 laxmana 7
Write a
Program to
display OCCURENCES
of each
character in
a STRING
?
import java.util.Scanner;

class NumOfOcc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = sc.nextLine();
		int n = st.length();
		char ch[] = st.toCharArray();
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (ch[i] == ch[j]) {
					count++;
					int k = j;
					while (k < n - 1) {
						ch[k] = ch[k + 1];
						k++;
					}
					n--;
					j--;
				}
			}

			System.out.println(ch[i] + " occurred " + count + " times");
		}
		String nst = " ";
		for (int i = 0; i < n; i++) {
			nst = nst + ch[i];
		}
		System.out.println(nst);
	}
}OUTPUT:

Enter the
String Malayalamm occurred 2
timesa occurred 4
timesl occurred 2
timesy occurred 1
timesmaly Write
a program
to display
number of LOWERCASE,UPPERCASE,SPECIALSYMBOLS,
SPACES and
DIGITS in
a STRING
?
import java.util.Scanner;

class DiffTypeCharsSymbols {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("enter the string");String st=sc.nextLine();char ch[]=st.toCharArray();int uc=0,lc=0,spc=0,dc=0,sp=0;for(int i=0;i<ch.length;i++){if(ch[i]>=65&&ch[i]<=90){uc++;}else if(ch[i]>=97&&ch[i]<=122){lc++;}else if(ch[i]>=48&&ch[i]<=57)dc++;elseif(ch[i]==' ')sp++;

		else spc++;}System.out.println("no :of upper case letter "+uc);System.out.println("no: of lower case letter"+lc);System.out.println("no: of decimal number"+dc);System.out.println("no: of spaces "+sp);System.out.println("no: of special characters"+spc);
	}
}OUTPUT:

enter the string:PramoD123$
@gmail.comno
:of upper case letter 2 no:
of lower case letter12no:
of decimal number3no:
of spaces 0 no:
of special
characters3 Write
a program
to convert
NUMBER into WORDS
?
import java.util.*;

public class Numtoword {
	static String one[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"tweleve", "thirteen", "fourteen", "fifteeen", "sixteeen", "seventeen", "eighteen", "nineteen" };
	static String two[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eigty", "ninety" };

	static void pw(int n, String st) {
		if (n <= 19)
			System.out.print(one[n] + " ");
		elseSystem.out.print(two[n / 10] + one[n % 10] + " ");
		if (n != 0)
			System.out.print(st + " ");
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pw(num / 10000000, "crores");
		pw((num / 100000) % 100, "Lakhs");
		pw((num / 1000) % 100, "Thousand");
		pw((num / 100) % 10, "Hundered");
		pw(num % 100, " ");
	}
}

OUTPUT:

enter the number:999999
nine Lakhs
ninety nine
Thousand nine
Hundered and
ninety nine
Write a
program to
REVERSE the SENTENCE
?
import java.util.Scanner;

class Revsentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		String rst = " ";
		for (int i = ch.length - 1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}
			int j = i + 1;
			while (j <= k) {
				rst = rst + ch[j];
				j++;
			}
			rst = rst + ' ';
		}
		System.out.println("The reserve sentence is:" + rst);
	}
}OUTPUT:

enter the sentence:
rama and
laxmanaThe reserve
sentence is:
laxmana and
rama Write
a program
to REVERSE
THE WORDS
in a SENTENCE
?
import java.util.Scanner;

class Revwords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String st = sc.nextLine();

		char ch[] = st.toCharArray();
		String rst = " ";
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ') {
				i++;
			}
			int j = i - 1;
			while (k <= j) {
				rst = rst + ch[j];
				j--;
			}
			rst = rst + ' ';
		}
		System.out.println("The reserved words of sentence is:" + rst);
	}
}OUTPUT:

enter the sentence:
rama and
laxmana The
reserved words
of sentence is:
amar dna
anamxal Write
a program
to display
STRING INITCAP
of Words
?
import java.util.Scanner;

class Stringinitcap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || (ch[i] != ' ' && ch[i - 1] == ' ')) {
				if (ch[i] >= 97 && ch[i] <= 122) {
					ch[i] = (char) (ch[i] - 32);
				} else if (ch[i] >= 65 && ch[i] <= 90) {
					ch[i] = (char) (ch[i] - 32);
				}
			}

		}
		st = new String(ch);
		System.out.println("enter the string in it cap : " + st);
	}
}OUTPUT:

enter the string:
pramod reddy
pavan chanduenter
the string
in it cap:
P ramod
R eddy
P avan
C handu
Write a
program to
convert UPPER
CASE TO
LOWER CASE&
VICE VERSA
?
import java.util.Scanner;

class Stringuptolow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				ch[i] = (char) (ch[i] - 32);
			}
		}
		st = new String(ch);
		System.out.println("converted String in Case : " + st);
	}
}OUTPUT:

enter the string:
PraMoD ReddY
GoPi RedDYconverted
String in Case:
pRAmOd rEDDy
gOpI rEDdy

Write a
program to
find a SUB-
STRING without
using INBUILT functions
?
import java.util.Scanner;

class Substring {
	public static void main(String[] args) {
		System.out.println("enter the main string");
		Scanner sc = new Scanner(System.in);
		String st1 = sc.next();
		char ch1[] = st1.toCharArray();
		System.out.println("enter the sub string");
		String st2 = sc.next();
		char ch2[] = st2.toCharArray();
		int find = 0;
		for (int i = 0; i < ch1.length; i++) {
			int k = i, j = 0;
			while (k < ch1.length && j < ch2.length && ch1[k] == ch2[j]) {
				j++;
				k++;
			}
			if (j == ch2.length) {
				find++;
				System.out.println(find + " times " + st2 + " present between " + i + " to" + k + " indexs");
			}
		}
		if (find == 0)
			System.out.println("not found");
	}
}OUTPUT:

enter the
main string:
PramodReddyenter the
sub string:
Reddy1 times
Reddy present between 6 to 11
indexs

Write
a program
to convert
Integer of
String type
to INTEGER
type withoutusing parse int
?
import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("enter the String");String s=sc.next();System.out.println(" After converting string to integer");int d=check(s);if(d==0)System.out.println("not valid string ");else System.out.println(d+“is in integer type");
	}

	public static int check(String s) {
		int i = 0, number = 0;
		for (int j = 0; j < s.length(); j++) {
			char ch[] = s.toCharArray();
			if (ch[j] > 'a' && ch[j] <= 'z' || ch[j] > 'A' && ch[j] <= 'Z') {
				return 0;
			}
		}
		while (i < s.length()) {
			number = number * 10;
			number = number + (s.charAt(i++) - '0');
		}
		return number;
	}}OUTPUT:

	enter the
	String3306After converting
	string to
	integer3306 is
	in integer
	type

	SEARCHING&
	SORTINGPROGRAMS

	Write
	a program for
	LINEAR SEARCH?

	public class SearchLinear {
		public static int linearSearch(int[] arr, int x) {
			for (int i = 0; i < arr.length; i++) {
				if (x == arr[i]) {
					return i;
				}
			}
			return -1;
		}

		public static void main(String[] args) {
			int[] ar = { 3, 46, 76, 4, 89, 7, 27 };
			System.out.println(linearSearch(ar, 4));
			System.out.println(linearSearch(ar, 78));
		}
	}OUTPUT:3-1

	Write a program for
	BINARY SEARCH?

	public class SearchBinary {
		public static int binarySearch(int[] arr, int x) {
			int first = 0;
			int last = arr.length - 1;
			while (first <= l) {
				int middle = (first + last) / 2;
				if (x == arr[middle]) {
					return middle;
				}

				else if (x > arr[middle]) {
					first = middle + 1;
				} else {
					last = middle - 1;
				}
			}
			return -1;
		}

		public static void main(String[] args) {
			int[] i = { 10, 49, 67, 90, 40, 86 };
			System.out.println(binarySearch(i, 49));
		}
	}OUTPUT:1

	Write a program for
	BUBBLE SORT?

	class Bubbledown {
		public static void sortdown(int[] a) {
			int n = a.length;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}

		public static void main(String[] args)

		{
			int[] a = { 5, 8, 1, 6, 9, 2 };
			sortdown(a);
			for (int x : a) {
				System.out.println(x);
			}
		}
}OUTPUT:125689

PROGRAMS on
ARRAYS

Write
a program
to INSERT
the ELEMENTS
in an Array
?
import java.util.Scanner;

public class InstSingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("enter the " + length + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr [" + i + "] ---->" + arr[i]);
		}
	}
}Output:

enter the
size5Enter the 5 elements235864arr[0]---->2 arr[1]---->3 arr[2]---->5 arr[3]---->8 arr[4]---->64
Write a
Program to
REVERSE THE
ELEMENTS of
an array
?
import java.util.Scanner;

public class InstSingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("enter the size");int length=sc.nextInt();int arr[]=new int[length];

		System.out.println("enter the "+length+" elements");for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}System.out.println(“Before Reverse of an Array”);for(int i=0;i<arr.length;i++){System.out.println("arr ["+i+"] ---->"+arr[i]);}for(int i=0;i<arr.length/2;i++){int t=arr[i];arr[i]=arr[arr.length-1-i];arr[arr.length-1-i)=t;}System.out.println(“After Reverse of an Array”);for(int i=0;i<arr.length;i++){System.out.println("arr ["+i+"] ---->"+arr[i]);}
	}
}Output:

Enter the
size5Enter the 5
elements15689Before Reverse
of an Arrayarr[0]---->1 arr[1]---->5 arr[2]---->6 arr[3]---->8 arr[4]---->9
After Reverse
of an Arrayarr[0]--9 arr[1]--8 arr[2]--6 arr[3]--5 arr[4]--1

Write a
program to
INSERT A
ELEMENT INTO
EXISTING ARRAY
in a specifiedposition
?

import java.util.Scanner;

class Insertingelement {
	public

	static

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		int arr[] = new

		int[length];
		System.out.println("enter the " + length + " elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("length of array before inserting" + "--->" + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "------->" + arr[i]);
		}
		System.out.println("enter the index of specified position or index");
		int in = sc.nextInt();
		System.out.println("enter the element to replace to specified index");
		int ele = sc.nextInt();
		arr = insert(arr, in, ele);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "------->" + arr[i]);
		}
	}

	static

	int[] insert(int a[], int in, int ele) {

	i f(in>a.length||in<0) {
		System.out.println("invalid index");return a;}else{int na[]=new

		int[a.length+1];for(int i=0;i<in;i++){na[i]=a[i];

		}na[in]=ele;for(int i=in;i<a.length;i++){na[i+1]=a[i];}System.out.println("length of array after inserting"+"--->"+na.length);return na;}
	}
}Output:

enter the
length5enter the 5
elements286788length of
array before inserting--->50------->21------->82------->63------->74------->88en
ter the
index of
specified position
or index3enter
the element
to replace
to specified
index62length of
array after inserting--->60------->21------->82------->63------->624------->75------->88

Write a
program to
DELETE AN
ELEMENT OF
A SPECIFIED
INDEX IN
THEEXISTING ARRAY
?

import java.util.Scanner;

class DeletingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
		int length = sc.nextInt();
		int ar[] = new int[length];
		System.out.println("enter the " + length + " elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("length of array before deleting" + "--->" + ar.length);
		display(ar);
		System.out.println("enter specified position for deleting that element");
		int in = sc.nextInt();
		ar = delete(ar, in);
		display(ar);
	}

	static void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(i + "------->" + a[i]);
	}

	static int[] delete(int a[], int in) {
		If(in>a.length||in<0){System.out.println("invalid index");return a;}else{int na[]=new int[a.length-1];for(int i=0;i<in;i++){na[i]=a[i];}

		for(int i=in;i<a.length;i++){na[i-1]=a[i];}System.out.println("length of array after deleting"+"---->"+na.length);return na;}
	}
}OUTPUT:

enter the
length6enter the 6
elements559862length of
array before deleting--->60------->51------->52------->93------->84------->65------->2en
ter specified position for
deleting that
element5length of
array after deleting---->50------->51------->52------->93------->84------->2
Write a
program to
SEARCH AN
ELEMENT IN
THE EXISTING ARRAY?

public class Search element
{

		public static void main(String[] args) {
			int ar[] = { 22, 11, 23, 11, 15, 19 };
			int inx = search(ar, 15);
			display(ar);
			if (inx >= 0)
				System.out.println("your element found at index " + inx);
			else

				System.out.println("not valid");
		}

		static void display(int a[]) {
			for (int i = 0; i < a.length; i++)
				System.out.println(i + "------->" + a[i]);
		}

		static int search(int a[], int ele) {
			for(int i=0;i<a.length;i++){If(ele==a[i])return i;}return-1;
		}
}OUTPUT:0------->221------->112------->233------->114------->155------->19

your element
found at index 4
Write a
program to
find BIGGEST
AND SMALLEST
ELEMENT in
the given array
?
import java.util.Scanner;

public class BigeleArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("enter the length");int length=sc.nextInt();int arr[]=new int[length];int bigger=0;int smaller=0;System.out.println("enter the "+length+“elements");for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}for(int i=0;i<arr.length;i++)

		{System.out.println("arr ["+i+"] ----> "+arr[i]);}for(int i=0;i<arr.length;i++){int big=arr[0];int small=arr[0];if(big<arr[i]){big=arr[i];}if(small>arr[i]){small=arr[i];}smaller=small;bigger=big;}System.out.println("biggest element is ---->"+bigger);System.out.println("Smallest element is ---->"+smaller);
	}}OUTPUT:

	enter the length5enter the 5el ements18996675arr[0]---->1 arr[1]---->8 arr[2]---->99 arr[3]---->66 arr[4]---->75
	biggest element is---->75
	Smallest element is---->1

	Write a
	program to
	find FIRST
	BIGGEST AND
	SECOND BIGGEST
	ELEMENT ingiven array?

	class Fbiggest {
		public static void main(String[] args) {
			int ar[]={23,12,14,56,22,28,13};int fbig=ar[0];int sbig=ar[1];for(int i=1;i<ar.length;i++){if(fbig<ar[i]){sbig=fbig;fbig=ar[i];}else if(sbig<ar[i]){sbig=ar[i];}}System.out.println("first biggest element is “+fbig);

			System.out.println("second biggest element is “+sbig);
		}
	}OUTPUT:

	First biggest
	element is 56
	Second biggest
	element is 28
	Write a
	program to
	FIND THE
	SECOND OCCURRENCE
	ELEMENT in
	a givenarray?

	class Secondoccuranceelement {
		public static void main(String[] args) {
			int ar[] = { 22, 11, 23, 11, 15, 19, 11 };
			int inx = secondoccurance(ar, 11);
			display(ar);
			if (inx >= 0)
				System.out.println("Second time occurred element found at the index " + inx);
			elseSystem.out.println("not valid");

		}

		static void display(int a[]) {
			for (int i = 0; i < a.length; i++)
				System.out.println("arr [" + i + "]" + "------->" + a[i]);
		}

		static int secondoccurance(int a[], int ele) {
			int count=0;for(int i=0;i<a.length;i++){If(ele==a[i])count++;if(count==2)return i;}return-1;
		}
	}OUTPUT:arr[0]------->22 arr[1]------->11 arr[2]------->23 arr[3]------->11 arr[4]------->15 arr[5]------->19 arr[6]------->11

	Second time
	occurred element
	found at
	the index 3
	Write a
	program to
	FIND THE
	OCCURRENCE ELEMENT
	IN which
	position in
	agiven array?

	class Occuranceelement {
		public static void main(String[] args) {
			int ar[] = { 22, 11, 23, 11, 15, 19, 11 };
			int inx = occurrence(ar, 11, 2);
			display(ar);
			if (inx >= 0)
				System.out.println("your element found at index " + inx);
			elseSystem.out.println("not valid");
		}

		static void display(int a[]) {
			for (int i = 0; i < a.length; i++)
				System.out.println(i + "------->" + a[i]);
		}

		static int occurrence(int a[], int ele, int oc) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (ele == a[i])
					count++;
				if (count == oc)
					return i;
			}
			return -1;
		}
	}OUTPUT:0------->221------->112------->233------->114------->155------->196------->11

	Your element
	found at index 3
	Write a
	program to
	FIND HOW
	MANY TIMES
	ELEMENT IS
	OCCURED in
	a givenarray?

	class Elementoccured {
		public static void main(String[] args) {
			int ar[]={22,11,23,11,15,19,11};int in=occurred(ar,11);display(ar);if(in>=0)System.out.println("your element occurred “+in);elseSystem.out.println("not valid");
		}

		static void display(int a[]) {
			for (int i = 0; i < a.length; i++)
				System.out.println(i + "------->" + a[i]);

		}

		static int occurred(int a[], int ele) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (ele == a[i])
					count++;
			}
			return count;
		}
	}OUTPUT:0------->221------->112------->233------->114------->155------->196------->11

	Your element occurred 3
	Write a
	program to
	DISPLAY MISSING
	ELEMENT in
	a given
	sorted array?

	class Missingelements {
		public static void main(String[] args) {
			int ar[] = { 8, 15, 21, 24, 30, 37 };
			System.out.println("Missing elements in given array are :");
			for (int i = 0; i < ar.length - 1; i++) {
				for (int j = ar[i] + 1; j < ar[i + 1]; j++) {
					System.out.println(j);
				}
			}
		}
	}OUTPUT:

	Missing elements
	in given
	array are:9,10,11,12,13,14,16,17,18,19,20,22,23,25,26,27,28,29,31,32,33,34,35,36

	Write a
	program to
	FIND HIGHEST
	CONTIGUOUS SUM
	OF TWO
	ELEMENT in
	agiven array?

	public class Sumoftwoelemnts {public static void main (String [] args){int ar[]={21,12,15,32,16,17,22};int inx=0;int big=ar [0] +ar [1];for (int i=1; i<ar.length-1; i++){if (big<ar[i] + ar [i+1]){big=ar[i] +ar [i+1];inx=i;}}
System.out.println (“sum of two element"+"
----->"+big);
System.out.println (“the first element"+"
--->"+ar [inx]);System.out.println (" the second element"+"--->"+ar [inx+1]);}}
OUTPUT:
Sum of two element----->48The first element--->32The second element--->16
Write a program to DISPLAY THE COMMON ELEMENTS between two arrays?
 
public class Commonelement{public static void main (String [] args){int ar1 [] = {12, 13, 23, 15, 11, 16};int ar2 [] = {53, 26, 23, 15, 18, 13};System.out.println ("common elements are: ");for (int i=0; i<ar1.length; i++){for (int j=0; j<ar2.length;j++ ){if (ar1 [i] ==ar2 [j]){System.out.println (ar1 [i]);
 
 break;}}}}}
OUTPUT:
common elements are:
 
132315
 
Write a program to EXCHANGE OF FIRST PART ELEMENT TO SECOND PARTElement between two arrays?
public class Exchangeofelements{public static void main (String [] args){int ar[]={21,12,15,32,16,17,22};System.out.println ("BEFORE EXCHANGE OF ARRAY");for (int i = 0; i < ar.length; i++){System.out.println (ar[i]);}int n;if (ar.length%2==0)n=ar.length/2;elsen= (ar.length/2) +1;for (int i=0; i<ar.length/2; i++){int t=ar[i];ar[i] =ar [n+i];ar [n+i]=t;}System.out.println ("AFTER EXCHANGE OF ARRAY");for (int i = 0; i < ar.length; i++){System.out.println (ar[i]);}}}
 
OUTPUT:
BEFORE EXCHANGE OF ARRAY21121532161722AFTER EXCHANGE OF ARRAY16172232211215
Write program TO DISPLAY DISTINCT ELEMENTS from given two array?
public class Disctinctelements{public static void main (String [] args){int ar1 [] = {12, 13, 23, 15, 11, 16};int ar2 [] = {53, 26, 23, 15, 18, 13};System.out.println ("Distinct elements from given two arrays");for (int i=0; i<ar1.length; i++){int find=0;for (int j=0; j<ar2.length; j++){if (ar1 [i] ==ar2 [j]){find=1;break;}}if (find==0)System.out.println (ar1 [i]);}for (int i=0; i<ar2.length; i++){int find=0;for (int j=0; j<ar1.length; j++)
Reward Your Curiosity
Everything you want to read.
Anytime. Anywhere. Any device.
Read free for 30 days
No Commitment. Cancel anytime.

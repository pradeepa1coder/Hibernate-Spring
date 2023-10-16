package MultipleLevelInheritence.intrfaces;

public interface Parent1 {
	public void care();
	public void fun();

	public default void drink()
	{
		System.out.println("parent1 is drinking");
	}

	public static void main(String[] args)
	{
		System.out.println("hii");

	}
}

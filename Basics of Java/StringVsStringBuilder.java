/*
  A String can be used when immutability is required, or concatenation operation is not required. A StringBuilder can be used when a mutable string is needed without the performance overhead of constructing lots of strings along the way.
  That’s all about the differences between String and StringBuilder in Java.
*/

public class StringVsStringBuilder {
	public static void concat1(String s1)
	{
		s1 = s1 + "LastName";
	}

	public static void concat2(StringBuilder s2)
	{
		s2.append("LastName");
	}

	public static void main(String[] args){
		String s1 = "FirstName ";
		concat1(s1);
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("FirstName ");
		concat2(s2);
		System.out.println("StringBuilder: " + s2);
	}
}

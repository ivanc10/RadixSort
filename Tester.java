public class Tester {
	public static void main(String[] args) {
		System.out.println(Radix.nth(123,1));
		System.out.println(Radix.nth(-123,1));
		System.out.println(Radix.nth(123,2));
		System.out.println(Radix.nth(-123,2));
		System.out.println(27/4);

		System.out.println();

		System.out.println(Radix.length(0));
		System.out.println(Radix.length(15));
		System.out.println(Radix.length(-10));
		System.out.println(Radix.length(5112));

		MyLinkedList original = new MyLinkedList();
		original.add("0"); original.add("1"); original.add("1");
		original.add("2"); original.add("3"); original.add("5");
		System.out.println("original: " + original);

		MyLinkedList bucketA = new MyLinkedList();
		MyLinkedList bucketB = new MyLinkedList();
		MyLinkedList bucketC = new MyLinkedList();

		for (int i = 0; i < 5; i++) {
			bucketA.add(""+i);
			bucketB.add(""+i*i);
			bucketC.add(""+i*i*i);
		}

		System.out.println("bucketA: " + bucketA);
		System.out.println("bucketB: " + bucketB);
		System.out.println("bucketC: " + bucketC);

		MyLinkedList[] buckets = {bucketA, bucketB, bucketC};

		System.out.println("after MyLinkedList[] buckets = {bucketA, bucketB, bucketC}");
		System.out.println("method call: Radix.merge(original, buckets)");
		Radix.merge(original, buckets);
		System.out.println("original: " + original);

	}
}
package week9.examples;

public class TestInterfaces {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Person p = new Person();
		Building b = new Building();

		Transportable[] list1 = new Transportable[10];

		list1[0] = v;
		list1[1] = p;
		for (Transportable transportable : list1) {
			if (transportable != null)
				transportable.printInvoice();
		}

		Insurable[] list2 = new Insurable[10];
		list2[0] = v;
		list2[1] = p;
		list2[2] = b;

		for (int i = 0; i < list2.length; i++) {
			if (list2[i] != null)
				System.out.println(list2[i].getPremium());
		}

	}

}

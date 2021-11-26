package optionalclasscore;

interface Abc {
	void get();
}

public class MethodReferenceCore {
	public static void set() {
		System.out.println("hello welcome to csi, pune");
	}

	public static void main(String[] args) {
		Abc aa = MethodReferenceCore::set;
		aa.get();
	}
}

package Java8Interface;

public interface DefInterface {

	default void print() {
		System.out.println("defInterface mehtod :");
	}
	static void show() {
		System.out.println("SHOW STATIC :");
	}
}

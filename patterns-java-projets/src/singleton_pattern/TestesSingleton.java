package singleton_pattern;

public class TestesSingleton {

	public static void main(String[] args) {

		// Lazy testes.
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		// Lazy Holder testes.
		// Eager testes.
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);

		// Eager testes.
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
	}

}

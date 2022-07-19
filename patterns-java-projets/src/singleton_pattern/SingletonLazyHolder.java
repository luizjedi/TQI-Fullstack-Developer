package singleton_pattern;

/**
 * Singleton "Lazy Holder"
 * 
 * @author luizjedi
 *
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}

}

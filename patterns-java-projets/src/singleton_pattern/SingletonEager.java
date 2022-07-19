package singleton_pattern;

/**
 * Singleton "apressado"
 * 
 * @author luizjedi
 *
 */
public class SingletonEager {

	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstance() {
		return instance;
	}

}

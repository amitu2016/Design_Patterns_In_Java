package sigletonpattern;

public class Client {

	public static void main(String[] args) {
		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		System.out.println(singleton);
		System.out.println(singleton2);
	}

}

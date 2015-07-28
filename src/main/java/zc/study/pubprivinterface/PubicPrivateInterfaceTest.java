package zc.study.pubprivinterface;

import zc.study.pubprivinterface.impl.ServiceImpl;


/**
 * This is a demonstration of providing multiple interfaces on top of the same object implementation to allow or
 * disallow a client to access some super-user methods.
 *
 * @author Pascal Jacob
 */
public class PubicPrivateInterfaceTest {

	static ServiceImpl object = new ServiceImpl();


	public static void main(String[] args) {

		/*
		 * Method writeObject is accessible to client having the SuperUserInterface.
		 */
		SuperUserInterface service = getServiceAsSuperUser();
		service.writeObject("test");

		/*
		 * Method writeObject is NOT accessible to client having only the NormalUserInterface.
		 */
		NormalUserInterface service2 = getServiceAsNormalUser();
//		service2.writeObject("error");
		Object value = service2.readObject();
		System.out.println(value);
	}

	public static SuperUserInterface getServiceAsSuperUser() {
		return object;
	}

	public static NormalUserInterface getServiceAsNormalUser() {
		return object;
	}
}

/* EOF */

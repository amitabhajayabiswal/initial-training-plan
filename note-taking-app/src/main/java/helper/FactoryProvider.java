package helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	private static SessionFactory databaseSession;

	private FactoryProvider(){

	}
	public static SessionFactory getFactory() {

		if (databaseSession == null) {
			databaseSession = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}

		return databaseSession;
	}

	public void closeFactory() {
		if (databaseSession.isOpen()) {
			databaseSession.close();
		}
	}
}

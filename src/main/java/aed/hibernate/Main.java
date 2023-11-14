package aed.hibernate;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
	
		Session sesion = HibernateUtil.getSessionFactory().openSession(); //crea
		sesion.beginTransaction();

	}

}

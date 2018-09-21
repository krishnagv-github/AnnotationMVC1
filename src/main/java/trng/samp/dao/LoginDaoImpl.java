package trng.samp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import trng.samp.pojo.LoginVerify;
import trng.samp.utils.HibernateUtils;

@Repository
public class LoginDaoImpl implements LoginDaoInt{
	
	SessionFactory sf;
	public LoginDaoImpl() {
		sf = HibernateUtils.getSessionFactory();
	}
	
	public LoginVerify details(String username) {
		Session session = sf.openSession();
		session.getTransaction().begin();
		LoginVerify lf = (LoginVerify)session.get(LoginVerify.class, username);
		sf.openSession().close();
		return lf;
	}

}

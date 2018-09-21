package trng.samp.services;

import org.springframework.stereotype.Service;

import trng.samp.dao.LoginDaoImpl;
import trng.samp.pojo.LoginVerify;

@Service
public class LoginServiceImpl implements LoginServiceInt {

	LoginDaoImpl ldi = new LoginDaoImpl();

	public boolean verifyLogin(LoginVerify lv) {
		// TODO Auto-generated method stub
		LoginVerify obj = ldi.details(lv.getUsername());
		if (obj != null && lv.getUsername().equals(obj.getUsername()) && lv.getPassword().equals(obj.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}

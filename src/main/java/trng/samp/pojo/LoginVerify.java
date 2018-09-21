package trng.samp.pojo;

import javax.persistence.*;

@Entity
@Table(name="logindb")
public class LoginVerify {

//	@Id
//	@Column(name = "id", unique = true)
//	private int userId;
	
	@Id
	@Column(name = "username", unique = true)
	private String username;
	@Column(name = "password")
	private String password;
	
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@Override
//	public String toString() {
//		return "LoginVerify [userId=" + userId + ", username=" + username + ", password=" + password + "]";
//	}
	@Override
	public String toString() {
		return "LoginVerify [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
}

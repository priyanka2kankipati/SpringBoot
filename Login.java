package bootmvc;

import org.springframework.stereotype.Component;

@Component
public class Login {
 private String userid;
 private String pass;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
 
 
}

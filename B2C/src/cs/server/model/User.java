package cs.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	public String id ;
	
	@Column(name = "acc")
	public String acc;
	

	@Column(name = "pwd")
	public String pwd;
	
	@Column(name = "cname")
	public String cname;
	
	
	@Column(name = "login_date")
	public String login_date;
	
	@Column(name = "reg_date")
	public String reg_date;
	

	@Column(name = "mail")
	public String mail;
	
	@Column(name = "role")
	public String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLogin_date() {
		return login_date;
	}

	public void setLogin_date(String login_date) {
		this.login_date = login_date;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}



	

	public User() {
		
	}

	
	public User( String acc, String pwd, String cname, String login_date, String reg_date, String mail,
			String role) {
		
		this.acc = acc;
		this.pwd = pwd;
		this.cname = cname;
		this.login_date = login_date;
		this.reg_date = reg_date;
		this.mail = mail;
		this.role = role;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
	
}

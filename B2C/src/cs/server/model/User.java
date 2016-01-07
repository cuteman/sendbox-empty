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
	
	@Column(name = "userid")
	public String userid;
	
	@Column(name = "cname")
	public String cname;
	
	@Column(name = "weight")
	public float weight;
	
	@Column(name = "login_date")
	public String login_date;
	
	@Column(name = "reg_date")
	public String reg_date;
	

	@Column(name = "mail")
	public String mail;
	
	@Column(name = "origin")
	public int origin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
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

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	public User(String id, String userid, String cname, float weight,
			String login_date, String reg_date, String mail, int origin) {
		super();
		this.id = id;
		this.userid = userid;
		this.cname = cname;
		this.weight = weight;
		this.login_date = login_date;
		this.reg_date = reg_date;
		this.mail = mail;
		this.origin = origin;
	}

	public User() {
		
	}
	
	
	
	
	
}

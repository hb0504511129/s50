package ttmy.module.s50.module;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import ttmy.framework.base.model.BaseEntity;

@Entity
@Table(name = "tt_phone_count")
public class PhoneCount extends BaseEntity {
	private static final long serialVersionUID = -6776273036867671478L;
	@Column(name = "phone")
	private String phone;
	@Column(name = "dt")
	private Date dt;
	@Column(name = "ct")
	private int ct;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public int getCt() {
		return ct;
	}

	public void setCt(int ct) {
		this.ct = ct;
	}

}

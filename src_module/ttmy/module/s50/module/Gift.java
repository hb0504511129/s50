package ttmy.module.s50.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ttmy.framework.base.model.BaseEntity;

@Entity
@Table(name = "tm_gift")
public class Gift extends BaseEntity {

	private static final long serialVersionUID = -4435174173285168018L;

	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "num")
	private int num;
	@Column(name = "rate")
	private double rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}

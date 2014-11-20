package ttmy.module.s50.module;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ttmy.framework.base.model.BaseEntity;

@Entity
@Table(name = "tm_active")
public class Active extends BaseEntity {

	private static final long serialVersionUID = -2117070422160061983L;

	@Column(name = "from_dt")
	private Date fromDt;
	@Column(name = "to_dt")
	private Date toDt;
	@Column(name = "status")
	private int status;

	@Id
	@Column(name = "id")
	public Long getId() {
		return super.getId();
	}

	public Date getFromDt() {
		return fromDt;
	}

	public void setFromDt(Date fromDt) {
		this.fromDt = fromDt;
	}

	public Date getToDt() {
		return toDt;
	}

	public void setToDt(Date toDt) {
		this.toDt = toDt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}

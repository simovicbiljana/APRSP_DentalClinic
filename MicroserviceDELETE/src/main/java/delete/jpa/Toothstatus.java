package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the toothstatus database table.
 * 
 */
@Entity
public class Toothstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TOOTHSTATUS_TOOTHSTATUSID_GENERATOR", sequenceName="TOOTH_STATUS_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TOOTHSTATUS_TOOTHSTATUSID_GENERATOR")
	private Integer toothstatusid;

	private String statusname;

	//bi-directional many-to-one association to Tooth
	@OneToMany(mappedBy="toothstatus")
	@JsonIgnore
	private List<Tooth> tooths;

	public Toothstatus() {
	}

	public Integer getToothstatusid() {
		return this.toothstatusid;
	}

	public void setToothstatusid(Integer toothstatusid) {
		this.toothstatusid = toothstatusid;
	}

	public String getStatusname() {
		return this.statusname;
	}

	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}

	public List<Tooth> getTooths() {
		return this.tooths;
	}

	public void setTooths(List<Tooth> tooths) {
		this.tooths = tooths;
	}

	public Tooth addTooth(Tooth tooth) {
		getTooths().add(tooth);
		tooth.setToothstatus(this);

		return tooth;
	}

	public Tooth removeTooth(Tooth tooth) {
		getTooths().remove(tooth);
		tooth.setToothstatus(null);

		return tooth;
	}

}
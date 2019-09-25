package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tooth database table.
 * 
 */
@Entity
public class Tooth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TOOTH_TOOTHID_GENERATOR", sequenceName="TOOTH_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TOOTH_TOOTHID_GENERATOR")
	private Integer toothid;

	private String regnumofteeth;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientid")
	private Patient patient;

	//bi-directional many-to-one association to Toothstatus
	@ManyToOne
	@JoinColumn(name="toothstatusid")
	private Toothstatus toothstatus;

	public Tooth() {
	}

	public Integer getToothid() {
		return this.toothid;
	}

	public void setToothid(Integer toothid) {
		this.toothid = toothid;
	}

	public String getRegnumofteeth() {
		return this.regnumofteeth;
	}

	public void setRegnumofteeth(String regnumofteeth) {
		this.regnumofteeth = regnumofteeth;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Toothstatus getToothstatus() {
		return this.toothstatus;
	}

	public void setToothstatus(Toothstatus toothstatus) {
		this.toothstatus = toothstatus;
	}

}
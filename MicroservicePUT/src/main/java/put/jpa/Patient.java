package put.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the patient database table.
 * 
 */
@Entity
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PATIENT_PATIENTID_GENERATOR", sequenceName="PATIENT_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PATIENT_PATIENTID_GENERATOR")
	private Integer patientid;

	private String adress;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	private String firstname;

	private String jmbg;

	private String lastname;

	private String note;

	private String phone;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="patient")
	@JsonIgnore
	private List<Performedservice> performedservices;

	//bi-directional many-to-one association to Tooth
	@OneToMany(mappedBy="patient")
	@JsonIgnore
	private List<Tooth> tooths;

	public Patient() {
	}

	public Integer getPatientid() {
		return this.patientid;
	}

	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getDateofbirth() {
		return this.dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Performedservice> getPerformedservices() {
		return this.performedservices;
	}

	public void setPerformedservices(List<Performedservice> performedservices) {
		this.performedservices = performedservices;
	}

	public Performedservice addPerformedservice(Performedservice performedservice) {
		getPerformedservices().add(performedservice);
		performedservice.setPatient(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setPatient(null);

		return performedservice;
	}

	public List<Tooth> getTooths() {
		return this.tooths;
	}

	public void setTooths(List<Tooth> tooths) {
		this.tooths = tooths;
	}

	public Tooth addTooth(Tooth tooth) {
		getTooths().add(tooth);
		tooth.setPatient(this);

		return tooth;
	}

	public Tooth removeTooth(Tooth tooth) {
		getTooths().remove(tooth);
		tooth.setPatient(null);

		return tooth;
	}

}
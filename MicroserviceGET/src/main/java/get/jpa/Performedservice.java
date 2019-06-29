package get.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the performedservice database table.
 * 
 */
@Entity
@NamedQuery(name="Performedservice.findAll", query="SELECT p FROM Performedservice p")
public class Performedservice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERFORMEDSERVICE_PERFORMEDSERVICEID_GENERATOR", sequenceName="PERFORMED_SERVICE_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERFORMEDSERVICE_PERFORMEDSERVICEID_GENERATOR")
	private Integer performedserviceid;

	@Temporal(TemporalType.DATE)
	private Date dateofservice;

	private String nameofservice;

	private Boolean paid;

	//bi-directional many-to-one association to Diagnosis
	@ManyToOne
	@JoinColumn(name="diagnosisid")
	private Diagnosis diagnosi;

	//bi-directional many-to-one association to Employed
	@ManyToOne
	@JoinColumn(name="employedid")
	private Employed employed;

	//bi-directional many-to-one association to Material
	@ManyToOne
	@JoinColumn(name="materialid")
	private Material material;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientid")
	private Patient patient;

	//bi-directional many-to-one association to Typeofservice
	@ManyToOne
	@JoinColumn(name="typeofserviceid")
	private Typeofservice typeofservice;

	//bi-directional many-to-one association to Workplace
	@ManyToOne
	@JoinColumn(name="workplaceid")
	private Workplace workplace;

	public Performedservice() {
	}

	public Integer getPerformedserviceid() {
		return this.performedserviceid;
	}

	public void setPerformedserviceid(Integer performedserviceid) {
		this.performedserviceid = performedserviceid;
	}

	public Date getDateofservice() {
		return this.dateofservice;
	}

	public void setDateofservice(Date dateofservice) {
		this.dateofservice = dateofservice;
	}

	public String getNameofservice() {
		return this.nameofservice;
	}

	public void setNameofservice(String nameofservice) {
		this.nameofservice = nameofservice;
	}

	public Boolean getPaid() {
		return this.paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Diagnosis getDiagnosi() {
		return this.diagnosi;
	}

	public void setDiagnosi(Diagnosis diagnosi) {
		this.diagnosi = diagnosi;
	}

	public Employed getEmployed() {
		return this.employed;
	}

	public void setEmployed(Employed employed) {
		this.employed = employed;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Typeofservice getTypeofservice() {
		return this.typeofservice;
	}

	public void setTypeofservice(Typeofservice typeofservice) {
		this.typeofservice = typeofservice;
	}

	public Workplace getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(Workplace workplace) {
		this.workplace = workplace;
	}

}
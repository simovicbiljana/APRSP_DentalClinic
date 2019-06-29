package put.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the diagnosis database table.
 * 
 */
@Entity
@NamedQuery(name="Diagnosis.findAll", query="SELECT d FROM Diagnosis d")
public class Diagnosis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIAGNOSIS_DIAGNOSISID_GENERATOR", sequenceName="DIAGNOSIS_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIAGNOSIS_DIAGNOSISID_GENERATOR")
	private Integer diagnosisid;

	private String nameofdiagnosis;

	private String therapy;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="diagnosi")
	@JsonIgnore
	private List<Performedservice> performedservices;

	public Diagnosis() {
	}

	public Integer getDiagnosisid() {
		return this.diagnosisid;
	}

	public void setDiagnosisid(Integer diagnosisid) {
		this.diagnosisid = diagnosisid;
	}

	public String getNameofdiagnosis() {
		return this.nameofdiagnosis;
	}

	public void setNameofdiagnosis(String nameofdiagnosis) {
		this.nameofdiagnosis = nameofdiagnosis;
	}

	public String getTherapy() {
		return this.therapy;
	}

	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}

	public List<Performedservice> getPerformedservices() {
		return this.performedservices;
	}

	public void setPerformedservices(List<Performedservice> performedservices) {
		this.performedservices = performedservices;
	}

	public Performedservice addPerformedservice(Performedservice performedservice) {
		getPerformedservices().add(performedservice);
		performedservice.setDiagnosi(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setDiagnosi(null);

		return performedservice;
	}

}
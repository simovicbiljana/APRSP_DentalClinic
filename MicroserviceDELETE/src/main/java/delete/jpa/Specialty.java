package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the specialty database table.
 * 
 */
@Entity
@NamedQuery(name="Specialty.findAll", query="SELECT s FROM Specialty s")
public class Specialty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SPECIALTY_SPECIALTYID_GENERATOR", sequenceName="SPECIALTY_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECIALTY_SPECIALTYID_GENERATOR")
	private Integer specialtyid;

	private String academictitle;

	private String nameofspecialty;

	//bi-directional many-to-one association to Employed
	@OneToMany(mappedBy="specialty")
	@JsonIgnore
	private List<Employed> employeds;

	public Specialty() {
	}

	public Integer getSpecialtyid() {
		return this.specialtyid;
	}

	public void setSpecialtyid(Integer specialtyid) {
		this.specialtyid = specialtyid;
	}

	public String getAcademictitle() {
		return this.academictitle;
	}

	public void setAcademictitle(String academictitle) {
		this.academictitle = academictitle;
	}

	public String getNameofspecialty() {
		return this.nameofspecialty;
	}

	public void setNameofspecialty(String nameofspecialty) {
		this.nameofspecialty = nameofspecialty;
	}

	public List<Employed> getEmployeds() {
		return this.employeds;
	}

	public void setEmployeds(List<Employed> employeds) {
		this.employeds = employeds;
	}

	public Employed addEmployed(Employed employed) {
		getEmployeds().add(employed);
		employed.setSpecialty(this);

		return employed;
	}

	public Employed removeEmployed(Employed employed) {
		getEmployeds().remove(employed);
		employed.setSpecialty(null);

		return employed;
	}

}
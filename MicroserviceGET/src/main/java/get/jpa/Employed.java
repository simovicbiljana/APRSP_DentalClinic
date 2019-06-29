package get.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employed database table.
 * 
 */
@Entity
@NamedQuery(name="Employed.findAll", query="SELECT e FROM Employed e")
public class Employed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMPLOYED_EMPLOYEDID_GENERATOR", sequenceName="EMPLOYED_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYED_EMPLOYEDID_GENERATOR")
	private Integer employedid;

	private String adress;

	@Temporal(TemporalType.DATE)
	private Date dateofbirth;

	private String email;

	private String firstname;

	private String lastname;

	private String phone;

	//bi-directional many-to-one association to Specialty
	@ManyToOne
	@JoinColumn(name="specialtyid")
	private Specialty specialty;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="employed")
	@JsonIgnore
	private List<Performedservice> performedservices;

	public Employed() {
	}

	public Integer getEmployedid() {
		return this.employedid;
	}

	public void setEmployedid(Integer employedid) {
		this.employedid = employedid;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Specialty getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public List<Performedservice> getPerformedservices() {
		return this.performedservices;
	}

	public void setPerformedservices(List<Performedservice> performedservices) {
		this.performedservices = performedservices;
	}

	public Performedservice addPerformedservice(Performedservice performedservice) {
		getPerformedservices().add(performedservice);
		performedservice.setEmployed(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setEmployed(null);

		return performedservice;
	}

}
package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the workplace database table.
 * 
 */
@Entity
public class Workplace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="WORKPLACE_WORKPLACEID_GENERATOR", sequenceName="WORKPLACE_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="WORKPLACE_WORKPLACEID_GENERATOR")
	private Integer workplaceid;

	private String address;

	private String nameofworkplace;

	private String phone;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="workplace")
	@JsonIgnore
	private List<Performedservice> performedservices;

	public Workplace() {
	}

	public Integer getWorkplaceid() {
		return this.workplaceid;
	}

	public void setWorkplaceid(Integer workplaceid) {
		this.workplaceid = workplaceid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameofworkplace() {
		return this.nameofworkplace;
	}

	public void setNameofworkplace(String nameofworkplace) {
		this.nameofworkplace = nameofworkplace;
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
		performedservice.setWorkplace(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setWorkplace(null);

		return performedservice;
	}

}
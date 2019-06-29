package post.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the typeofservice database table.
 * 
 */
@Entity
@NamedQuery(name="Typeofservice.findAll", query="SELECT t FROM Typeofservice t")
public class Typeofservice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TYPEOFSERVICE_TYPEOFSERVICEID_GENERATOR", sequenceName="TYPE_OF_SERVICE_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TYPEOFSERVICE_TYPEOFSERVICEID_GENERATOR")
	private Integer typeofserviceid;

	private String nameoftypeservice;

	private BigDecimal price;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="typeofservice")
	@JsonIgnore
	private List<Performedservice> performedservices;

	public Typeofservice() {
	}

	public Integer getTypeofserviceid() {
		return this.typeofserviceid;
	}

	public void setTypeofserviceid(Integer typeofserviceid) {
		this.typeofserviceid = typeofserviceid;
	}

	public String getNameoftypeservice() {
		return this.nameoftypeservice;
	}

	public void setNameoftypeservice(String nameoftypeservice) {
		this.nameoftypeservice = nameoftypeservice;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Performedservice> getPerformedservices() {
		return this.performedservices;
	}

	public void setPerformedservices(List<Performedservice> performedservices) {
		this.performedservices = performedservices;
	}

	public Performedservice addPerformedservice(Performedservice performedservice) {
		getPerformedservices().add(performedservice);
		performedservice.setTypeofservice(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setTypeofservice(null);

		return performedservice;
	}

}
package post.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the material database table.
 * 
 */
@Entity
@NamedQuery(name="Material.findAll", query="SELECT m FROM Material m")
public class Material implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MATERIAL_MATERIALID_GENERATOR", sequenceName="MATERIAL_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATERIAL_MATERIALID_GENERATOR")
	private Integer materialid;

	private String manufacturedname;

	private String nameofmaterial;

	private BigDecimal quantity;

	//bi-directional many-to-one association to Performedservice
	@OneToMany(mappedBy="material")
	@JsonIgnore
	private List<Performedservice> performedservices;

	public Material() {
	}

	public Integer getMaterialid() {
		return this.materialid;
	}

	public void setMaterialid(Integer materialid) {
		this.materialid = materialid;
	}

	public String getManufacturedname() {
		return this.manufacturedname;
	}

	public void setManufacturedname(String manufacturedname) {
		this.manufacturedname = manufacturedname;
	}

	public String getNameofmaterial() {
		return this.nameofmaterial;
	}

	public void setNameofmaterial(String nameofmaterial) {
		this.nameofmaterial = nameofmaterial;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public List<Performedservice> getPerformedservices() {
		return this.performedservices;
	}

	public void setPerformedservices(List<Performedservice> performedservices) {
		this.performedservices = performedservices;
	}

	public Performedservice addPerformedservice(Performedservice performedservice) {
		getPerformedservices().add(performedservice);
		performedservice.setMaterial(this);

		return performedservice;
	}

	public Performedservice removePerformedservice(Performedservice performedservice) {
		getPerformedservices().remove(performedservice);
		performedservice.setMaterial(null);

		return performedservice;
	}

}
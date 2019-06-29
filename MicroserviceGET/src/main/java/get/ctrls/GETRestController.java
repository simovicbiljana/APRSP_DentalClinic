package get.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import get.jpa.Diagnosis;
import get.jpa.Employed;
import get.jpa.Material;
import get.jpa.Patient;
import get.jpa.Performedservice;
import get.jpa.Specialty;
import get.jpa.Tooth;
import get.jpa.Toothstatus;
import get.jpa.Typeofservice;
import get.jpa.Workplace;
import get.reps.DiagnosisRepository;
import get.reps.EmployedRepository;
import get.reps.MaterialRepository;
import get.reps.PatientRepository;
import get.reps.PerformedserviceRepository;
import get.reps.SpecialtyRepository;
import get.reps.ToothRepository;
import get.reps.ToothstatusRepository;
import get.reps.TypeofserviceRepository;
import get.reps.WorkplaceRepository;

@RestController
public class GETRestController {

	@Autowired
	private DiagnosisRepository diagnosisRepository;

	@Autowired
	private EmployedRepository employedRepository;

	@Autowired
	private MaterialRepository materialRepository;

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private PerformedserviceRepository performedServiceRepository;

	@Autowired
	private SpecialtyRepository specialtyRepository;

	@Autowired
	private ToothRepository toothRepository;

	@Autowired
	private ToothstatusRepository toothStatusRepository;

	@Autowired
	private TypeofserviceRepository typeOfServiceRepository;

	@Autowired
	private WorkplaceRepository workplaceRepository;

	// Diagnosis //


	@GetMapping("diagnosis")
	public Collection<Diagnosis> getDiagnosis() {
		return diagnosisRepository.findAll();
	}


	// prosledjena kao path varijabla
	@GetMapping("diagnosis/{id}")
	public ResponseEntity <Diagnosis> getDiagnosis(@PathVariable("id") Integer id) {
		Diagnosis diagnosis = diagnosisRepository.getOne(id);
		return new ResponseEntity<Diagnosis>(diagnosis, HttpStatus.OK);
	}

	// Employed //


	@GetMapping("employed")
	public Collection <Employed> getEmployes() {
		return employedRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("employed/{id}")
	public ResponseEntity<Employed> getEmployed(@PathVariable("id") Integer id) {
		Employed employed = employedRepository.getOne(id);
		return new ResponseEntity<Employed>(employed, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("employedlastname/{employedlastname}")
	public Collection<Employed> getEmployedByLastname(@PathVariable("employedlastname") String employedlastname) {
		return employedRepository.findByLastnameContainingIgnoreCase(employedlastname);
	}

	// Material //


	@GetMapping("material")
	public Collection <Material> getMaterials() {
		return materialRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("material/{id}")
	public ResponseEntity<Material> getMaterial(@PathVariable("id") Integer id) {
		Material material = materialRepository.getOne(id);
		return new ResponseEntity<Material>(material, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("nameofmaterial/{nameofmaterial}")
	public Collection<Material> getMaterialByNameofmaterial(@PathVariable("nameofmaterial") String nameofmaterial) {
		return materialRepository.findByNameofmaterialContainingIgnoreCase(nameofmaterial);
	}

	// Patient //


	@GetMapping("patient")
	public Collection <Patient> getPatients() {
		return patientRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("patient/{id}")
	public ResponseEntity<Patient> getPatient(@PathVariable("id") Integer id) {
		Patient patient = patientRepository.getOne(id);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("lastname/{lastname}")
	public Collection<Patient> getPatientByLastname(@PathVariable("lastname") String lastname) {
		return patientRepository.findByLastnameContainingIgnoreCase (lastname);
	}

	// PerformedService //


	@GetMapping("performedservice")
	public Collection<Performedservice> getPerformedservices() {
		return performedServiceRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("performedservice/{id}")
	public ResponseEntity<Performedservice> getPerformedservice(@PathVariable("id") Integer id) {
		Performedservice performedservice = performedServiceRepository.getOne(id);
		return new ResponseEntity<Performedservice>(performedservice, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("performedservice/{performedservice}")
	public Collection<Performedservice> getPaidPerformedservice(@PathVariable("performedservice") String performedservice) {
		if (performedservice.toLowerCase().equals("true") || performedservice.toLowerCase().equals("false"))
			return performedServiceRepository.findByPaid(Boolean.parseBoolean(performedservice));
		else if (performedservice.equals("null"))
			return performedServiceRepository.findByPaidNull();
		else
			return null;
	}

	// Specialty //


	@GetMapping("specialty")
	public Collection <Specialty> getSpecialties() {
		return specialtyRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("specialty/{id}")
	public ResponseEntity<Specialty> getSpecialty(@PathVariable("id") Integer id) {
		Specialty specialty = specialtyRepository.getOne(id);
		return new ResponseEntity<Specialty>(specialty, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("academictitle/{academictitle}")
	public Collection<Specialty> getSpecialtyByAcademictitle(@PathVariable("academictitle") String academictitle) {
		return specialtyRepository.findByAcademictitleContainingIgnoreCase (academictitle);
	}

	// Tooth //


	@GetMapping("tooth")
	public Collection<Tooth> getTeeth() {
		return toothRepository.findAll();
	}


	// prosledjena kao path varijabla
	@GetMapping("tooth/{id}")
	public ResponseEntity <Tooth> getTooth(@PathVariable("id") Integer id) {
		Tooth tooth = toothRepository.getOne(id);
		return new ResponseEntity<Tooth>(tooth, HttpStatus.OK);
	}

	// ToothStatus //


	@GetMapping("toothstatus")
	public Collection<Toothstatus> getTeethStatus() {
		return toothStatusRepository.findAll();
	}


	// prosledjena kao path varijabla
	@GetMapping("toothstatus/{id}")
	public ResponseEntity <Toothstatus> getToothstatus(@PathVariable("id") Integer id) {
		Toothstatus toothstatus = toothStatusRepository.getOne(id);
		return new ResponseEntity<Toothstatus>(toothstatus, HttpStatus.OK);
	}


	// TypeOfService //


	@GetMapping("typeofservice")
	public Collection<Typeofservice> getTypeofservices() {
		return typeOfServiceRepository.findAll();
	}


	// prosledjena kao path varijabla
	@GetMapping("typeofservice/{id}")
	public ResponseEntity <Typeofservice> getTypeofservice(@PathVariable("id") Integer id) {
		Typeofservice typeofservice = typeOfServiceRepository.getOne(id);
		return new ResponseEntity<Typeofservice>(typeofservice, HttpStatus.OK);
	}
	
	// Workplace //


	@GetMapping("workplace")
	public Collection <Workplace> getWorkplaces() {
		return workplaceRepository.findAll();
	}


	// vrednost prosledjena kao path varijabla
	@GetMapping("workplace/{id}")
	public ResponseEntity<Workplace> getWorkplace(@PathVariable("id") Integer id) {
		Workplace workplace = workplaceRepository.getOne(id);
		return new ResponseEntity<Workplace>(workplace, HttpStatus.OK);
	}


	// prosledjena kao path varijabla
	@GetMapping("nameofworkplace/{nameofworkplace}")
	public Collection<Workplace> getWorkplaceByName(@PathVariable("nameofworkplace") String nameofworkplace) {
		return workplaceRepository.findByNameofworkplaceContainingIgnoreCase (nameofworkplace);
	}



}

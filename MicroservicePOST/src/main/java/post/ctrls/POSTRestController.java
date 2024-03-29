package post.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import post.jpa.Diagnosis;
import post.jpa.Employed;
import post.jpa.Material;
import post.jpa.Patient;
import post.jpa.Performedservice;
import post.jpa.Specialty;
import post.jpa.Tooth;
import post.jpa.Toothstatus;
import post.jpa.Typeofservice;
import post.jpa.Workplace;
import post.reps.DiagnosisRepository;
import post.reps.EmployedRepository;
import post.reps.MaterialRepository;
import post.reps.PatientRepository;
import post.reps.PerformedserviceRepository;
import post.reps.SpecialtyRepository;
import post.reps.ToothRepository;
import post.reps.ToothstatusRepository;
import post.reps.TypeofserviceRepository;
import post.reps.WorkplaceRepository;

@RestController
public class POSTRestController {

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

	@ApiOperation(value = "Unos nove dijanoze u bazu podataka")
	@PostMapping("diagnosis")
	public ResponseEntity<Diagnosis> insertDiagnosis(@RequestBody Diagnosis diagnosis) {
		if (diagnosisRepository.existsById(diagnosis.getDiagnosisid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		diagnosisRepository.save(diagnosis);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Employed //

	@ApiOperation(value = "Unos novog zaposlenog u bazu podataka")
	@PostMapping("employed")
	public ResponseEntity<Employed> insertEmployed(@RequestBody Employed employed) {
		if (employedRepository.existsById(employed.getEmployedid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		employedRepository.save(employed);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	// Material //

	@ApiOperation(value = "Unos novog materijala u bazu podataka")
	@PostMapping("material")
	public ResponseEntity<Material> insertMaterial(@RequestBody Material material) {
		if (materialRepository.existsById(material.getMaterialid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		materialRepository.save(material);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Patient //

	@ApiOperation(value = "Unos novog pacijenta u bazu podataka")
	@PostMapping("patient")
	public ResponseEntity<Patient> insertPatient(@RequestBody Patient patient) {
		if (patientRepository.existsById(patient.getPatientid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		patientRepository.save(patient);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Performedservice //

	@ApiOperation(value = "Unos nove izvrsene usluge u bazu podataka")
	@PostMapping("performedservice")
	public ResponseEntity<Performedservice> insertPerformedservice(@RequestBody Performedservice performedservice) {
		if (performedServiceRepository.existsById(performedservice.getPerformedserviceid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		performedServiceRepository.save(performedservice);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Specialty //

	@ApiOperation(value = "Unos nove specijalizacije u bazu podataka")
	@PostMapping("specialty")
	public ResponseEntity<Specialty> insertSpecialty(@RequestBody Specialty specialty) {
		if (specialtyRepository.existsById(specialty.getSpecialtyid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		specialtyRepository.save(specialty);
		return new ResponseEntity<>(HttpStatus.OK);
	}


	// Tooth //

	@ApiOperation(value = "Unos novog zuba u bazu podataka")
	@PostMapping("tooth")
	public ResponseEntity<Tooth> insertTooth(@RequestBody Tooth tooth) {
		if (toothRepository.existsById(tooth.getToothid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		toothRepository.save(tooth);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Toothstatus //

	@ApiOperation(value = "Unos novog statusa zuba u bazu podataka")
	@PostMapping("toothstatus")
	public ResponseEntity<Toothstatus> insertToothstatus(@RequestBody Toothstatus toothstatus) {
		if (toothStatusRepository.existsById(toothstatus.getToothstatusid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		toothStatusRepository.save(toothstatus);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Typeofservice //

	@ApiOperation(value = "Unos nove vrste usluge u bazu podataka")
	@PostMapping("typeofservice")
	public ResponseEntity<Typeofservice> insertTypeofservice(@RequestBody Typeofservice typeofservice) {
		if (typeOfServiceRepository.existsById(typeofservice.getTypeofserviceid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		typeOfServiceRepository.save(typeofservice);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Workplace //

	@ApiOperation(value = "Unos novog radnog mesta u bazu podataka")
	@PostMapping("workplace")
	public ResponseEntity<Workplace> insertWorkplace(@RequestBody Workplace workplace) {
		if (workplaceRepository.existsById(workplace.getWorkplaceid()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		workplaceRepository.save(workplace);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

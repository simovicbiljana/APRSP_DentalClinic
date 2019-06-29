package put.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import put.jpa.Tooth;
import put.jpa.Toothstatus;
import put.jpa.Typeofservice;
import put.jpa.Workplace;
import put.jpa.Specialty;
import put.jpa.Performedservice;
import put.jpa.Patient;
import put.jpa.Material;
import put.jpa.Employed;
import put.jpa.Diagnosis;
import put.reps.DiagnosisRepository;
import put.reps.EmployedRepository;
import put.reps.MaterialRepository;
import put.reps.PatientRepository;
import put.reps.PerformedserviceRepository;
import put.reps.SpecialtyRepository;
import put.reps.ToothRepository;
import put.reps.ToothstatusRepository;
import put.reps.TypeofserviceRepository;
import put.reps.WorkplaceRepository;

@RestController
public class PUTRestController {

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


	@PutMapping("diagnosis")
	public ResponseEntity<Diagnosis> updateDiagnosis(@RequestBody Diagnosis diagnosis) {
		if (!diagnosisRepository.existsById(diagnosis.getDiagnosisid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		diagnosisRepository.save(diagnosis);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Employed //


	@PutMapping("employed")
	public ResponseEntity<Employed> updateEmployed(@RequestBody Employed employed) {
		if (!employedRepository.existsById(employed.getEmployedid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		employedRepository.save(employed);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Material //


	@PutMapping("material")
	public ResponseEntity<Material> updateMaterial(@RequestBody Material material) {
		if (!materialRepository.existsById(material.getMaterialid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		materialRepository.save(material);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Patient //


	@PutMapping("patient")
	public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient) {
		if (!patientRepository.existsById(patient.getPatientid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		patientRepository.save(patient);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Performedservice //


	@PutMapping("performedservice")
	public ResponseEntity<Performedservice> updatePerformedservice(@RequestBody Performedservice performedservice) {
		if (!performedServiceRepository.existsById(performedservice.getPerformedserviceid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		performedServiceRepository.save(performedservice);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Specialty //


	@PutMapping("specialty")
	public ResponseEntity<Specialty> updateSpecialty(@RequestBody Specialty specialty) {
		if (!specialtyRepository.existsById(specialty.getSpecialtyid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		specialtyRepository.save(specialty);
		return new ResponseEntity<>(HttpStatus.OK);
	}


	// Tooth //


	@PutMapping("tooth")
	public ResponseEntity<Tooth> updateTooth(@RequestBody Tooth tooth) {
		if (!toothRepository.existsById(tooth.getToothid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		toothRepository.save(tooth);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Toothstatus //


	@PutMapping("toothstatus")
	public ResponseEntity<Toothstatus> updateToothstatus(@RequestBody Toothstatus toothstatus) {
		if (!toothStatusRepository.existsById(toothstatus.getToothstatusid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		toothStatusRepository.save(toothstatus);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Typeofservice //


	@PutMapping("typeofservice")
	public ResponseEntity<Typeofservice> updateTypeofservice(@RequestBody Typeofservice typeofservice) {
		if (!typeOfServiceRepository.existsById(typeofservice.getTypeofserviceid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		typeOfServiceRepository.save(typeofservice);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Workplace //


	@PutMapping("workplace")
	public ResponseEntity<Workplace> updateWorkplace(@RequestBody Workplace workplace) {
		if (!workplaceRepository.existsById(workplace.getWorkplaceid()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		workplaceRepository.save(workplace);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

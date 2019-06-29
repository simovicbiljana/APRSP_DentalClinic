package delete.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import delete.reps.DiagnosisRepository;
import delete.reps.EmployedRepository;
import delete.reps.MaterialRepository;
import delete.reps.PatientRepository;
import delete.reps.PerformedserviceRepository;
import delete.reps.SpecialtyRepository;
import delete.reps.ToothRepository;
import delete.reps.ToothstatusRepository;
import delete.reps.TypeofserviceRepository;
import delete.reps.WorkplaceRepository;
import delete.jpa.Performedservice;
import delete.jpa.Specialty;
import delete.jpa.Tooth;
import delete.jpa.Toothstatus;
import delete.jpa.Typeofservice;
import delete.jpa.Workplace;
import delete.jpa.Patient;
import delete.jpa.Material;
import delete.jpa.Employed;
import delete.jpa.Diagnosis;

@RestController
public class DELETERestController {

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


	@DeleteMapping("diagnosis/{id}")
	public ResponseEntity<Diagnosis> deleteDiagnosis(@PathVariable("id") Integer id) {
		if (!diagnosisRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		diagnosisRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Employed //


	@DeleteMapping("employed/{id}")
	public ResponseEntity<Employed> deleteEmployed(@PathVariable("id") Integer id) {
		if (!employedRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		employedRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Material //


	@DeleteMapping("material/{id}")
	public ResponseEntity<Material> deleteMaterial(@PathVariable("id") Integer id) {
		if (!materialRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		materialRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Patient //


	@DeleteMapping("patient/{id}")
	public ResponseEntity<Patient> deletePatient(@PathVariable("id") Integer id) {
		if (!patientRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		patientRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Performedservice //


	@DeleteMapping("performedservice/{id}")
	public ResponseEntity<Performedservice> deletePerformedservice(@PathVariable("id") Integer id) {
		if (!performedServiceRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		performedServiceRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Specialty //


	@DeleteMapping("specialty/{id}")
	public ResponseEntity<Specialty> deleteSpecialty(@PathVariable("id") Integer id) {
		if (!specialtyRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		specialtyRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}


	// Tooth //


	@DeleteMapping("tooth/{id}")
	public ResponseEntity<Tooth> deleteTooth(@PathVariable("id") Integer id) {
		if (!toothRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		toothRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Toothstatus //


	@DeleteMapping("toothstatus/{id}")
	public ResponseEntity<Toothstatus> deleteToothstatus(@PathVariable("id") Integer id) {
		if (!toothStatusRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		toothStatusRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Typeofservice //


	@DeleteMapping("typeofservice/{id}")
	public ResponseEntity<Typeofservice> deleteTypeofservice(@PathVariable("id") Integer id) {
		if (!typeOfServiceRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		typeOfServiceRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// Workplace //


	@DeleteMapping("workplace/{id}")
	public ResponseEntity<Workplace> deleteWorkplace(@PathVariable("id") Integer id) {
		if (!workplaceRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		workplaceRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

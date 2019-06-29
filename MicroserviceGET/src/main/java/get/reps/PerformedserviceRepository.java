package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Performedservice;

public interface PerformedserviceRepository extends JpaRepository <Performedservice, Integer>{
	Collection<Performedservice> findByPaid (Boolean performedservice);
	Collection<Performedservice> findByPaidNull();
}

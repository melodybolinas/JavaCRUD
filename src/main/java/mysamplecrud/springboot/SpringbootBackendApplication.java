package mysamplecrud.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import mysamplecrud.springboot.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import mysamplecrud.springboot.model.Patient;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
        
        @Autowired
        private PatientsRepository patientRepository;
        
        @Override
        public void run(String... args) throws Exception {
            Patient patient = new Patient();
            patient.setFirstName("Melody");
            patient.setLastName("Bolinas");
            patient.setEmailId("melodybolinas");
            patientRepository.save(patient);
            
            Patient patient2 = new Patient();
            patient2.setFirstName("Iron");
            patient2.setLastName("Man");
            patient2.setEmailId("ironman");
            patientRepository.save(patient2);
        }

}

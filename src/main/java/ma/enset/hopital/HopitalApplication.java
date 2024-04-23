package ma.enset.hopital;

import ma.enset.hopital.entities.patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Creation avec cons sans param
        /*Patient patient=new Patient();
        patient.setId(null);
        patient.setNom("Mohammed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);*/
        // Creation avec cons avec param
        //Patient patient2=new Patient(null,"Yassine",new Date(),false,123);
        // Creation avec builder
        /*Patient patient3=Patient.builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build();*/
        patientRepository.save(new patient(null,"Imane",new Date(),true,12));
        patientRepository.save(new patient(null,"Yassine",new Date(),false,13));
        patientRepository.save(new patient(null,"Mohamed",new Date(),false,123));

    }
}
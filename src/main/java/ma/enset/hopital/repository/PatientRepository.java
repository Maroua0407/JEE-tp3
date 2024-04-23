package ma.enset.hopital.repository;

import ma.enset.hopital.entities.patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRepository extends JpaRepository<patient,Long> {

    Page<patient> findByNomContains(String keyword, Pageable pageable);


    //@Query("select p from Patient p where p.nom like: x")
    //Page<Patient> Chercher(@Param("x") String keyword ,Pageable pageable1);
}
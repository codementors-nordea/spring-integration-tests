package pl.codementors.integrationtests._4_exercise.names;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.*;

public interface NameDayRepository extends JpaRepository<NameDay, Long> {

    Optional<NameDay> findOneByDate(LocalDate date);
}

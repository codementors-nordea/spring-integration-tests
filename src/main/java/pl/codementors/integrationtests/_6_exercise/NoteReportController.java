package pl.codementors.integrationtests._6_exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.codementors.integrationtests._6_exercise.notes.domain.NoteReport;
import pl.codementors.integrationtests._6_exercise.notes.domain.NoteReportRepository;

import java.util.List;

@RestController
public class NoteReportController {

    private final NoteReportRepository noteReportRepository;

    public NoteReportController(NoteReportRepository noteReportRepository) {
        this.noteReportRepository = noteReportRepository;
    }

    @GetMapping("/reports/note")
    public List<NoteReport> generateReport() {
        return noteReportRepository.generateReport();
    }
}

package pl.codementors.integrationtests._6_exercise.notes;

import org.springframework.stereotype.Component;
import pl.codementors.integrationtests._6_exercise.EntityNotFoundException;
import pl.codementors.integrationtests._6_exercise.notes.domain.Note;
import pl.codementors.integrationtests._6_exercise.notes.domain.NoteRepository;

import java.util.List;
import java.util.Objects;

@Component
public class NoteFetchService {

    private final NoteRepository noteRepository;

    public NoteFetchService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> fetchNotes(List<String> tags) {
        if (Objects.isNull(tags) || tags.isEmpty()) {
            return noteRepository.findAll();
        }

        return noteRepository.findAllByTags(tags);

    }

    public Note fetch(Integer id) {
        return noteRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}

package pl.codementors.integrationtests._6_exercise.comments;

import org.springframework.stereotype.Component;
import pl.codementors.integrationtests._6_exercise.comments.domain.Comment;
import pl.codementors.integrationtests._6_exercise.comments.domain.CommentRepository;
import pl.codementors.integrationtests._6_exercise.notes.domain.NoteRepository;
import pl.codementors.integrationtests._6_exercise.EntityNotFoundException;

import java.util.List;

@Component
public class CommentFetchService {

    private final NoteRepository noteRepository;
    private final CommentRepository commentRepository;

    public CommentFetchService(NoteRepository noteRepository, CommentRepository commentRepository) {
        this.noteRepository = noteRepository;
        this.commentRepository = commentRepository;
    }

    public List<Comment> fetchComments(Integer noteId) {
        return noteRepository.findById(noteId)
                .map(commentRepository::findAllByNote)
                .orElseThrow(EntityNotFoundException::new);
    }

}

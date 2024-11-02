package Service;

import Culturoteca.exception.VideoNotFoundException;
import Culturoteca.model.Video;
import Culturoteca.model.View;

import java.util.List;

public interface CultureMediaService {
    List<Video> findAll() throws VideoNotFoundException;
    View save(View view);
    Video save(Video video);
    List<Video> findByTitle(String title) throws VideoNotFoundException;
    List<Video> findByDuration(Double fromDuration, Double toDuration) throws VideoNotFoundException;
}

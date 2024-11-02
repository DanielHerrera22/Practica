package Service;

import Culturoteca.model.Video;
import Culturoteca.model.View;

import java.util.List;

public interface CultureMediaService {
    List<Video> findAll();
    View save(View view);
    Video save(Video video);
}

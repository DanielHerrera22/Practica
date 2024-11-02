package Culturoteca.repository;

import Culturoteca.exception.VideoNotFoundException;
import Culturoteca.model.Video;

import java.util.List;

public interface VideoRepository {
    List<Video> findAll() throws VideoNotFoundException;
    Video save(Video video);
    List<Video> findByTitle(String title);
    List<Video> findByDuration(Double fromDuration, Double toDuration);
}

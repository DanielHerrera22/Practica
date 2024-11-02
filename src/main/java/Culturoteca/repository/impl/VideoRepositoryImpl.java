package Culturoteca.repository.impl;

import java.util.ArrayList;
import java.util.List;

import Culturoteca.exception.VideoNotFoundException;
import Culturoteca.model.Video;
import Culturoteca.repository.VideoRepository;

public class VideoRepositoryImpl implements VideoRepository {

    private final List<Video> videos;

    public VideoRepositoryImpl() {
        videos = new ArrayList<>();
    }

    @Override
    public List<Video> findAll() throws VideoNotFoundException {
        if (videos.isEmpty()) {
            throw new VideoNotFoundException();
        }
        return videos;
    }


    @Override
    public Video save(Video video) {
        this.videos.add( video );
        return video;
    }

    @Override
    public List<Video> findByTitle(String title) {
        List<Video> filteredVideos = new ArrayList<>();
        for (Video video : videos) {
            if (video.title().contains(title)) {  // Cambiado a contains en lugar de equals
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }



    @Override
    public List<Video> findByDuration(Double fromDuration, Double toDuration) {
        List<Video> filteredVideos = new ArrayList<Video>();
        for ( Video video : videos ) {
            if(video.duration()> fromDuration && video.duration()< toDuration){
                filteredVideos.add(video);
            }
        }
        return filteredVideos;
    }
}

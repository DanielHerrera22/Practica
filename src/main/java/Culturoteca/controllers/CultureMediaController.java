package Culturoteca.controllers;

import java.util.*;

import Culturoteca.exception.VideoNotFoundException;
import Culturoteca.model.Video;
import Culturoteca.service.impl.CultureMediaServiceImpl;

public class CultureMediaController {

    private final CultureMediaServiceImpl cultureMediaService;


    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }


    public List<Video> find_allVideos() throws VideoNotFoundException {
        List<Video> videos = null;
        videos = cultureMediaService.findAll();
        return videos;
    }


}

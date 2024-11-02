package Culturoteca.controllers;

import java.util.List;

import Culturoteca.exception.VideoNotFoundException;
import Culturoteca.model.Video;
import Service.impl.CultureMediaServiceImpl;
import Service.CultureMediaService;

public class CultureMediaController {
    private final CultureMediaService cultureMediaService;

    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    public List<Video> findAllVideos() throws VideoNotFoundException {
        return cultureMediaService.findAll();
    }
}

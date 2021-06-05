package com.ywn.task;

import org.springframework.stereotype.Service;

@Service
public class Mp4Impl implements Strategy {

    @Override
    public String play(String file) {
        if (file.contains(".mp4")) {
            return "Playing " + file +" file (libraryB)";
        }

        return "Not supported type";
    }

}

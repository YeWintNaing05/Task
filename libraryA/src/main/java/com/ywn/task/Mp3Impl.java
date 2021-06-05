package com.ywn.task;

import org.springframework.stereotype.Service;

@Service
public class Mp3Impl implements Strategy {

    @Override
    public String play(String file) {

        if (file.contains(".mp3")) {
            return "Playing" + file +" file (libraryA)";
        }

        return "Not supported type";

    }

}

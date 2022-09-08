package org.example.utils.abstracts;

import lombok.extern.java.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Log
public abstract class Report {
    protected void create(String content, String filename) {
        try {
            File file = new File("reports/" + filename);
            OutputStream output = new FileOutputStream(file);
            output.write(content.getBytes());
            output.close();
            log.info("\u001B[32m Successful \u001B[0m");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract String generate();
}

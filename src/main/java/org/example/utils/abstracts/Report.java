package org.example.utils.abstracts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class Report {
     protected void create(String content, String filename) {
          try {
               File file = new File("reports/"+filename);
               OutputStream output = new FileOutputStream(file);
               output.write(content.getBytes());
               output.close();
          } catch (IOException e) {
               throw new RuntimeException(e);
          }
     }

     public abstract String generate();
}

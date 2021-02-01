package com.chiennd.model;

import com.chiennd.repo.IFile;

public class Gif implements IFile{
  public static final String EXTENSION = "gif";
  private String fileOpenned;

  public void openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  open " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void parseFile() {
    System.out.println(EXTENSION + ": read");
  }

  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  persist");
    } else {
      System.out.println("Nothing to save");
    }
  }
}

package graphiceditor.after;

public class Png implements IFile{
  public static final String EXTENSION = "png";
  private String fileOpenned;

  public void openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  get " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void parseFile() {
    System.out.println(EXTENSION + ": read");
  }

  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }
  }

}

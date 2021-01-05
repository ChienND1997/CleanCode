package graphiceditor.after;

public class Jpg implements IFile{
  public static final String EXTENSION = "jpg";
  private String fileOpenned;

  public void openFile(String fileName) {
    fileOpenned = fileName;
    System.out.println(EXTENSION + ":  openF " + fileName);
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public void parseFile() {
    System.out.println(EXTENSION + ": readF");
  }

  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  saveF");
    } else {
      System.out.println("Nothing to save");
    }
  }
}

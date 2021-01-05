package graphiceditor.after;

public interface IFile {
    void openFile(String fileName);
    void parseFile();
    void saveFile();
    String getFileOpenned();
}

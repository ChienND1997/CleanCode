package com.chiennd.repo;

public interface IFile {
	void openFile(String fileName);
    void parseFile();
    void saveFile();
    String getFileOpenned();
}

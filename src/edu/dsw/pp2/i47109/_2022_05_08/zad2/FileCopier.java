package edu.dsw.pp2.i47109._2022_05_08.zad2;

import edu.dsw.pp2.i47109._2022_05_08.helpers.InputReader;

import java.io.*;

/**
 *
 * Kopiowanie pliku przy uzyciu pakietu java.io
 * Kopie plikow zostna zapisane w folderze './files' z rozszerzona koncowka '.copy'.
 *
 */


public class FileCopier {
    private void copyFile(String originalFilePath) {
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream(originalFilePath));
            File originalFile = new File(originalFilePath);
            String copyFileName = this.getCopyFileName(originalFile.getName());
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("./files/" + copyFileName));
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lengthRead);
                outputStream.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getCopyFileName(String originalName) {
        int extensionIndex = originalName.lastIndexOf('.');
        return originalName.substring(0, extensionIndex) + ".copy" + originalName.substring(extensionIndex);
    }

    public void makeCopy() {
        String filePath = new InputReader().getInputValue("Type path to a file which you wish to copy >>\nExample: ./files/loremIpsum.txt");
        this.copyFile(filePath);
        System.out.println("Copy successful. Files saved into 'files' directory.");
    }
}

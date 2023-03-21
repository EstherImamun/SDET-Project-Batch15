package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class classTask {
    public static void main(String[] args) throws IOException {
        // path where we want to create a new file and the name of the file with its extension
        String path="Files/classTest.properties";
        //we use FileOutputStream when we have to write the data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        // we use the setProperty method to store data inside a properties files
        properties.setProperty("Name","Esther");
        properties.setProperty("Age","30");
        // A method to write the data to the disk
        properties.store(fileOutputStream,"a new file with name and age has been added");
    }
}

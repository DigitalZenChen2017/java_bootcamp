import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch15IOFunApp {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("/Users/Edna/Documents/test.txt");
		Files.createFile(filePath);
	}

}

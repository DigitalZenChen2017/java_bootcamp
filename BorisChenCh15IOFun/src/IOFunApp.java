import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOFunApp {

	public static void main(String[] args) throws IOException {
		// create folder if file doesn't exists
		String directory = "/Users/Edna/Documents/bootcamp/files2"; // create String variable with path name
		Path directoryPath = Paths.get(directory);
		if(Files.notExists(directoryPath)) {
			   Files.createDirectories(directoryPath);
			}
		
		// create file object
		String products = "products.txt";
		Path productsPath = Paths.get("products.txt");
		if(Files.notExists(productsPath)) {
			   Files.createFile(productsPath);
			}
		
		// write to file
		File productsFile = productsPath.toFile();
		
		// open an output stream
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		
		
		
		// write data to the stream
		out.println("java\tMurach's Java Programming\t57.50");
		
//		// close the output stream and free system resources
//		out.close();
	}

}

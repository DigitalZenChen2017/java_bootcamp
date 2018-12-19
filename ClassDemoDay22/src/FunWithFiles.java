import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

import business.Stuffie;

public class FunWithFiles {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello");
		// create a folder on C:\ if it doesn't exist
		String dirString = "/Users/Edna/Documents/bootcamp/files"; // sets String variable to reference an absolute path 
		Path dirPath = Paths.get(dirString);
		if(Files.notExists(dirPath)) {
		   Files.createDirectories(dirPath);
		}
		
		// create a file in this new folder
		String fileString = "stuffies.txt";
		Path filePath = Paths.get(dirString, fileString);
		if(Files.notExists(filePath)) {
			   Files.createFile(filePath);
			}
		
		// display the folder structure
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: " + dirPath.toAbsolutePath());
			System.out.println("Files: ");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p : dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("\t" + p.getFileName());
				}
				else if (Files.isDirectory(p))
			System.out.println(p.getName(0));
				
			}
			
		}
		
		// Write to the file
		File stuffiesFile = filePath.toFile();
//		// open an output stream
//		PrintWriter out =   new PrintWriter(
//							new BufferedWriter(
//							new FileWriter(stuffiesFile)));
//		// write data (records with element) to the stream
//		out.println("1\tBear\tLarge\tRed");
//		out.println("2\tCat\tSmall\tBlue");
//		out.println("3\tDog\tLarge\tYellow");
//		
//		out.close();
		
		// Read File
		/// open an input stream
		BufferedReader in = new BufferedReader(
							new FileReader(stuffiesFile));
		
		String line = in.readLine();
		ArrayList<Stuffie> stuffies = new ArrayList<>();
		
		while(line != null) {
			String[] fields = line.split("\t");
			int id = Integer.parseInt(fields[0]);
			String type = fields[1];
			String size = fields[2];
			String color = fields[3];
			
			Stuffie s = new Stuffie(id, type, size, color);
			stuffies.add(s);
			line = in.readLine();
		}
		
		in.close();
		
		//display list of stuffies to screen
		for(Stuffie s : stuffies) {
			System.out.println(s);
		}
		
		// close input stream and free system resources
		in.close();
		
		
		
		System.out.println("Goodbye :)");
	}

}

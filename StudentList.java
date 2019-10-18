import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
<<<<<<<HEAD
		if (args[0].equals("a")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader StreamReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt")));
				String FileReader = StreamReader.readLine();
				String FileStreamReader[] = FileReader.split(",");
				for (String StreamReader : FileStreamReader) {
					System.out.println(StreamReader);
				}
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		} else if (args[0].equals("r"))
=======
		if (args == null || args.length != 1) {
			System.out.println("Please enter arg");
			return;
		}
		if (args[0].equals("a")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader StreamReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt")));
				String FileReader = StreamReader.readLine();
				String FileStreamReader[] = FileReader.split(",");
				for (String StreamReader : FileStreamReader) {
					System.out.println(StreamReader);
				}
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		} else if (args[0].equals("r"))
>>>>>>>STEP - 2
		{
			System.out.println("Loading data ...");
			try {
				BufferedReader StreamReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt")));
				String FileReader = StreamReader.readLine();
				String FileStreamReader[] = FileReader.split(",");
				Random x = new Random();
				int y = x.nextInt(FileStreamReader.length);
				System.out.println(FileStreamReader[y]);
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		}
		else if (args[0].contains("+")) {
			System.out.println("Loading data ...");
			try {
				BufferedWriter StreamReader = new BufferedWriter(
						new FileWriter("students.txt", true));
				String t = args[0].substring(1);
				Date d = new Date();
				String df = "dd/mm/yyyy-hh:mm:ss a";
				DateFormat dateFormat = new SimpleDateFormat(df);
				String fd = dateFormat.format(d);
				StreamReader.write(", " + t + "\nList last updated on " + fd);
				StreamReader.close();
			} catch (Exception e) {
			}

			System.out.println("Data Loaded.");
		} else if (args[0].contains("?")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader StreamReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt")));
				String FileReader = StreamReader.readLine();
				String FileStreamReader[] = FileReader.split(",");
				boolean submit = false;
				String t = args[0].substring(1);
				for (int FileStreamReaderdx = 0; idx < FileStreamReader.length && !submit; idx++) {
					if (FileStreamReader[FileStreamReaderdx].equals(t)) {
						System.out.println("We found it!");
						submit = true;
					}
				}
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		} else if (args[0].contains("c")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader StreamReader = new BufferedReader(
						new InputStreamReader(
								new FileInputStream("students.txt")));
				String D = StreamReader.readLine();
				char a[] = D.toCharArray();
				boolean in_word = false;
				int count = 0;
				for (char c : a) {
					if (c == ' ') {
						if (!in_word) {
							count++;
							in_word = true;
						} else {
							in_word = false;
						}
					}
				}
				System.out.println(count + " word(s) found " + a.length);
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		}
	}
}
 
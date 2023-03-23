package FileProcessing;
import java.io.*;

public class FileProcessing {
	private String file;
	static String[] roles;
	static int count;
	private String Target;
	
	public FileProcessing(String File, String Target) {
		this.setFile(File);
		this.setTarget(Target);
	}

	public static boolean Checkfile(String file, String Target) throws FileNotFoundException {
		try (BufferedReader fileread = new BufferedReader(new FileReader(file))) {
			try {
				while((file = fileread.readLine()) != null) {
					roles = file.split(";");
					for(count = 0; count < roles.length; count++) {
						if(roles[count].equals(Target)) {
							return true;
						}
						count = count+1;
					}
				}
			}
				catch (IOException e) {
					e.printStackTrace();
				}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return false;
		}
	
		public String toString(String first, String Surname) {
			try {
			      File employees= new File("Names.txt");
			      if (employees.createNewFile()) {
			        System.out.println("File created: " + employees.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
				try {
					FileWriter files = new FileWriter("Names.txt");
					files.write("\n"+first+" "+Surname);
					files.close();
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			return(first+" "+ Surname);
		}

		public String getTarget() {
			return Target;
		}
	
		public void setTarget(String target) {
			Target = target;
		}

		public String getFile() {
			return file;
		}

		public void setFile(String file) {
			this.file = file;
		}
	}

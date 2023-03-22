package assignmentcode;

import java.io.*;

public class Control {
	

	public static void main(String[] args) throws FileNotFoundException {
		Naive data =  new Naive("C:/Users/ryanm/Desktop/Code/RyansJava/Assignment/src/assignmentcode/MLdata.csv");
				//GUIcontrol screen = new GUIcontrol();
				//screen.GUI();
		data.runGeneralNaive();

	}
}


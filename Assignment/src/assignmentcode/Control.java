package assignmentcode;

import java.io.FileNotFoundException;

public class Control {
	

	public static void main(String[] args) throws FileNotFoundException {
		Naive data =  new Naive("C:/Users/ryanm/Desktop/Java/RyansJava/Assignment/src/assignmentcode/MLdata.csv");
				//GUIcontrol screen = new GUIcontrol();
				//screen.GUI();
		data.runGeneralNaive();

	}
}


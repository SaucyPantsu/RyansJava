package assignmentcode;

import java.io.*;
import java.math.*;

public class Naive {
	//dataset location
	//needed 3 times to allow self test to run everything it needs to correctly
	String dataset;
	String dataset2;
	String dataset3;
	String dataset4;
	String[] column;
	String[] column2;
	String[] column3;
	
	
	int TestSize;
	int TrainSize;
	//total number of subjects
	int linecount;
	double ifEntrepreneur;
	double probEnt;
	double evidence;
	//general stats
	double ggender, gParent, gjob, gArea, gbusinessStudies, gentrepreneur;
	
	//general probabilities
	double gpgender, gpParent, gpjob, gpArea, gpbusinessStudies, gpentrepreneur;

	double extgender, extParent, extJob, extArea, extBusiness;
	
	// setting up for probability of entrepreneur calculations
	int Egender; // 0 female, 1 male
	int EParent; //1 for parent having business, 0 for no
	int ejob;// 1 for job, 0 for no
	int EArea; //1 for rural, 0 for urban
	int EbusinessStudies; // 1 for yes, 0 for no
	int Eentrepreneur; //1 for yes, 0 for no
	
	//non entrepreneur data stats
	int gender, Parent, job, Area, businessStudies, Nentrepreneur;
	
	//entrepreneur probabilities (ep prefix)
	double epgender, epParent, epJob, epArea, epbusinessStudies, epentrepreneur;
	
	//regular probabilities (rp prefix)
	double rpgender, rpParent, rpJob, rpArea, rpbusinessStudies, rpentrepreneur;

	double results;
	double probext;
	double test;
	double notEntrepreneur;
	int count;
	int errorcount;
	boolean correctornot;
	int correctcount;
	double prob;
	double accuracy;
	double results2;
	
	
	//configuring naive to use default dataset or a custom one
	public Naive(String dataset) {
		this.dataset = dataset;
		this.dataset2 = dataset;
		this.dataset3 = dataset;
		this.dataset4 = dataset;
	}
	
	public double doMyMath() {
		//math block
		
		//collating general stats
				ggender = gender+Egender;
				gParent = Parent+EParent;
				gjob = ejob+ job;
				gArea = Area+EArea;
				gbusinessStudies = businessStudies+EbusinessStudies;
				
				//general probabilities
				gpgender = (double)ggender/linecount;
				gpParent = (double)gParent/linecount;
				gpjob = (double)gjob/linecount;
				gpArea =(double) gArea/linecount;
				gpbusinessStudies = (double)gbusinessStudies/linecount;
				gpentrepreneur = (double)Eentrepreneur/linecount;
				
				//obtaining entrepreneur probabilities
				epgender = (double)Egender/Eentrepreneur;
				epParent =(double) EParent/Eentrepreneur;
				epJob =(double) ejob/Eentrepreneur;
				epArea = (double)EArea/Eentrepreneur;
				epbusinessStudies =(double) EbusinessStudies/Eentrepreneur;
				
				//obtaining not entrepreneur probabilities
				rpgender = (double)gender/Nentrepreneur;
				rpParent = (double)Parent/Nentrepreneur;
				rpJob =(double) job/Nentrepreneur;
				rpArea =(double) Area/Nentrepreneur;
				rpbusinessStudies = (double)businessStudies/Nentrepreneur;
				
				//naive bayes calculation
				
				probEnt = (double)Eentrepreneur/linecount;
				notEntrepreneur = 1-probEnt;
				
				ifEntrepreneur = epgender*epParent*epJob*epbusinessStudies*epArea*probEnt;
				test = rpgender*rpParent*rpJob*rpArea*rpbusinessStudies*notEntrepreneur;
				return ifEntrepreneur;
				//
	}

	public double runGeneralNaive() throws FileNotFoundException {
		//file reader
		reset();
		BufferedReader fileread = new BufferedReader(new FileReader(dataset));
		try {
			while((dataset = fileread.readLine()) != null) {
				
				column = dataset.split(",");

				if(column[0].equals("Female") || column[0].equals("Male"))
				{
					linecount = linecount+1;
				}
				//if entrepreneur stats
					
				if(column[5].equals("Yes")) {
					Eentrepreneur = Eentrepreneur + 1;
					
					if(column[0].equals("Male")) {
						Egender = Egender+1;
					}
					
					if(column[1].equals("Yes")) {
						EParent = EParent +1;
					}
					
					if(column[2].equals("Yes")) {
						ejob = ejob +1;
					}
					
					if(column[3].equals("Rural")) {
						EArea = EArea +1;
					}
					
					if(column[4].equals("Yes")) {
						EbusinessStudies = EbusinessStudies +1;
					}
					
				}
				//Not entrepreneur stats
				else if(column[5].equals("No")) {
					Nentrepreneur = Nentrepreneur + 1;
					if(column[0].equals("Male")) {
						gender = gender+1;
					}
					
					if(column[1].equals("Yes")) {
						Parent = Parent +1;
					}
					
					if(column[2].equals("Yes")) {
						job = job +1;
					}
					
					if(column[3].equals("Rural")) {
						Area = Area +1;
					}
					
					if(column[4].equals("Yes")) {
						businessStudies = businessStudies +1;
					}
				}
			}
			fileread.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		results2 = doMyMath();
		return results2;
		//System.out.println(probEnt);
		//testing data
		
	}
	public boolean runTest(String Gender, String Parents, String Job, String Business, String Area ){
		//test new data against old
		probabilities(Gender, Parents, Job, Business, Area );

		if(probext<results2) {
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void reset() {
		//resets all values
		ggender = 0;
		gParent = 0;
		gjob = 0;
		gArea = 0;
		gbusinessStudies = 0;
		gpgender = 0;
		gpParent = 0;
		gpjob = 0;
		gpArea = 0;
		gpbusinessStudies = 0;
		gpentrepreneur = 0;
		epgender = 0;
		epParent = 0;
		epJob = 0;
		epArea =  0;
		epbusinessStudies = 0;
		rpgender = 0;
		rpParent = 0;
		rpJob = 0;
		rpArea = 0;
		rpbusinessStudies =  0;
		linecount= 0;
		Eentrepreneur = 0;
		Egender=0;
		EParent = 0;
		ejob = 0;
		EArea = 0;
		EbusinessStudies = 0;
		Nentrepreneur =0;
		gender =0;
		Parent =0;
		job = 0;
		Area =0;
		businessStudies =0;
	}
	public void SelfTest() throws FileNotFoundException{
		
		reset();
		//self tester
		BufferedReader fileread4 = new BufferedReader(new FileReader(dataset4));
		BufferedReader fileread2 = new BufferedReader(new FileReader(dataset2));
		BufferedReader fileread3 = new BufferedReader(new FileReader(dataset3));
		try {
			while((dataset = fileread4.readLine()) != null) {
				
				column = dataset.split(",");

				if(column[0].equals("Female") || column[0].equals("Male"))
				{
					linecount = linecount+1;	
				}
			}
			fileread4.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		TrainSize = (int) Math.floor(linecount*0.7);
		TestSize = linecount - TrainSize;
		

		try {
			count = 0;
			while((dataset2 = fileread2.readLine()) != null) {
				if(count < TrainSize) {
					column2 = dataset2.split(",");
					if(column2[0].equals("Female") || column2[0].equals("Male"))
					{
						if(column2[5].equals("Yes")) {
							Eentrepreneur = Eentrepreneur + 1;
							
							if(column2[0].equals("Male")) {
								Egender = Egender+1;
							}
							
							if(column2[1].equals("Yes")) {
								EParent = EParent +1;
							}
							
							if(column2[2].equals("Yes")) {
								ejob = ejob +1;
							}
							
							if(column2[3].equals("Rural")) {
								EArea = EArea +1;
							}
							
							if(column2[4].equals("Yes")) {
								EbusinessStudies = EbusinessStudies +1;
							}
							
						}
						//Not entrepreneur stats
						else if(column2[5].equals("No")) {
							Nentrepreneur = Nentrepreneur + 1;
							if(column2[0].equals("Male")) {
								gender = gender+1;
							}
							
							if(column2[1].equals("Yes")) {
								Parent = Parent +1;
							}
							
							if(column2[2].equals("Yes")) {
								job = job +1;
							}
							
							if(column2[3].equals("Rural")) {
								Area = Area +1;
							}
							
							if(column2[4].equals("Yes")) {
								businessStudies = businessStudies +1;
							}	
						}				
					}
					count++;
				}
				else {
					fileread2.readLine();
				}
			}
			fileread2.close();
			doMyMath();	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		count = 0;
		try {
				while((dataset3 = fileread3.readLine()) != null) {
					if(count < (TrainSize+3)) {	
						//code does not work correctly if there is anything in this block
					}
					else {
						column3 = dataset3.split(",");
						probabilities(column3[0],column3[1],column3[2],column3[4], column3[3]);
						if(probext < ifEntrepreneur ) {
							if(column3[5].equals("No")) {
								correctcount++;
							}
							else {
								errorcount++;
							}
						}
						else if(probext > ifEntrepreneur ) {
							if(column3[5].equals("Yes")) {
								correctcount++;
							}
							else {
								errorcount++;
							}
						}
					}
					count++;
				}
				fileread3.close();
			} 
		catch (IOException e) {
			e.printStackTrace();
		}
		accuracy = (double) correctcount/TestSize;
		accuracy = accuracy*100;
		
		
		
		System.out.println("Program accuracy is "+accuracy+"%");
	}

	public void probabilities(String gender, String parent, String job, String business, String Area){
		
		if(gender.equals("Male"))
		{
			extgender = epgender;
		}
		else{
			extgender = 1-epgender;
		}

		if(parent.equals("Yes"))
		{
			extParent = epParent;
		}
		else{
			extParent = 1 - epParent;
		}

		if(job.equals("Yes"))
		{
			extJob = epJob;
		}
		else{
			extJob = 1- epJob;
		}

		if(business.equals("Yes"))
		{
			extBusiness = epbusinessStudies;
		}
		else{
			extBusiness = 1-epbusinessStudies;
		}
		if(business.equals("Rural"))
		{
			extArea = epArea;
		}
		else{
			extArea = 1-epArea;
		}

		probext = extgender*extBusiness*extJob*extParent*extArea*probEnt;
	}
	
}

package assignmentcode;

import java.io.*;
import java.util.*;

public class Naive {
	//dataset location
	String dataset;
	String[] column;
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
	
	//configuring naive to use default dataset or a custom one
	public Naive(String dataset) {
		this.dataset = dataset;
	}
	
	public void runGeneralNaive() throws FileNotFoundException {
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
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
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
		//
		
		//System.out.println(probEnt);
		probabilities("Female", "No", "No", "Yes", "Urban"); //no
		
		if(probext<ifEntrepreneur) {
			System.out.println("This person is not likely to be an entrepreneur");
		}
		else
		{
			System.out.println("This person is likely to be an entrepreneur");
		}
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

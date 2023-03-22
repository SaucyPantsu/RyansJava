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
		this.ggender = gender+Egender;
		this.gParent = Parent+EParent;
		this.gjob = ejob+ job;
		this.gArea = Area+EArea;
		this.gbusinessStudies = businessStudies+EbusinessStudies;
		
		//general probabilities
		this.gpgender = (double)ggender/linecount;
		this.gpParent = (double)gParent/linecount;
		this.gpjob = (double)gjob/linecount;
		this.gpArea =(double) gArea/linecount;
		this.gpbusinessStudies = (double)gbusinessStudies/linecount;
		this.gpentrepreneur = (double)Eentrepreneur/linecount;
		
		//obtaining entrepreneur probabilities
		this.epgender = (double)Egender/Eentrepreneur;
		this.epParent =(double) EParent/Eentrepreneur;
		this.epJob =(double) ejob/Eentrepreneur;
		this.epArea = (double)EArea/Eentrepreneur;
		this.epbusinessStudies =(double) EbusinessStudies/Eentrepreneur;
		
		//obtaining not entrepreneur probabilities
		this.rpgender = (double)gender/Nentrepreneur;
		this.rpParent = (double)Parent/Nentrepreneur;
		this.rpJob =(double) job/Nentrepreneur;
		this.rpArea =(double) Area/Nentrepreneur;
		this.rpbusinessStudies = (double)businessStudies/Nentrepreneur;
		
		//naive bayes calculation
		
		this.probEnt = (double)Eentrepreneur/linecount;
		this.evidence = (double)gpgender*gpParent*gpjob*gpArea*gpbusinessStudies;
		this.ifEntrepreneur = (double)((epgender*epParent*epJob*epArea*epbusinessStudies*probEnt)/evidence)*evidence;
		
		//
		System.out.println(ifEntrepreneur);
		System.out.println(evidence);
		System.out.println(probEnt);
		probabilities("Female", "No", "No", "No", "Rural");
		System.out.println(results);
	}
	public void probabilities(String gender, String parent, String job, String business, String Area){
		
		if(gender.equals("Male"))
		{
			this.extgender = this.gpgender;
		}
		else{
			this.extgender = 1-gpgender;
		}

		if(parent.equals("Yes"))
		{
			this.extParent = this.gpParent;
		}
		else{
			this.extParent = 1 - gpParent;
		}

		if(job.equals("Yes"))
		{
			this.extJob = this.gpjob;
		}
		else{
			this.extJob = 1- gpjob;
		}

		if(business.equals("Yes"))
		{
			this.extBusiness = this.gpbusinessStudies;
		}
		else{
			this.extBusiness = 1-gpbusinessStudies;
		}
		if(business.equals("Rural"))
		{
			this.extArea = this.gpArea;
		}
		else{
			this.extArea = 1-gpArea;
		}

		probext = extgender*extBusiness*extJob*extParent*extArea;

		results =((probext*probEnt)/this.evidence)*this.evidence;
	}
	
}

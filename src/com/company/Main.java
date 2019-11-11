package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Job> jobsArrayList = new ArrayList<>();//creating arraylist of job for the multiple jobs
        int count = 0;//declaring count in order to go through the loop multiple times
        while (count <= 4) {//while loop for entering in job information
            Job job = new Job();//creating new instance job in main
            Scanner key = new Scanner(System.in);
            System.out.println("Please enter a name and a description of the job: ");
            String jobName = key.nextLine();
            String jobDescription = key.nextLine();
            job.setName(jobName);//setting variable jobName to enter array list job
            job.setDescription(jobDescription);//setting variable jobDescription to enter array list job
            jobsArrayList.add(job);//adding jobName and jobDescription to the array list
            count++;//incrementing count while in the loop to go through the loop for each iteration
        }
        for (Job job2 : jobsArrayList) {//for each job in job2 from the array list
            job2.displayText();//do the displayText method
        }
    }
}

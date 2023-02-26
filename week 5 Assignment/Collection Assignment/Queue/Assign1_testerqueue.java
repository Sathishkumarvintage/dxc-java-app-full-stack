package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Assign1_testerqueue {
	
	public static List<Deque<Assign1_patientQueue>> splitQueue(Deque<Assign1_patientQueue> patientsQueue) {
		
		List<Deque<Assign1_patientQueue>> queuesList = new ArrayList<Deque<Assign1_patientQueue>>();
		Deque<Assign1_patientQueue> seniorQueue = new ArrayDeque<Assign1_patientQueue>();
		Deque<Assign1_patientQueue> normalQueue = new ArrayDeque<Assign1_patientQueue>();
		
		for (Assign1_patientQueue patient : patientsQueue) {
			if(patient.getAge() >= 60) {
				seniorQueue.add(patient);
			}
			else {
				normalQueue.add(patient);
			}
		}		
		queuesList.add(seniorQueue);
		queuesList.add(normalQueue);
		
		return queuesList;
	}
	
	public static void main(String[] args) {
		
		Assign1_patientQueue patient1 = new Assign1_patientQueue("Jack","Male",25);
		Assign1_patientQueue patient2 = new Assign1_patientQueue("Tom","Male",64);
		Assign1_patientQueue patient3 = new Assign1_patientQueue("Simona","Female",24);
		
		Deque<Assign1_patientQueue> patientsQueue = new ArrayDeque<Assign1_patientQueue>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);
		
		List<Deque<Assign1_patientQueue>> queuesList = splitQueue(patientsQueue);
	
		int counter=0;
		for (Deque<Assign1_patientQueue> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Assign1_patientQueue patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	
}
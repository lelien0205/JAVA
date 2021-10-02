package Testbai1;

import Testbai1.Worker;
import Service.WorkerService;
import Service.WorkerServiceInterface;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WorkerServiceInterface workerService = new WorkerService();
		System.out.println(" ==== Worker Manager === ");
		List<Worker> workers = WorkerService.insert(scanner);
		WorkerService.show(workers);
		
	}	
}

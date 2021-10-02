package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Testbai1.Worker;
import Service.WorkerServiceInterface;


@SuppressWarnings("unused")
public abstract class WorkerService implements  WorkerServiceInterface{
	
	public  List<Worker> insert (Scanner scanner) {
		List<Worker> workers = new ArrayList<>();
		System.out.print("Nhap vao so luong cong nhan: ");
		int total = scanner.nextInt();
		scanner.nextLine();
		for (int index = 0 ; index < total ; index++) {
			Worker worker = new Worker();
			worker.input(scanner, index);
			workers.add(worker);
		}
		return workers;
	}

	public  void show(List<Worker> workers) {
		int i = 0;
		for (Worker worker: workers) {
			worker.output(i);
			i++;
		}
	}
	
	

}

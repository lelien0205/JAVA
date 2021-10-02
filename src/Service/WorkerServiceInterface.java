package Service;

import java.util.List;
import java.util.Scanner;

import Testbai1.Worker;


public interface WorkerServiceInterface {
	List<Worker> insert(Scanner scanner);
	void show(List<Worker> workers);
	
}

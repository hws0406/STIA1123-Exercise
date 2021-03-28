
public class Main {

	public static void main(String[] args) {
		Phone A = new Phone();
		Phone B = new Phone();
		A.brand = "Samsung";
		A.operatingSystem = "AndroidOS";
		A.processorType = "Qualcomm Snapdragon";
		A.memoryGB = "12";
		
		B.brand = "Apple";
		B.operatingSystem = "iOS";
		B.processorType = "A14 Bionic";
		B.memoryGB = "6";
		
		System.out.println("Phone A: " + A.brand + "\n" + "Operating System: " + A.operatingSystem + "\n" + "Proceesor Type: " + A.processorType + "\n" + "MemoryGB : " + A.memoryGB);
		A.Function();
		
		System.out.println("\n");
		
		System.out.println("Phone B: " + B.brand + "\n" + "Operating System: " + B.operatingSystem + "\n" + "Proceesor Type: " + B.processorType + "\n" + "MemoryGB : " + A.memoryGB);
		B.Function();
	}     

}

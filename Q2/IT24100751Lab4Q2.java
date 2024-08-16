import java.util.Scanner;
public class IT24100751Lab4Q2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100):");
		int examMarks=scanner.nextInt();
		if (examMarks>100){
			System.out.println("Invalid input for exam marks.Terminating program");
		}
		System.out.print("Please enther lab submission marks(out of 100):");
		int labMarks=scanner.nextInt();
		if(labMarks>100){
			System.out.println("Invalid input for lab submissions.Terminating program");
		}
		System.out.print("Please enter the percentage for the exam:");
		int examPercentage=scanner.nextInt();
		System.out.print("Please enter the percentage for the lab submission:");
		int labPercentage=scanner.nextInt();
		if((examPercentage+labPercentage)!=100){
			System.out.println("The percentages must add up to 100.Terminating program.");
		}
		double finalMark=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);
		System.out.println("Final mark is:"+finalMark);
	}
}
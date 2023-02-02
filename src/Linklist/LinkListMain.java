package Linklist;

import java.util.Scanner;

public class LinkListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice; 
		int val;
		SLinkedList list = new SLinkedList();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" 1.Insert element at last \n 2. Insert element First \n 3. insert By position \n 4. Insert Before \n 5. Insert After \n 6. delete first \n 7. delete last \n 8. deletByPosition \n 9. Show all element \n 10. Number element"
					+ " \n 11. Middle reference \n 12. Middle Node Data \n 13. Alternate value \n 14. Delete alternate value \n 15. ReverseLinkList \n 16. Exit ");
			System.out.println("Enetr Your choice :- ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter Element :- ");
				val = sc.nextInt();
				list.insertLast(val);
				System.out.println("Data inserted ");
				break;
			}
			case 2:{
				System.out.println("Enter Element :- ");
				val = sc.nextInt();
				list.insertFirst(val);
				System.out.println("Data inserted ");
				break;
			}
			case 3 :{
				System.out.println("Enter Element :- ");
				val = sc.nextInt();
				System.out.println("Enter before ");
				int pos = sc.nextInt();
				list.insertByPosition(val, pos);
				System.out.println("Data inserted ");
				break;
			}
			case 4 :{
				System.out.println("Enter Element :- ");
				val = sc.nextInt();
				System.out.println("Enter position ");
				int pos = sc.nextInt();
				list.insertBefore(val, pos);
				System.out.println("Data inserted ");
				break;
			}
			case 5 :{
				System.out.println("Enter Element :- ");
				val = sc.nextInt();
				System.out.println("Enter After ");
				int pos = sc.nextInt();
				list.insertAfter(val, pos);
				System.out.println("Data inserted ");
				break;
			}
			case 6 :{
				System.out.println("Element deleted :- "+list.deleteFirst());
				break;
			}
			case 7 :{
				System.out.println("Element deleted :- "+list.deleteLast());
				break;
			}
			case 8:{
				System.out.println("Enter postion :- ");
				int pos = sc.nextInt();
				System.out.println("Element deleted :- ");
				break;
			}
			case 9 :{
				String str= list.toStr();
				System.out.println("All elements are "+str);
				break;
			}
			case 10:{
				System.out.println("Total nodes :- ");
				break;
			}
			case 11:{
				System.out.println("Middle reference :- ");
				break;
			}
			case 12 :{
				System.out.println("Middle Node Data :- ");
				break;
			}
			case 13:{
				System.out.println("Alternate value :- ");
				break;
			}
			case 14:{
				System.out.println("Delete alternate value :- ");
				break;
			}
			case 15 :{
				list.reverseLinklist();
				break;
			}
			case 16:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
		while(true);
	}

}

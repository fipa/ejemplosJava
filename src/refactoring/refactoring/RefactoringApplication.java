package refactoring.refactoring;

import refactoring.common.Inventory;

import refactoring.messageHandling.initial.MessageHandlingInitial;
import refactoring.messageHandling.modified.MessageHandlingModified;

public class RefactoringApplication {

	public static void main(String[] args) {

        Inventory inventory = new Inventory(5);
        MessageHandlingInitial messageHandlingInitial = new MessageHandlingInitial(inventory);
        MessageHandlingModified messageHandlingModified = new MessageHandlingModified(inventory);

        System.out.println("Printing ");

        System.out.println("Initial version message: ");
        System.out.println(messageHandlingInitial.printStatus());

        System.out.println("Modified version message: ");
        System.out.println(messageHandlingModified.printStatus());


        System.out.println("Sending email ");

        System.out.println("Initial version message: ");
        System.out.println(messageHandlingInitial.sendEmailWithStatus());

        System.out.println("Final version message: ");
        System.out.println(messageHandlingModified.sendEmailWithStatus());
	}
}

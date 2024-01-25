package refactoring.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import refactoring.common.Inventory;
import refactoring.messageHandling.MessageHandling;

class RefactoringTests {

	@Test
	void test() {
		Inventory inventory = new Inventory(5);
		MessageHandling messageHandling = new MessageHandling(inventory);
		assertEquals("Status: We have 5 items.", messageHandling.printStatus());
		assertEquals("[POP email sent]We have 5 items.", messageHandling.sendEmailWithStatus());
	}

}

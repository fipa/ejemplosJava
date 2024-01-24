package refactoring.messageHandling;

import refactoring.common.Inventory;

public class MessageHandling {

    public MessageHandling(Inventory inventory) {
        this.inventory = inventory;
    }

    private Inventory inventory;
    private EmailPopService emailService = new EmailPopService();

    public String printStatus() {
        if (this.inventory.itemsLeft() > 0) {
            return "Status: We have " + this.inventory.itemsLeft() + " items.";
        } else {
            return "Status: We have no more items.";
        }
    }


    public String sendEmailWithStatus() {
        if (this.inventory.itemsLeft() > 0) {
            return emailService.send("We have " + this.inventory.itemsLeft() + " items.");
        } else {
            return emailService.send("We have no more items.");
        }
    }

}

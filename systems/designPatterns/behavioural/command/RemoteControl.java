package designPatterns.behavioural.command;

public class RemoteControl {
    private Command[] buttons = new Command[4];

    public void setCommand(int slotId, Command command) {
        buttons[slotId] = command;
    }

    public void pressButton(int slot) {
        if(buttons[slot] != null){
            buttons[slot].execute();
        } else {
            System.out.println("No Command assigned to slot");
        }
    }
}

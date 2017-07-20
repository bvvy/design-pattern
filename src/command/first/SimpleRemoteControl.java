package command.first;

/**
 * Created by bvvy on 2017/7/20.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.executed();
    }
}


package homework.task2;

import java.util.Arrays;

abstract public class Message {
    private MessageComponent[] component;

    public Message(MessageComponent[] component) {
        this.component = component;
    }

    abstract public String send();

    boolean canSend(){
        for(MessageComponent c : component){
            if(!c.isValid()) return false;
        }
        return true;
    }

    public MessageComponent[] getComponent() {
        return component;
    }

    @Override
    public String toString() {
        return "Message{" +
                "component=" + Arrays.toString(component) +
                '}';
    }
}

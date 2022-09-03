package org.example.view;

import org.example.view.interfaces.IOption;

public class MessageOption implements IOption {
    private final String message;

    public MessageOption(String message){
        this.message = message;
    }
    @Override
    public void execute() {
        System.out.println(this.message);
    }
}

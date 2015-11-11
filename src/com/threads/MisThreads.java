package com.threads;

public abstract class MisThreads {
    public MisThreads() {
        super();
    }
    
    EventHandler handler= new EventHandler();
    
    public void addCharacterListener(IListener cl) {
        handler.addCharacterListener(cl);
    }

    public void removeCharacterListener(IListener cl) {
        handler.removeCharacterListener(cl);
    }

    public void nextCharacter(char c) {
        handler.fireNewCharacter(this, c);
    }
}

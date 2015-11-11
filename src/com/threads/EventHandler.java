package com.threads;

import java.util.Vector;

public class EventHandler {
	
	private Vector listeners = new Vector();

    public void addCharacterListener(IListener cl) {
        listeners.add(cl);
    }

    public void removeCharacterListener(IListener cl) {
        listeners.remove(cl);
    }

    public void fireNewCharacter(Object obj, char c) {
        Evento ce = new Evento(obj, c);

        Main[] cl = (Main[])listeners.toArray(new Main[0]);
        for (int i = 0; i < cl.length; i++)
            cl[i].newCharacter(ce);
    }

}

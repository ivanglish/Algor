package com.threads;


public interface IThreadsSource {
    
    public void addCharacterListener(IListener cl);
    public void removeCharacterListener(IListener cl);
    public void nextCharacter(char c);
}

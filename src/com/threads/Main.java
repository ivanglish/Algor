package com.threads;


public class Main implements IListener{

    Letras l;
    Numeros n;
    Thread t;
    Thread t2;
    

        
        public void hace(){
            
            l = new Letras();
            n = new Numeros();    
            System.out.println("poniendo listeners");
            l.addCharacterListener(this);
            n.addCharacterListener(this);

            t = new Thread(l);
            t2 = new Thread(n);
    
            t.start();
            t2.start();
            
        }
     

        public  void newCharacter(Evento e) {
            
            System.out.println("escuche el evento xxm "+e.c);
            
          if (e.obj instanceof Letras){
                if (e.c == 'K'){
                        System.out.println("xxxxxxxxxxxxxxxxxxx");
                        
                        //t2.notify();
                        n.setDone(false);
                }
            }
        }

  
}

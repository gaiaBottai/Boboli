package thread;

public class Turista extends Thread{
private int matricola;
private Giardino g;//risorsa

public Turista(int matricola,Giardino g){
    this.matricola=matricola;
    this.giardino=giardino;
}

@Overrride
public void run(){
    //entra
    try{
 char ingresso=g.entra(matricola){//decremento l'ingresso, dice in che ingresso entro

}

    //attende 3 secondi se a e un tempo casuale se b
    if(ingresso == 'A'){
    sleep(3000)
    }
    else
    int tempo=1000 +(int) Math.random()*4000;//int così loforzo a darmi un valore int intero e 1000 perchè coì escludo il tempo zero come possibilità
    sleep(tempo);

    //esce
 g.esci(ingresso,matricola){//ingremento un ingresso

 }
}catch(InterruptedException e){
    e.printStackTarce();
}

}
}

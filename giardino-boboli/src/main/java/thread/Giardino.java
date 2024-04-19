package thread;

public class Giardino(){
 private int ingressoA=5;
 private  int ingressoB=10;


    public synchronized char entra(int matricola)throws InterruptedException{
        char ingresso;
    while(ingressoA == 0 && ingressoB == 0){
        System.out.println("gli ingressi sono pieni. il visitatore numero "+matricola+" attende il suo turno");
        wait();
    }
//gestisco l'ingresso a
    if(ingressoA>0){
        
    ingressoA--;
    ingresso='A';
    }
//gestisco l'ingresso b
    else(ingressoB>0){
    ingressoB--;
    ingresso='B';
    }
    System.out.println("il visitatore numero "+matricola+" entra nell'ingresso "+ingresso);
return ingresso;

    }
    public synchronized void esci(char ingresso,int matricola){
        if(ingresso =='A'){
     ingressoA++;
        }
        else
       ingressoB++;
       System.out.println("il visitatore numero "+matricola+" esce dall'ingresso "+ingresso);
       notify();
    }
       
     
   
}
    
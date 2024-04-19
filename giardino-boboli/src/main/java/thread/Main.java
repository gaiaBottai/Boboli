package thread;

public class Main {
    public static void main(String[] args) {
        Giardino giardino=new Giardino;
      for(int i=1;i<=50;i++){
    Turista t=new Turista(i,giardino);
    t.start();
      }
        
    }
}
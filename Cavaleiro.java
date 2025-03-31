package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Cavaleiro extends Thread{
    private static final Semaphore escolherPorta = new Semaphore(1); 
    private static final Random random = new Random();
    private static boolean[] portasEscolhidas = new boolean[4];
    private static int  tochaCavaleiro = 1 ; 
    private static int  pedraCavaleiro = 1; 
    private int idCavaleiro;
    //private static int posCavaleiro;

    public ThreadCavaleiro(idCavaleiro){
        this.idCavaleiro = idCavaleiro;
    }

    public void run(){
        try {
            entrarCorredor();
            escolherPorta();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        private void tunelCorredor(){
            int distanciaTot = 2000;
            int passo = (int) (Math.random()*4.1);
            int distPercorrida = 0;


            while(distanciaTot<distPercorrida){
                sleep(50);
                distPercorrida += passo;
             }

            if(distPercorrida>=500 && tochaCavaleiro ==1){
                 tochaCavaleiro = idCavaleiro;
                 passo += 2;
                 System.err.println("O cavaleiro de id:" + idCavaleiro + " pegou a tocha! Sua velocidade agora é de" + passo);
                 }else if (distPercorrida >=1500 && pedraCavaleiro ==1 && idCavaleiro != tochaCavaleiro){
                    pedraCavaleiro = idCavaleiro; 
                    passo += 2; 
                    System.err.println("O cavaleiro de id:" + idCavaleiro + " pegou a pedra brilhante! Sua velocidade é " + passo);

                 }
            if (distPercorrida == distanciaTot){
                System.err.println("O cavaleiro de id " + idCavaleiro + " chegou ao final, e pode entrar em uma porta!");
            }
            
        }    

    }

private void escolherPorta ()throws InterruptedException {
    
}

}

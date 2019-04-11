package LabSession3;

public class SubThread extends Thread {
    public void run(){
        System.out.println("Dem nguoc :");
        try {


        for (int x=10;x>0;x--){
            System.out.println(x);
            Thread.sleep(1000);
        }
        System.out.println("Chuc Mung ");
        }catch (Exception e){}
    }
}

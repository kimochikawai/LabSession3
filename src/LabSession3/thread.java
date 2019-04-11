package LabSession3;

import java.util.ArrayList;

public class thread extends Thread{
    public void run(){
        int a;
        ArrayList<Integer> muoiSo=new ArrayList<>();
        int n=0,dem1=0;
        System.out.println("Muoi so nguyen to nho nhat la : \n");

        try {
            for (int i = 0; i < 100; i++) {

                if (kiemtra(i) == true) {
                    System.out.println(thread.currentThread().getName()+" "+i);
                    Thread.sleep(1500);
                    dem1++;
                    if (dem1>9){
                        break;
                    }
                }
            }
        }catch (Exception e){}
    }
    public boolean kiemtra(int n) {
        int a = 1, b;
        int dem = 0;
        for (b = 1; b <= n; b++) {
            if (n % b == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            return true;
        } else {
            return false;
        }

    }
}

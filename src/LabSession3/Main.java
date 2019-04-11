package LabSession3;

public class Main {

    public static void main(String[] args) {

         thread s1=new thread();
        s1.setName("MyjavaThread");
//        s1.start();
        SubThread s2=new SubThread();
        s2.start();
    }
}

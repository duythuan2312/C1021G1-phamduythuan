package ss4_LopvadoituongtrongJava.baitap;

import java.util.Scanner;

public class StopWatch {
   private long startTime;
   private long endTime;

    public long getStartTime() {
        return startTime;
    }
   public long start(){
        return startTime = System.currentTimeMillis();
   }
   public long stop(){
        return endTime = System.currentTimeMillis();
   }
    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.start());
        for (int i = 1 ; i < 100000000 ; i++ ){

        }
        stopWatch.stop();
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}

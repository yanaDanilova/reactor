package com.reactor.reactor.section1;

import com.reactor.reactor.utils.Utils;
import reactor.core.publisher.Mono;

public class MonoFromRunnable {
    public static void main(String[] args) {
        Mono.fromRunnable(timeConsumingProcess()).subscribe(
                Util.onNext(),
                Util.onError(),
                ()->{
                    System.out.println("process is done");
                }
        );

    }

    private static Runnable timeConsumingProcess(){
        return ()->{
            Utils.sleepSeconds(5);
            System.out.println("Operation Completed");
        };
    }
}

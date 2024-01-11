package com.reactor.reactor.section1;

import java.util.function.Consumer;

public class Util {
    public static Consumer<Object> onNext(){
        return o -> System.out.println("Received "+o);
    }
    public static Consumer<Throwable> onError(){
        return err -> System.out.println(err.getMessage());
    }
    public static Runnable onComplete(){
        return () -> System.out.println("Completed");
    }
}

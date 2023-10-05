package com.reactor.reactor.section1;

import com.reactor.reactor.utils.Utils;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MonoFromSupplierAndCallable {
    public static void main(String[] args) {

       // Mono.just(getName());

        Supplier<String> stringSupplier = ()->getName();
        Callable<String> stringCallable = ()->getName();

        Mono<String> mono = Mono.fromSupplier(stringSupplier);
        mono.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

        Mono<String> mono2 = Mono.fromCallable(stringCallable);
        mono2.subscribe(Util.onNext(),Util.onError(),Util.onComplete());

    }
    private static String getName(){
        System.out.println("Generate name...");
        return Utils.faker().name().fullName();
    }
}

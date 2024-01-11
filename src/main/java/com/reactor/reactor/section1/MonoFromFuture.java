package com.reactor.reactor.section1;

import com.reactor.reactor.utils.Utils;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class MonoFromFuture {
    public static void main(String[] args) {

        Mono.fromFuture(getName()).subscribe(Util.onNext());
        Utils.sleepSeconds(1);


    }
    private static CompletableFuture<String> getName(){
        return CompletableFuture.supplyAsync(()-> Utils.faker().name().fullName());
    }
}

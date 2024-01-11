package com.reactor.reactor.section1;

import reactor.core.publisher.Mono;

public class Lection3MonoSubscribe {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(length -> length / 1);

        //System.out.println(mono.subscribe());

        mono.subscribe(
                i-> System.out.println(i),
                err-> System.out.println(err.getMessage()),
                ()-> System.out.println("Completed")
        );

        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }

}

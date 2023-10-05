package com.reactor.reactor.section1;

import reactor.core.publisher.Mono;

public class Lection2MonoJust {
    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(1);
        //System.out.println(mono);
        mono.subscribe(System.out::println);
    }
}

package com.reactor.reactor.section2;

import com.reactor.reactor.section1.Util;
import reactor.core.publisher.Flux;

public class FluxMultipleSubscribe {

    public static void main(String[] args) {

        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4);

        Flux<Integer> filteredFlux = integerFlux.filter(i -> i % 2 == 0);

        integerFlux.subscribe(Util.onNext());

        filteredFlux.subscribe(Util.onNext());
    }
}

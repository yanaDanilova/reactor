package com.reactor.reactor.section2;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.reactor.reactor.section1.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;


public class FluxStream {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3,4,5);

        Stream<Integer> integerStream = integerList.stream();

        Flux<Integer> fromStream = Flux.fromStream(()->integerList.stream());

        fromStream.subscribe(Util.onNext());
        fromStream.subscribe(Util.onNext());

    }
}

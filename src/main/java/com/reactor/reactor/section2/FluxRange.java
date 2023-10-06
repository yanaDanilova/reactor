package com.reactor.reactor.section2;

import com.reactor.reactor.section1.Util;
import com.reactor.reactor.utils.Utils;
import reactor.core.publisher.Flux;

public class FluxRange {
    public static void main(String[] args) {
        Flux.range(1, 10)
                .map(i-> Utils.faker().name().fullName())
                .subscribe(
                        Util.onNext()
                );
    }
}

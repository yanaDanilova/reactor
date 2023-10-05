package com.reactor.reactor.section1;

import com.github.javafaker.Faker;
import com.reactor.reactor.utils.Utils;
import reactor.core.publisher.Mono;

public class MonoErrorOrEmpty {
    public static void main(String[] args) {

        userRepository(1).subscribe(Util.onNext(),Util.onError(),Util.onComplete());
    }

    private static Mono<String> userRepository(int userId){
        if(userId==1){
            return Mono.just(Utils.faker().name().firstName());
        }
        else if (userId ==2){
            return Mono.empty();
        }
        else {
            return Mono.error(new RuntimeException("Can't be more then 1"));
        }
    }
}

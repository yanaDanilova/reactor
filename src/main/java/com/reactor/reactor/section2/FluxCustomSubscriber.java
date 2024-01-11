package com.reactor.reactor.section2;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.concurrent.atomic.AtomicReference;

public class FluxCustomSubscriber {

    public static void main(String[] args) throws InterruptedException {

        AtomicReference<Subscription> objectAtomicReference = new AtomicReference<>();
        Flux.range(1,20)
                .log()
                .subscribeWith((new Subscriber<Integer>() {
            @Override
            public void onSubscribe(Subscription subscription) {
                objectAtomicReference.set(subscription);
                System.out.println("receive " + subscription);
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(" on next receive " + integer);

            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("on error receive " + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println(" on complete ");
            }
        }));

        objectAtomicReference.get().request(3);
        Thread.sleep(3);
        objectAtomicReference.get().request(2);
        Thread.sleep(3);
        objectAtomicReference.get().cancel();
        Thread.sleep(3);
        objectAtomicReference.get().request(3);
    }
}

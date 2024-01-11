package com.reactor.reactor.section1;

import java.util.stream.Stream;

public class Lection1Stream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1)
                .map(integer ->{
                    return integer * 2;
                });
     //   System.out.println(integerStream);
        integerStream.forEach(System.out::println);
    }


}

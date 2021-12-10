package ru.phystech.bench;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import ru.phystech.bench.dto.OrderDTO;

import java.sql.Timestamp;
import java.util.List;

@State(Scope.Benchmark)
public class BenchState {
    public  OrderDTO dto = OrderDTO.builder()
            .orderID(1L)
            .consumerID(2L)
            .positionsIDs(List.of(3L, 4L, 5L, 6L, 7L))
            .date(new Timestamp(System.nanoTime()))
            .description("Доставка 5-ти шампуней")
            .build();
    public String jsonString = "{\n" +
            "  \"orderID\": 1,\n" +
            "  \"consumerID\": 2,\n" +
            "  \"positionsIDs\": [\n" +
            "    3,\n" +
            "    4,\n" +
            "    5,\n" +
            "    6,\n" +
            "    7\n" +
            "  ],\n" +
            "  \"date\": \"Oct 5, 21717, 11:51:58 AM\",\n" +
            "  \"description\": \"Доставка 5-ти шампуней\"\n" +
            "}";
    public byte[] byteArray = new byte[]{8, 1, 16, 2, 26, 5, 3, 4, 5, 6, 7, 32, -11, -17, -31, -87, -10, -43, 1, 42, 40, -48, -108, -48, -66, -47, -127, -47, -126, -48, -80, -48, -78, -48, -70, -48, -80, 32, 53, 45, -47, -126, -48, -72, 32, -47, -120, -48, -80, -48, -68, -48, -65, -47, -125, -48, -67, -48, -75, -48, -71};

}

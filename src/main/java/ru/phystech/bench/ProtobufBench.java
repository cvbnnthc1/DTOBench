package ru.phystech.bench;

import com.google.protobuf.InvalidProtocolBufferException;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import ru.phystech.bench.dto.OrderDTO;
import ru.phystech.bench.generated.OrderProtos;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class ProtobufBench {
    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode({Mode.AverageTime, Mode.Throughput})
    @Fork(value = 1)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkToBytes(Blackhole blackhole, BenchState state) {
        OrderProtos.Order order = OrderProtos.Order.newBuilder()
                .setOrderID(state.dto.getOrderID())
                .setConsumerID(state.dto.getConsumerID())
                .setDate(state.dto.getDate().getTime())
                .addAllPositionsIDs(state.dto.getPositionsIDs())
                .setDescription(state.dto.getDescription())
                .build();
        byte[] result = order.toByteArray();
        blackhole.consume(result);
        blackhole.consume(order);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode({Mode.AverageTime, Mode.Throughput})
    @Fork(value = 1)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkFromBytes(Blackhole blackhole, BenchState state) throws InvalidProtocolBufferException {
        OrderProtos.Order order = OrderProtos.Order.newBuilder()
                .mergeFrom(state.byteArray)
                .build();
        OrderDTO result = OrderDTO.builder()
                .orderID(order.getOrderID())
                .consumerID(order.getConsumerID())
                .positionsIDs(order.getPositionsIDsList())
                .date(new Timestamp(order.getDate()))
                .description(order.getDescription())
                .build();
        blackhole.consume(result);
        blackhole.consume(order);
    }

}

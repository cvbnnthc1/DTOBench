package ru.phystech.bench;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.phystech.bench.dto.OrderDTO;
import ru.phystech.bench.generated.OrderProtos;

import java.sql.Timestamp;


class ProtobufBenchTest {

    @Test
    void benchmarkFromBytes() throws InvalidProtocolBufferException {
        BenchState state = new BenchState();
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
        Assertions.assertEquals(state.dto.getOrderID(), result.getOrderID());
        Assertions.assertEquals(state.dto.getConsumerID(), result.getConsumerID());
        Assertions.assertEquals(state.dto.getPositionsIDs(), result.getPositionsIDs());
        Assertions.assertEquals(state.dto.getDescription(), result.getDescription());

    }
}
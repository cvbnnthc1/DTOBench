package ru.phystech.bench;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.phystech.bench.dto.OrderDTO;

import static org.junit.jupiter.api.Assertions.*;

class JSONBenchTest {

    @Test
    void benchmarkFromString() {
        BenchState state = new BenchState();
        Gson gson = new Gson();
        OrderDTO result = gson.fromJson(state.jsonString, OrderDTO.class);
        Assertions.assertEquals(state.dto.getOrderID(), result.getOrderID());
        Assertions.assertEquals(state.dto.getConsumerID(), result.getConsumerID());
        Assertions.assertEquals(state.dto.getPositionsIDs(), result.getPositionsIDs());
        Assertions.assertEquals(state.dto.getDescription(), result.getDescription());
    }
}
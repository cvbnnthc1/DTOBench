package ru.phystech.bench;

import com.google.gson.Gson;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import ru.phystech.bench.dto.OrderDTO;

import java.util.concurrent.TimeUnit;

public class JSONBench {


    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode({Mode.AverageTime, Mode.Throughput})
    @Fork(value = 1)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkToString(Blackhole blackhole, BenchState state) {
        Gson gson = new Gson();
        String result = gson.toJson(state.dto);
        blackhole.consume(result);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode({Mode.AverageTime, Mode.Throughput})
    @Fork(value = 1)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkFromString(Blackhole blackhole, BenchState state) {
        Gson gson = new Gson();
        OrderDTO result = gson.fromJson(state.jsonString, OrderDTO.class);
        blackhole.consume(result);
    }
}

package ru.phystech.bench.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class OrderDTO {
    private long orderID;
    private long consumerID;
    private List<Long> positionsIDs;
    private Timestamp date;
    private String description;
}

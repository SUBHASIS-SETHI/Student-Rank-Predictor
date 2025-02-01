package com.example.RankPredictor.model;
import lombok.Data;

@Data
public class RankPrediction {
    private String userId;
    private int predictedRank;
}

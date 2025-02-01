package com.example.RankPredictor.model;
import lombok.Data;
import java.util.List;

@Data
public class AnalysisResult {
    private String userId;
    private List<String> weakTopics;
    private double overallAccuracy;
    private String improvementTrend;
}

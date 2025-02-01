package com.example.RankPredictor.dto;
import lombok.Data;
import java.util.Map;

@Data
public class QuizSubmission {
    private String userId;
    private Map<String, String> responseMap; // Key: Question ID, Value: Selected Option ID
}


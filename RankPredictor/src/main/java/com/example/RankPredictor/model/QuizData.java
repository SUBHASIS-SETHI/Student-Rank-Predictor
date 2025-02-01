package com.example.RankPredictor.model;
import lombok.Data;
import java.util.Map;

@Data
public class QuizData {
    private String userId;
    private Map<String, String> responseMap; // Key: Question ID, Value: Selected Option ID
    private int score;
    private String topic;
    private String difficultyLevel;
}

package com.example.RankPredictor.controller;

import com.example.RankPredictor.model.*;
import com.example.RankPredictor.service.RankPredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RankPredictorController {
    @Autowired
    private RankPredictionService rankPredictionService;

    @GetMapping("/analyze/{userId}")
    public ResponseEntity<AnalysisResult> analyzeUserPerformance(@PathVariable String userId) {
        AnalysisResult result = rankPredictionService.analyzePerformance(userId);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/predict-rank")
    public ResponseEntity<RankPrediction> predictRank(@RequestBody QuizData quizData) {
        RankPrediction prediction = rankPredictionService.predictRank(quizData);
        return ResponseEntity.ok(prediction);
    }

    @GetMapping("/predict-college/{rank}")
    public ResponseEntity<List<College>> predictCollege(@PathVariable int rank) {
        List<College> colleges = rankPredictionService.predictCollege(rank);
        return ResponseEntity.ok(colleges);
    }
}

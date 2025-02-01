package com.example.RankPredictor.service;

import com.example.RankPredictor.model.*;
import com.example.RankPredictor.util.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RankPredictionService {
    @Autowired
    DataFetcher dataFetcher;

    public AnalysisResult analyzePerformance(String userId) {
        // Fetch historical data (mock implementation)
        List<Object> historicalData = dataFetcher.fetchQuizData("https://api.jsonserve.com/XgAgFJ");

        // Analyze data (mock logic)
        AnalysisResult result = new AnalysisResult();
        result.setUserId(userId);
        result.setWeakTopics(Arrays.asList("Biology", "Chemistry"));
        result.setOverallAccuracy(75.5);
        result.setImprovementTrend("Improving");
        return result;
    }
    public RankPrediction predictRank(QuizData quizData) {
        // Predict rank based on score (mock logic)
        RankPrediction prediction = new RankPrediction();
        prediction.setUserId(quizData.getUserId());
        prediction.setPredictedRank((int) (100000 * (1 - (quizData.getScore() / 100.0))));
        return prediction;
    }
    public List<College> predictCollege(int rank) {
        // Mock college data
        // Mock college data
        List<College> colleges = new ArrayList<>();
        colleges.add(new College("AIIMS Delhi", 100));
        colleges.add(new College("Maulana Azad Medical College", 500));
        colleges.add(new College("King George's Medical University", 1000));
        colleges.add(new College("JIPMER Puducherry", 1500));

        // Filter colleges based on rank
        List<College> eligibleColleges = new ArrayList<>();
        for (College college : colleges) {
            if (college.getCutoffRank() <= rank) { // Fix: Use <= instead of >=
                eligibleColleges.add(college);
            }
        }
        return eligibleColleges;
    }
}


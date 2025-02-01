package com.example.RankPredictor.model;
import lombok.Data;

@Data
public class College {
    private String name;
    private int cutoffRank;

    public College(String name, int cutoffRank) {
        this.name = name;
        this.cutoffRank = cutoffRank;
    }
}

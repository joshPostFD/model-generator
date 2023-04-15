
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minutes",
    "field_goals_made",
    "field_goals_att",
    "field_goals_pct",
    "three_points_made",
    "three_points_att",
    "three_points_pct",
    "two_points_made",
    "two_points_att",
    "two_points_pct",
    "blocked_att",
    "free_throws_made",
    "free_throws_att",
    "free_throws_pct",
    "offensive_rebounds",
    "defensive_rebounds",
    "rebounds",
    "assists",
    "turnovers",
    "steals",
    "blocks",
    "assists_turnover_ratio",
    "personal_fouls",
    "tech_fouls",
    "flagrant_fouls",
    "pls_min",
    "points",
    "double_double",
    "triple_double",
    "effective_fg_pct",
    "efficiency",
    "efficiency_game_score",
    "points_in_paint",
    "points_in_paint_att",
    "points_in_paint_made",
    "points_in_paint_pct",
    "true_shooting_att",
    "true_shooting_pct",
    "fouls_drawn",
    "offensive_fouls",
    "points_off_turnovers",
    "second_chance_pts",
    "fast_break_pts",
    "fast_break_att",
    "fast_break_made",
    "fast_break_pct",
    "defensive_rating",
    "offensive_rating",
    "coach_ejections",
    "minus",
    "plus",
    "defensive_rebounds_pct",
    "offensive_rebounds_pct",
    "rebounds_pct",
    "steals_pct",
    "turnovers_pct",
    "coach_tech_fouls",
    "second_chance_att",
    "second_chance_made",
    "second_chance_pct",
    "periods"
})
@Generated("jsonschema2pojo")
public class Statistics__1 {

    @JsonProperty("minutes")
    public String minutes;
    @JsonProperty("field_goals_made")
    public Integer fieldGoalsMade;
    @JsonProperty("field_goals_att")
    public Integer fieldGoalsAtt;
    @JsonProperty("field_goals_pct")
    public Double fieldGoalsPct;
    @JsonProperty("three_points_made")
    public Integer threePointsMade;
    @JsonProperty("three_points_att")
    public Integer threePointsAtt;
    @JsonProperty("three_points_pct")
    public Double threePointsPct;
    @JsonProperty("two_points_made")
    public Integer twoPointsMade;
    @JsonProperty("two_points_att")
    public Integer twoPointsAtt;
    @JsonProperty("two_points_pct")
    public Double twoPointsPct;
    @JsonProperty("blocked_att")
    public Integer blockedAtt;
    @JsonProperty("free_throws_made")
    public Integer freeThrowsMade;
    @JsonProperty("free_throws_att")
    public Integer freeThrowsAtt;
    @JsonProperty("free_throws_pct")
    public Double freeThrowsPct;
    @JsonProperty("offensive_rebounds")
    public Integer offensiveRebounds;
    @JsonProperty("defensive_rebounds")
    public Integer defensiveRebounds;
    @JsonProperty("rebounds")
    public Integer rebounds;
    @JsonProperty("assists")
    public Integer assists;
    @JsonProperty("turnovers")
    public Integer turnovers;
    @JsonProperty("steals")
    public Integer steals;
    @JsonProperty("blocks")
    public Integer blocks;
    @JsonProperty("assists_turnover_ratio")
    public Double assistsTurnoverRatio;
    @JsonProperty("personal_fouls")
    public Integer personalFouls;
    @JsonProperty("tech_fouls")
    public Integer techFouls;
    @JsonProperty("flagrant_fouls")
    public Integer flagrantFouls;
    @JsonProperty("pls_min")
    public Integer plsMin;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("double_double")
    public Boolean doubleDouble;
    @JsonProperty("triple_double")
    public Boolean tripleDouble;
    @JsonProperty("effective_fg_pct")
    public Double effectiveFgPct;
    @JsonProperty("efficiency")
    public Integer efficiency;
    @JsonProperty("efficiency_game_score")
    public Double efficiencyGameScore;
    @JsonProperty("points_in_paint")
    public Integer pointsInPaint;
    @JsonProperty("points_in_paint_att")
    public Integer pointsInPaintAtt;
    @JsonProperty("points_in_paint_made")
    public Integer pointsInPaintMade;
    @JsonProperty("points_in_paint_pct")
    public Double pointsInPaintPct;
    @JsonProperty("true_shooting_att")
    public Double trueShootingAtt;
    @JsonProperty("true_shooting_pct")
    public Double trueShootingPct;
    @JsonProperty("fouls_drawn")
    public Integer foulsDrawn;
    @JsonProperty("offensive_fouls")
    public Integer offensiveFouls;
    @JsonProperty("points_off_turnovers")
    public Integer pointsOffTurnovers;
    @JsonProperty("second_chance_pts")
    public Integer secondChancePts;
    @JsonProperty("fast_break_pts")
    public Integer fastBreakPts;
    @JsonProperty("fast_break_att")
    public Integer fastBreakAtt;
    @JsonProperty("fast_break_made")
    public Integer fastBreakMade;
    @JsonProperty("fast_break_pct")
    public Double fastBreakPct;
    @JsonProperty("defensive_rating")
    public Double defensiveRating;
    @JsonProperty("offensive_rating")
    public Double offensiveRating;
    @JsonProperty("coach_ejections")
    public Integer coachEjections;
    @JsonProperty("minus")
    public Integer minus;
    @JsonProperty("plus")
    public Integer plus;
    @JsonProperty("defensive_rebounds_pct")
    public Double defensiveReboundsPct;
    @JsonProperty("offensive_rebounds_pct")
    public Double offensiveReboundsPct;
    @JsonProperty("rebounds_pct")
    public Double reboundsPct;
    @JsonProperty("steals_pct")
    public Double stealsPct;
    @JsonProperty("turnovers_pct")
    public Double turnoversPct;
    @JsonProperty("coach_tech_fouls")
    public Integer coachTechFouls;
    @JsonProperty("second_chance_att")
    public Integer secondChanceAtt;
    @JsonProperty("second_chance_made")
    public Integer secondChanceMade;
    @JsonProperty("second_chance_pct")
    public Double secondChancePct;
    @JsonProperty("periods")
    public List<Period__1> periods = new ArrayList<Period__1>();

}
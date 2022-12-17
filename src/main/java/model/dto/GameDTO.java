package model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class GameDTO {
    private Integer id;

    @JsonProperty("game_status")
    private String gameStatus;

    @JsonProperty("user_lifepoints")
    private Integer userLifePoints;

    @JsonProperty("enemy_lifepoints")
    private Integer enemyLifePoints;

    @JsonProperty("used_deck_name")
    private String usedDeckName;

    @JsonProperty("dt_started")
    private Date dtStarted;

    @JsonProperty("dt_finished")
    private Date dtFinished;

    @JsonProperty("user_id")
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Integer getUserLifePoints() {
        return userLifePoints;
    }

    public void setUserLifePoints(Integer userLifePoints) {
        this.userLifePoints = userLifePoints;
    }

    public Integer getEnemyLifePoints() {
        return enemyLifePoints;
    }

    public void setEnemyLifePoints(Integer enemyLifePoints) {
        this.enemyLifePoints = enemyLifePoints;
    }

    public String getUsedDeckName() {
        return usedDeckName;
    }

    public void setUsedDeckName(String usedDeckName) {
        this.usedDeckName = usedDeckName;
    }

    public Date getDtStarted() {
        return dtStarted;
    }

    public void setDtStarted(Date dtStarted) {
        this.dtStarted = dtStarted;
    }

    public Date getDtFinished() {
        return dtFinished;
    }

    public void setDtFinished(Date dtFinished) {
        this.dtFinished = dtFinished;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

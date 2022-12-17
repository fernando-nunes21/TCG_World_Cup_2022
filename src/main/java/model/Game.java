package model;

import java.util.Date;

public class Game {
    private Integer id;
    private String gameStatus;
    private Integer userLifePoints;
    private Integer enemyLifePoints;
    private String usedDeckName;
    private Date dtStarted;
    private Date dtFinished;
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

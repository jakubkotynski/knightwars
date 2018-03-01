package com.knightwars.knightwars.domain;

public class Knight {

    private String name;
    private int healthPoints;
    private int attackPower;
    private int defense;
    private Quest quest;

    public Knight(String name, int healthPoints, int attackPower, int defense, Quest quest) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.defense = defense;
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Knight name is " + name + "\""
                + "HP: " + healthPoints + "\""
                + "AP: " + attackPower + "\""
                + "DEF: " + defense + "\""
                + "Quests: " + quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}

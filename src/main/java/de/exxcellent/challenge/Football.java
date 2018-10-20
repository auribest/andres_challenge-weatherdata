package de.exxcellent.challenge;

import java.util.ArrayList;

public class Football {
  //Source of the football file.
  private String footballFile = "src/main/resources/de/exxcellent/challenge/football.csv";

  //ArrayList to save all team names.
  private ArrayList<String> teamNames = new ArrayList<>();
  //ArrayList to save all absolute differences between goals & goals allowed.
  private ArrayList<Integer> absoluteDiffOfGoals = new ArrayList<>();
  //ArrayList to save all goals of each team.
  private ArrayList<String> goals = new ArrayList();
  //ArrayList to save all goals allowed of each team.
  private ArrayList<String> goalsAllowed = new ArrayList<>();
}
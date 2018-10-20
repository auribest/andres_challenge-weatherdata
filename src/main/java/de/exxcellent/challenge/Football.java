package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
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

  //Team with smallest absolute difference between goals and goals allowed.
  public String smallestAbsoluteGoalDiff = null;

  /**
   * Method to get the team with the smallest absolute difference between goals and goals allowed.
   */
  public void minAbsoluteDiffOfGoals() {
    try {
      //The file reader
      BufferedReader fileReader = new BufferedReader(new FileReader(footballFile));

      //Defines a line of the football file.
      String line;
      //Difines all elements of a line.
      String[] elements;

      //While there is a line.
      while ((line = fileReader.readLine()) != null) {
        //Remove the commas.
        elements = line.split(",");

        //Add every first element of a line to the list and remove all whitespaces.
        teamNames.add(elements[0].trim());
        //Add every sixth element of a line to the list and remove all whitespaces.
        goals.add(elements[5].trim());
        //Add every seventh element of a line to the list and remove all whitespaces.
        goalsAllowed.add(elements[6].trim());
      }

      for (int i = 1; i < goals.size(); i++) {
        //Take a value of the goalsList and substract the corresponding value of the
        // goalsAllowedList.
        int absoluteDiffOfGoalsVariable = (
            Integer.parseInt(goals.get(i)) - Integer.parseInt(goalsAllowed.get(i)));

        //If the value is nagative multiply it by -1 and add it to the list,
        // else just add it to de list.
        if (absoluteDiffOfGoalsVariable < 0) {
          absoluteDiffOfGoals.add((absoluteDiffOfGoalsVariable) * (-1));
        } else {
          absoluteDiffOfGoals.add(absoluteDiffOfGoalsVariable);
        }
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
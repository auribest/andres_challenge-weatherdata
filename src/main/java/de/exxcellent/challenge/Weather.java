package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Weather {
  //Source of the weather file.
  private String weatherFile = "src/main/resources/de/exxcellent/challenge/weather.csv";

  //ArrayList to save all temperature spreads of each day of the month.
  private ArrayList<Integer> tempSpreadsOfMonth = new ArrayList();
  //ArrayList to save all maximum temperatures of each day of the month.
  private ArrayList<String> maxTempsOfMonth = new ArrayList<>();
  //ArrayList to save all minimum temperatures of each day of the month.
  private ArrayList<String> minTempsOfMonth = new ArrayList<>();

  //Day with the smallest temperature spread of the month.
  public int smallestTempSpread = 0;

  /**
   * Method to get the day with the smallest temperature spread of the month.
   */
  public void minTempSpread() {
    try {
      //The file reader
      BufferedReader fileReader = new BufferedReader(new FileReader(weatherFile));

      //Defines a line of the weather file.
      String line;
      //Difines all elements of a line.
      String[] elements;

      //While there is a line.
      while ((line = fileReader.readLine()) != null) {
        //Remove the commas.
        elements = line.split(",");

        //Add every second element of a line to the list and remove all whitespaces.
        maxTempsOfMonth.add(elements[1].trim());
        //Add every third element of a line to the list and remove all whitespaces.
        minTempsOfMonth.add(elements[2].trim());
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
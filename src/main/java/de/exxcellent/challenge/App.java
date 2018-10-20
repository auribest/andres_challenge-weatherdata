package de.exxcellent.challenge;

/**
 * The entry class for your solution. This class is only aimed as starting point and
 * not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid < benjamin.schmid@exxcellent.de >.
 * @editor Andrés Uribe Stengel.
 */
public final class App {

  /**
   * The main method of the App.
   * @param args The parameter for the main method.
   */
  public static void main(String... args) {

    Weather weather = new Weather();
    Football football = new Football();

    weather.minTempSpread();
    football.minAbsoluteDiffOfGoals();

    int dayWithSmallestTempSpread = weather.smallestTempSpread;
    String teamWithSmallesGoalSpread = football.smallestAbsoluteGoalDiff;

    System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
  }
}
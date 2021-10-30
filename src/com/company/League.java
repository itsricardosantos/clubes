package com.company;

import java.util.Arrays;

public class League {
    public static Club[] listOfClubs;
    private static Player[] listOfPlayers;
    private static Staff[] staffList;

    public League() {
        this.listOfClubs = new Club[18];
        this.listOfPlayers = new Player[]{};
        this.staffList = new Staff[]{};
    }

    public static void registerClub(Club club) {
        for (int i = 0; i < listOfClubs.length; i++) {
            if (listOfClubs[i] == null) {
                listOfClubs[i] = club;
                break;
            }
        }
    }

    public static void leagueTable() {
        for (int i = 0; i < listOfClubs.length; i++) {
            int min = 100000;
            int max = 999999;
            listOfClubs[i].ID = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(listOfClubs[i].getName() + " - ID: " + listOfClubs[i].ID);
        }
    }

    public static void addPlayer(Player player) {
        listOfPlayers = Arrays.copyOf(listOfPlayers,listOfPlayers.length + 1);
        for (int i = 0; i < listOfPlayers.length; i++) {
            if (listOfPlayers[i] == null) {
                listOfPlayers[i] = player;
                break;
            }
        }
    }

    public static void addToStaffList(Staff member) {
        staffList = Arrays.copyOf(staffList,staffList.length + 1);
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i] == null) {
                staffList[i] = member;
                break;
            }
        }
    }

    public static void printStaff() {
        for (int i = 0; i < staffList.length; i++) {
            System.out.println(staffList[i].getName());
        }
    }

    public static void sortStaffByAge(int age) {
        boolean found = false;
        for (int i = 0; i < staffList.length; i++) {
            if (staffList[i].getAge() == age) {
                found = true;
                System.out.println(staffList[i].getName());
            }
        }
        if (found) {
            return;
        } else {
            System.err.println("There is no staff member that old");
        }
    }

    public void sortPlayerByPosition(String position) {
        for (int i = 0; i < listOfPlayers.length; i++) {
            if (listOfPlayers[i].getPosition().equals(position)) {
                System.out.println(listOfPlayers[i].getName());
            }
        }
    }

    public void sortPlayerByShirtNumber(int number) {
        for (int i = 0; i < listOfPlayers.length; i++) {
            if (listOfPlayers[i].getShirtNumber() == number) {
                System.out.println(listOfPlayers[i].getName());
                break;
            } else if (i == listOfPlayers.length - 1 && listOfPlayers[i].getShirtNumber() != number) {
                System.err.println("There is no player with that number");
            }
        }
    }
}

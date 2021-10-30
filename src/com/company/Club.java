package com.company;

import java.util.Arrays;

public class Club {
    private String name;
    private int yearOfFoundation;
    public Player[] players;
    public President president;
    public Coach[] coaches;
    public int ID;
    public Kit[] kits;
    public Staff[] staff;
    private boolean tittleWon;

    public Club(String name, int yearOfFoundation, President president) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.president = president;
        this.players = new Player[]{};
        this.coaches = new Coach[]{};
        this.staff = new Staff[]{};
        this.ID = setID();
        this.kits = new Kit[3];
        addStaff(president);
        League.addToStaffList(president);
    }

    public String getName() {
        return name;
    }

    public void signPlayer(Player player) {
        this.players = Arrays.copyOf(players, players.length + 1);
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                League.addPlayer(player);
                addStaff(player);
                League.addToStaffList(player);
                break;
            }
        }
    }

    public void hireCoach(Coach coach) {
        coaches = Arrays.copyOf(coaches, coaches.length + 1);
        for (int i = 0; i < coaches.length; i++) {
            if (coaches[i] == null) {
                coaches[i] = coach;
                addStaff(coach);
                League.addToStaffList(coach);
                break;
            }
        }
    }

    public void firePlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getName().equals(player.getName())) {
                players[i] = null;
                break;
            }
        }
    }

    public void lineUp() {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].getName() + " " + players[i].getShirtNumber());
        }
    }

    public void printStaff() {
        for (int i = 0; i < staff.length; i++) {
            System.out.println(staff[i].getName());
        }
    }

    public void printClub() {
        System.out.println(this.name);
        System.out.println("Founded in the year of " + this.yearOfFoundation);
        System.out.println(name + "'s president is " + president.getName());
        System.out.println(name + "'s ID is " + ID);
        if (players[0] != null) {
            System.out.println("Here's " + name + "'s the squad list:");
            lineUp();
        }
        if (kits[0] != null) {
            System.out.println(" ");
            firstKit();
            secondKit();
            thirdKit();
        }
    }
    public int setID() {
        int min = 100000;
        int max = 999999;
        ID = (int) (Math.random() * (max - min + 1) + min);
        return ID;
    }

    public void newKit(Kit kit) {
        for (int i = 0; i < kits.length; i++) {
            if (kits[i] == null) {
                kits[i] = kit;
                break;
            }
        }
    }

    public void firstKit() {
        System.out.println(this.name + "'s 1st kit is manufactured by " + kits[0].brand + " and is " + kits[0].color);
    }

    public void secondKit() {
        System.out.println(this.name + "'s 2nd kit is manufactured by " + kits[1].brand + " and is " + kits[1].color);
    }

    public void thirdKit() {
        System.out.println(this.name + "'s 3rd kit is manufactured by " + kits[2].brand + " and is " + kits[2].color);
    }

    public void sortPlayerByPosition(String position) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getPosition().equals(position)) {
                System.out.println(players[i].getName());
            }
        }
    }

    public void sortPlayerByShirtNumber(int number) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getShirtNumber() == number) {
                System.out.println(players[i].getName());
                break;
            } else if (i == players.length - 1 && players[i].getShirtNumber() != number) {
                System.err.println("There is no player with that number");
            }
        }
    }

    public void addStaff(Staff member) {
        this.staff = Arrays.copyOf(staff, staff.length + 1);
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] == null) {
                staff[i] = member;
                break;
            }
        }
    }

    public void winLeagueTittle() {
        tittleWon = true;
    }

    public void bonus() {
        if (tittleWon) {
            for (int i = 0; i < staff.length; i++) {
                if (staff[i] instanceof President) {
                    staff[i].getBonus();
                } else if (staff[i] instanceof Coach) {
                    staff[i].getBonus();
                } else if (staff[i] instanceof Player) {
                    staff[i].getBonus();
                }
            }
        } else {
            for (int i = 0; i < staff.length; i++) {
                staff[i].getSalary();
            }
        }
    }
}

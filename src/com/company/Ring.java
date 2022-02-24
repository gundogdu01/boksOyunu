package com.company;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double start;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight, double start) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        if (this.start >= 0 && this.start <=20){
            this.start = start;
        }else {
            this.start=0;
        }
    }

    void run(){
        if (checkWeight()){
            while (f1.health > 0 && f2.health >0){
                System.out.println();
                System.out.println();
                System.out.println("********YENİ RAUND********");
                if (isStart()) {
                    System.out.println( this.f1.name + " oyuna başladı");;
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    System.out.println( this.f2.name + " oyuna başladı");;
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }

                System.out.println(this.f1.name+" Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+" Sağlık: "+this.f2.health);
                /*f2.health = f1.hit(f2);
                if (isWin())
                    break;

                f1.health = f2.hit(f1);
                if (isWin())
                    break;

                printScore();*/
            }
        }else
            System.out.println("Sporcuların kilo kategorisi uyuşmuyor.!");
    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (f1.health == 0){
            System.out.println("Maçı kazanan : " + this.f2.name);
            return true;
        }
        if (f2.health == 0){
            System.out.println("Maçı kazanan : " + this.f1.name);
            return true;
        }
        return false;
    }

    boolean isStart() {
        double rndm = Math.random()*20;
        return rndm >= this.start;

    }

    void printScore(){
        System.out.println("**************");
        System.out.println(this.f1.name + " Kalan can : " + this.f1.health);
        System.out.println(this.f2.name + " Kalan can : " + this.f2.health);
    }
}

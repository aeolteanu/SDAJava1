package oop.concurrency;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Taking a seat");
            availableSeats--;
            System.out.println("Free seats left " + availableSeats);
        } else {
            System.out.println("No available seats");
        }
    }
    public void printSynchronizedBlock(){
        synchronized (this){
            System.out.println("In synced block");
        }
        System.out.println("Not synchronized code");
    }
}
//tema pag 86 i/0 si 102 concurrency
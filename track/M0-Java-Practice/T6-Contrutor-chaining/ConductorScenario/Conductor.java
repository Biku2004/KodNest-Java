

class Conductor {

    // collect money
    void collect(Money m) {
        System.out.println("Money collected by conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}


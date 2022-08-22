package HW_17_1;

public abstract class abstractFarm {
    private String ownerName;
    private Cow[] cows;
    private String address;
    private Sheep[] sheep;
    private Horse[] horses;
    static int counter = 1;

    public abstractFarm(String ownerName, String address, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.ownerName = ownerName;
        this.cows = cows;
        this.address = address;
        this.sheep = sheep;
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public String getAddress() {
        return address;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void getInformation(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~"+ownerName+"'s FARM-"+counter+"~~~~~~~~~~~~~~~~~~~~");
        counter++;
        System.out.println("Address: "+ address);
        System.out.println("~~~~~~~~~~~~~~COWS~~~~~~~~~~~~~~");
        for (int i = 0; i < cows.length; i++) {
            System.out.println(cows[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~HORSE~~~~~~~~~~~~~~~~");
        for (int i = 0; i < horses.length; i++) {
            System.out.println(horses[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~SHEEP~~~~~~~~~~~~~~");
        for (int i = 0; i < sheep.length; i++) {
            System.out.println(sheep[i]);
        }

    }

}

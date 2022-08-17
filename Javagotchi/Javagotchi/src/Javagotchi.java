public class Javagotchi {
    private String name;
    private String gender;
    private int age;
    private int hunger;
    private int energy;
    private int mood;
    private Status status;
    private int eCh;
    private int hCh;
    private int mCh;
    private int w;

    public Javagotchi() {
        this.name = name;
        this.gender = gender;
        this.age = 0;
        this.hunger = 50;
        this.energy = 50;
        this.mood = (int) Math.floor(Math.random() * 100 + 1);
        this.status = Status.UNHAPPY;
    }

    public void update(double dt) {
        age += dt;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge() {
        this.age = age + 5;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger() {
        hCh = (int) Math.floor(Math.random() * 6 + 1);
        if (hunger <= 100 && hunger >= 0) {
            this.hunger = hunger + hCh;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy() {
        eCh = (int) Math.floor(Math.random() * 6 + 1);
        if (energy <= 100 && energy >= 0) {
            this.energy = energy + eCh;
        }
    }

    public int getMood() {
        return mood;
    }

    public void setMood() {
        mCh = (int) Math.floor(Math.random()-3)*2;
        if (mood <= 100 && mood >= 0) {
            this.mood = mood + mCh;
        }
    }
}

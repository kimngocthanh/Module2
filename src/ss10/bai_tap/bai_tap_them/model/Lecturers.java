package ss10.bai_tap.bai_tap_them.model;

public class Lecturers extends Person {
    private int level;

    public Lecturers() {
    }

    public Lecturers(int id, String name, String date, String gender, int level) {
        super(id, name, date, gender);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Lecturers{" +
                "id: " + getId() +
                "name: " + getName() +
                "date: " + getDate() +
                "gender:" + getGender() +
                "level=" + level +
                '}';
    }
}

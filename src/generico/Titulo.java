package generico;

public class Titulo implements Comparable<Titulo> {
    private String name;

    public Titulo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Titulo outroTitutlo) {
        return this.getName().compareTo(outroTitutlo.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}

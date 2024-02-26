package net.guides.springboot2.springboot2jpacrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "number_options")
public class NumberOptions {
    private long id;
    private int minC;
    private int maxC;
    private int nb;
    private int noRepeat;
    private int sort;

    public NumberOptions(){}

    public NumberOptions(int min, int max, int nb, int noRepeat, int sort) {
        this.minC = min;
        this.maxC = max;
        this.nb = nb;
        this.noRepeat = noRepeat;
        this.sort = sort;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "minC", nullable = false)
    public int getMin() {
        return minC;
    }
    public void setMin(int min) {
        this.minC = min;
    }

    @Column(name = "maxC", nullable = false)
    public int getMax() {
        return maxC;
    }
    public void setMax(int max) {
        this.maxC = max;
    }

    @Column(name = "nb", nullable = false)
    public int getNb() {
        return nb;
    }
    public void setNb(int nb) {
        this.nb = nb;
    }

    @Column(name = "noRepeat", nullable = false)
    public int getNoRepeat() {
        return noRepeat;
    }
    public void setNoRepeat(int noRepeat) {
        this.noRepeat = noRepeat;
    }

    @Column(name = "sort", nullable = false)
    public int getSort() {
        return sort;
    }
    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Number option [id=" + id + ", min=" + minC + ", max=" + maxC + ", nb=" + nb + ", noRepeat=" + noRepeat + ", sort=" + sort + "]";
    }
}
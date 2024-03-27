package net.guides.springboot2.springboot2jpacrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "number_options")
public class NumberOptions {
    private long id;
    private int minC;
    private int maxC;
    private int nb;
    private boolean noRepeat;
    private boolean sort;

    public NumberOptions(){}

    public NumberOptions(int min, int max, int nb, boolean noRepeat, boolean sort) {
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
    public boolean getNoRepeat() {
        return noRepeat;
    }
    public void setNoRepeat(boolean noRepeat) {
        this.noRepeat = noRepeat;
    }

    @Column(name = "sort", nullable = false)
    public boolean getSort() {
        return sort;
    }
    public void setSort(boolean sort) {
        this.sort = sort;
    }
}
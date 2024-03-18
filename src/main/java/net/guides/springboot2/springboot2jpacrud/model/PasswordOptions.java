package net.guides.springboot2.springboot2jpacrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "password_options")
public class PasswordOptions {
    private long id;
    private int noRepeat;
    private int lengthC;
    private int useDigits;
    private int useSpecChars;
    private int onlyDigits;
    private int onlyHexa;

    public PasswordOptions(){}

    public PasswordOptions(int noRepeat, int lengthC, int useDigits, int useSpecChars, int onlyDigits, int onlyHexa) {
        this.noRepeat = noRepeat;
        this.lengthC = lengthC;
        this.useDigits = useDigits;
        this.useSpecChars = useSpecChars;
        this.onlyDigits = onlyDigits;
        this.onlyHexa = onlyHexa;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "noRepeat", nullable = false)
    public int getNoRepeat() {
        return noRepeat;
    }
    public void setNoRepeat(int noRepeat) {
        this.noRepeat = noRepeat;
    }

    @Column(name = "lengthC", nullable = false)
    public int getLengthC() {
        return lengthC;
    }
    public void setLengthC(int lengthC) {
        this.lengthC = lengthC;
    }

    @Column(name = "useDigits", nullable = false)
    public int getUseDigits() {
        return useDigits;
    }
    public void setUseDigits(int useDigits) {
        this.useDigits = useDigits;
    }

    @Column(name = "useSpecChars", nullable = false)
    public int getUseSpecChars() {
        return useSpecChars;
    }
    public void setUseSpecChars(int useSpecChars) {
        this.useSpecChars = useSpecChars;
    }

    @Column(name = "onlyDigits", nullable = false)
    public int getOnlyDigits() {
        return onlyDigits;
    }
    public void setOnlyDigits(int onlyDigits) {
        this.onlyDigits = onlyDigits;
    }
    
    @Column(name = "onlyHexa", nullable = false)
    public int getOnlyHexa() {
        return onlyHexa;
    }
    public void setOnlyHexa(int onlyHexa) {
        this.onlyHexa = onlyHexa;
    }
}
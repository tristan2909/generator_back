package net.guides.springboot2.springboot2jpacrud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "password_options")
public class PasswordOptions {
    private long id;
    private boolean noRepeat;
    private int lengthC;
    private boolean useDigits;
    private boolean useSpecChars;
    private boolean onlyDigits;
    private boolean onlyHexa;

    public PasswordOptions(){}

    public PasswordOptions(boolean noRepeat, int lengthC, boolean useDigits, boolean useSpecChars, boolean onlyDigits, boolean onlyHexa) {
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
    public boolean getNoRepeat() {
        return noRepeat;
    }
    public void setNoRepeat(boolean noRepeat) {
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
    public boolean getUseDigits() {
        return useDigits;
    }
    public void setUseDigits(boolean useDigits) {
        this.useDigits = useDigits;
    }

    @Column(name = "useSpecChars", nullable = false)
    public boolean getUseSpecChars() {
        return useSpecChars;
    }
    public void setUseSpecChars(boolean useSpecChars) {
        this.useSpecChars = useSpecChars;
    }

    @Column(name = "onlyDigits", nullable = false)
    public boolean getOnlyDigits() {
        return onlyDigits;
    }
    public void setOnlyDigits(boolean onlyDigits) {
        this.onlyDigits = onlyDigits;
    }
    
    @Column(name = "onlyHexa", nullable = false)
    public boolean getOnlyHexa() {
        return onlyHexa;
    }
    public void setOnlyHexa(boolean onlyHexa) {
        this.onlyHexa = onlyHexa;
    }
}
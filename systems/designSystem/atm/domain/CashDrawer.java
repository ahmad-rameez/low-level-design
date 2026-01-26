package designSystem.atm.domain;

import java.util.Map;

public class CashDrawer {

    private String atmId;
    private Map<Denomination, Integer> notesByDenomination;

    public CashDrawer(String atmId, Map<Denomination, Integer> notesByDenomination) {
        this.atmId = atmId;
        this.notesByDenomination = notesByDenomination;
    }

    public String getAtmId() {
        return atmId;
    }

    public void setAtmId(String atmId) {
        this.atmId = atmId;
    }

    public Map<Denomination, Integer> getNotesByDenomination() {
        return notesByDenomination;
    }

    public void setNotesByDenomination(Map<Denomination, Integer> notesByDenomination) {
        this.notesByDenomination = notesByDenomination;
    }
}

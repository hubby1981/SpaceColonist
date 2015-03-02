package com.bitworx.spacecolonist.engine.bank;

import java.util.List;

/**
 * Created by Marcel on 01.03.2015.
 */
public class BankAccount extends BaseCreditsStore {
   private List<BankSlot> _bankSlots;

    public List<BankSlot> getBankSlots()
    {
        return _bankSlots;
    }

}

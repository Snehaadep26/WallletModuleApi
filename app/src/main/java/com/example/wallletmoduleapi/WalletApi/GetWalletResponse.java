package com.example.wallletmoduleapi.WalletApi;

import java.util.ArrayList;

public class GetWalletResponse {
    public TotalLinksRequested totalLinksRequested;
    public TotalLinksPending totalLinksPending;
    public TotalLinksPaid totalLinksPaid;
    public TotalLinksSettled totalLinksSettled;
    public TotalLinksOverDue totalLinksOverDue;
    public TotalRefunded totalRefunded;
    public TotalLinksCancelled totalLinksCancelled;
    public TotalLinksViewed totalLinksViewed;
    public ArrayList<PendingTransaction> pendingTransactions;
    public ArrayList<PaidTransaction> paidTransactions;
    public boolean validGst;

    public GetWalletResponse(TotalLinksRequested totalLinksRequested, TotalLinksPending totalLinksPending, TotalLinksPaid totalLinksPaid, TotalLinksSettled totalLinksSettled, TotalLinksOverDue totalLinksOverDue, TotalRefunded totalRefunded, TotalLinksCancelled totalLinksCancelled, TotalLinksViewed totalLinksViewed, ArrayList<PendingTransaction> pendingTransactions, ArrayList<PaidTransaction> paidTransactions, boolean validGst) {
        this.totalLinksRequested = totalLinksRequested;
        this.totalLinksPending = totalLinksPending;
        this.totalLinksPaid = totalLinksPaid;
        this.totalLinksSettled = totalLinksSettled;
        this.totalLinksOverDue = totalLinksOverDue;
        this.totalRefunded = totalRefunded;
        this.totalLinksCancelled = totalLinksCancelled;
        this.totalLinksViewed = totalLinksViewed;
        this.pendingTransactions = pendingTransactions;
        this.paidTransactions = paidTransactions;
        this.validGst = validGst;
    }

    public TotalLinksRequested getTotalLinksRequested() {
        return totalLinksRequested;
    }

    public TotalLinksPending getTotalLinksPending() {
        return totalLinksPending;
    }

    public TotalLinksPaid getTotalLinksPaid() {
        return totalLinksPaid;
    }

    public TotalLinksSettled getTotalLinksSettled() {
        return totalLinksSettled;
    }

    public TotalLinksOverDue getTotalLinksOverDue() {
        return totalLinksOverDue;
    }

    public TotalRefunded getTotalRefunded() {
        return totalRefunded;
    }

    public TotalLinksCancelled getTotalLinksCancelled() {
        return totalLinksCancelled;
    }

    public TotalLinksViewed getTotalLinksViewed() {
        return totalLinksViewed;
    }

    public ArrayList<PendingTransaction> getPendingTransactions() {
        return pendingTransactions;
    }

    public ArrayList<PaidTransaction> getPaidTransactions() {
        return paidTransactions;
    }

    public boolean isValidGst() {
        return validGst;
    }
}


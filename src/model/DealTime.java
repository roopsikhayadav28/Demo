package model;

import java.util.Date;

public class DealTime {
    Date startdate;
    Date endDate;

    public DealTime(Date startdate, Date endDate) {
        this.startdate = startdate;
        this.endDate = endDate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Date getEndDate() {
        return endDate;
    }
}

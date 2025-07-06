
package db;

import java.time.LocalDate;

public class SGdutyroster {
    private Integer id;
    private String staffId;          
    private Integer rosterTypeId;    
    private LocalDate date;          

   
    public Integer getId() {
        return id;
    }

    public String getStaffId() {
        return staffId;
    }

    public Integer getRosterTypeId() {
        return rosterTypeId;
    }

    public LocalDate getDate() {
        return date;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public void setRosterTypeId(Integer rosterTypeId) {
        this.rosterTypeId = rosterTypeId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.time.LocalTime;


public class SGRosterType {
    

    private Integer id;
    private String shift;  // Stores "AM" or "PM"
    private String shiftCode;
    private LocalTime startTime;
    private LocalTime endTime;
    private String description;
    private String remark;

    // Getter methods
    public Integer getId() {
        return id;
    }

    public String getShift() {
        return shift;
    }

    public String getShiftCode() {
        return shiftCode;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public String getRemark() {
        return remark;
    }

    // Setter methods
    public void setId(Integer id) {
        this.id = id;
    }

    public void setShift(String shift) {
        if("AM".equals(shift) || "PM".equals(shift)) {
            this.shift = shift;
        } else {
            throw new IllegalArgumentException("Shift must be 'AM' or 'PM'");
        }
    }

    public void setShiftCode(String shiftCode) {
        this.shiftCode = shiftCode;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

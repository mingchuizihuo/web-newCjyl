package com.idea.cjyl.totalmodule.web.domain.vo;

import com.idea.cjyl.totalmodule.web.domain.pojo.*;
import com.idea.cjyl.totalmodule.web.globals.AnalysisConstant;

import java.util.List;

/**
 * Created by Administrator on 2016/12/6.
 */
public class OlderBriefVO {

    private Long id;//id
    private String name;//老人姓名
    private String checkInDate;//入住时间
    private StaffVO staff;//员工信息
    private Mansion mansion;//楼信息
    private Room room;//房间信息
    private Bed bed;//床信息
    private List<CheckInInitCost> checkInInitCostList;//入住初始费用
    private MonthCharge monthCharge;//月收费
    private Long nation;//民族id
    private String nationStr;//民族名
    private String birthday;//出生日期
    private Long takeCareOfOneself;//自理情况id
    private String takeCareOfOneselfStr;//自理情况ming
    private String cardId;//身份证号
    private byte olderState;//状态id
    private String olderStateStr;//状态名
    private String olderLeaveDate;//出院日期




    public void data2String(List<DataDictionary> dataDictionaryList){
        for (DataDictionary dataDictionary: dataDictionaryList
                ) {
            if(dataDictionary.getId()==this.getNation()){
                this.nationStr = dataDictionary.getDataName();
            }else if(dataDictionary.getId() == this.getTakeCareOfOneself()){
                this.takeCareOfOneselfStr = dataDictionary.getDataName();
            }else if(this.getOlderState() == 1 ){
                this.olderStateStr ="在院";
            }else if(this.getOlderState() == 2 ){
                this.olderStateStr ="出院";
            }
        }

    }
    @Override
    public String toString() {
        return "OlderBriefVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", checkInDate='" + checkInDate + '\'' +
                ", staff=" + staff +
                ", mansion=" + mansion +
                ", room=" + room +
                ", bed=" + bed +
                ", checkInInitCostList=" + checkInInitCostList +
                ", monthCharge=" + monthCharge +
                ", nation=" + nation +
                ", nationStr='" + nationStr + '\'' +
                ", birthday='" + birthday + '\'' +
                ", takeCareOfOneself=" + takeCareOfOneself +
                ", takeCareOfOneselfStr='" + takeCareOfOneselfStr + '\'' +
                ", cardId='" + cardId + '\'' +
                ", olderState=" + olderState +
                ", olderStateStr='" + olderStateStr + '\'' +
                ", olderLeaveDate='" + olderLeaveDate + '\'' +
                '}';
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public StaffVO getStaff() {
        return staff;
    }

    public void setStaff(StaffVO staff) {
        this.staff = staff;
    }

    public Mansion getMansion() {
        return mansion;
    }

    public void setMansion(Mansion mansion) {
        this.mansion = mansion;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public List<CheckInInitCost> getCheckInInitCostList() {
        return checkInInitCostList;
    }

    public void setCheckInInitCostList(List<CheckInInitCost> checkInInitCostList) {
        this.checkInInitCostList = checkInInitCostList;
    }

    public MonthCharge getMonthCharge() {
        return monthCharge;
    }

    public void setMonthCharge(MonthCharge monthCharge) {
        this.monthCharge = monthCharge;
    }

    public Long getNation() {
        return nation;
    }

    public void setNation(Long nation) {
        this.nation = nation;
    }

    public String getNationStr() {
        return nationStr;
    }

    public void setNationStr(String nationStr) {
        this.nationStr = nationStr;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Long getTakeCareOfOneself() {
        return takeCareOfOneself;
    }

    public void setTakeCareOfOneself(Long takeCareOfOneself) {
        this.takeCareOfOneself = takeCareOfOneself;
    }

    public String getTakeCareOfOneselfStr() {
        return takeCareOfOneselfStr;
    }

    public void setTakeCareOfOneselfStr(String takeCareOfOneselfStr) {
        this.takeCareOfOneselfStr = takeCareOfOneselfStr;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public byte getOlderState() {
        return olderState;
    }

    public void setOlderState(byte olderState) {
        this.olderState = olderState;
    }

    public String getOlderStateStr() {
        return olderStateStr;
    }

    public void setOlderStateStr(String olderStateStr) {
        this.olderStateStr = olderStateStr;
    }

    public String getOlderLeaveDate() {
        return olderLeaveDate;
    }

    public void setOlderLeaveDate(String olderLeaveDate) {
        this.olderLeaveDate = olderLeaveDate;
    }
}

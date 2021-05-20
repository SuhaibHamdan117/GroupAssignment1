package edu.cs.birzeit.groupassignment1;

public class majors {

    private String major1;
    private String major2;
    private String major3;
    private String average;

    public majors(){

    }
    public majors(String major1, String major2, String major3, String average) {
        this.major1 = major1;
        this.major2 = major2;
        this.major3 = major3;
        this.average = average;
    }

    public String getMajor1() {
        return major1;
    }

    public void setMajor1(String major1) {
        this.major1 = major1;
    }

    public String getMajor2() {
        return major2;
    }

    public void setMajor2(String major2) {
        this.major2 = major2;
    }

    public String getMajor3() {
        return major3;
    }

    public void setMajor3(String major3) {
        this.major3 = major3;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }
}

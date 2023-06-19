package com.faintdream.spring6.jdbc.pojo;

public class RolePhysique {

    private String no;
    private String physique;
    private String physiqueC;

    public RolePhysique(String no, String physique, String physiqueC) {
        this.no = no;
        this.physique = physique;
        this.physiqueC = physiqueC;
    }

    public RolePhysique() {
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    public String getPhysiqueC() {
        return physiqueC;
    }

    public void setPhysiqueC(String physiqueC) {
        this.physiqueC = physiqueC;
    }

    @Override
    public String toString() {
        return "RolePhysique{" +
                "no='" + no + '\'' +
                ", physique='" + physique + '\'' +
                ", physiqueC='" + physiqueC + '\'' +
                '}';
    }
}

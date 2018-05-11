package com.jnshu.modle;

/**
 * @program: SSM_Tiles
 * @description: 职业实体类
 * @author: Mr.xweiba
 * @create: 2018-05-10 23:45
 **/

public class Profession {
    private Long id;
    private String proName;
    private String proIntroduction;
    private String proCompany;
    private Long create_at;
    private Long update_at;

    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", proIntroduction='" + proIntroduction + '\'' +
                ", proCompany='" + proCompany + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProIntroduction() {
        return proIntroduction;
    }

    public void setProIntroduction(String proIntroduction) {
        this.proIntroduction = proIntroduction;
    }

    public String getProCompany() {
        return proCompany;
    }

    public void setProCompany(String proCompany) {
        this.proCompany = proCompany;
    }

    public Long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Long create_at) {
        this.create_at = create_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }
}

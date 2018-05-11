package com.jnshu.modle;

/**
 * @program: SSM_Tiles
 * @description: 学员实体类
 * @author: Mr.xweiba
 * @create: 2018-05-10 23:41
 **/

public class Student {
    private Long id;
    private String stuName;
    private String stuIntroduction;
    private byte isWork;
    private byte isSuper;
    private String stuProfession;
    private Long create_at;
    private Long update_at;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuIntroduction='" + stuIntroduction + '\'' +
                ", isWork=" + isWork +
                ", isSuper=" + isSuper +
                ", stuProfession='" + stuProfession + '\'' +
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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuIntroduction() {
        return stuIntroduction;
    }

    public void setStuIntroduction(String stuIntroduction) {
        this.stuIntroduction = stuIntroduction;
    }

    public byte getIsWork() {
        return isWork;
    }

    public void setIsWork(byte isWork) {
        this.isWork = isWork;
    }

    public byte getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(byte isSuper) {
        this.isSuper = isSuper;
    }

    public String getStuProfession() {
        return stuProfession;
    }

    public void setStuProfession(String stuProfession) {
        this.stuProfession = stuProfession;
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

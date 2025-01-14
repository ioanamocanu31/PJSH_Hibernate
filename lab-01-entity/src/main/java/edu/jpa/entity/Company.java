package edu.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "Company")
@SecondaryTable(
        name = "CompanyDetail",
        pkJoinColumns = {
        @PrimaryKeyJoinColumn(
                name = "Company_id",
                referencedColumnName = "Company_id")
        })
public class Company {
    @Column(name="Company_id", table="Company")
    @Id
    private Integer id;

    @Column(name="Company_name", table="Company")
    private String name;

    @Column(name="CompanyDetail_address", table="CompanyDetail")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

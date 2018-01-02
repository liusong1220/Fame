package com.zbw.fame.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * BaseModel类
 *
 * @author zbw
 * @create 2017/7/5 23:59
 */
public class BaseEntity {

    @ApiModelProperty(value = "Entity id", name = "id", example = "1")
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

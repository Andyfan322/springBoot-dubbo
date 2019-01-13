package com.dubbo.rpc.rpc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author andyFan
 * @since 2019年01月13日
 */
@Data
public class User implements Serializable {

    private String name;

    private Integer age;
}

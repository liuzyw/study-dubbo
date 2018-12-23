package com.study.dubbo.api.dto;

import java.io.Serializable;
import lombok.Data;

/**
 * Created on 2018-12-17
 *
 * @author liuzhaoyuan
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

}

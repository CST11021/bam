package com.bam.model;

import lombok.Data;

import java.util.List;

/**
 * @Author 盖伦
 * @Date 2024/2/20
 */
@Data
public class Menu {

    private String code;
    private String name;
    private String uri;
    private List<Menu> childMenus;

}

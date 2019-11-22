package com.dimple.project.blog.domain;

import com.dimple.framework.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: Tag
 * @description:
 * @author: Dimple
 * @date: 11/22/19
 */
@Data
@NoArgsConstructor
//序列化Json的时候,如果是Null则忽略
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag extends BaseEntity {
    private Long id;
    /**
     * 标签颜色
     */
    private String color;
    /**
     * 标签名
     */
    private String title;
    /**
     * 关联Blog数量
     */
    private Long count;

    public Tag(String title, String color, Long count) {
        this.color = color;
        this.title = title;
        this.count = count;
    }
}

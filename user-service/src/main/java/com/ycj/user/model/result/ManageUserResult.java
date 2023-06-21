package com.ycj.user.model.result;

import lombok.Data;

@Data
public class ManageUserResult {

    private Integer id;

    private String manageName;

    private String mobile;

    private String status;

    private String token;

    private Integer parentId;
}

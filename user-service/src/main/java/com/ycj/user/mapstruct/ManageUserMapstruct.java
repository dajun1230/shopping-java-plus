package com.ycj.user.mapstruct;

import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;
import com.ycj.user.repository.entity.ManageUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ManageUserMapstruct {

    ManageUserMapstruct INSTANCE = Mappers.getMapper(ManageUserMapstruct.class);

    ManageUser toManageUser(ManageUserRequest manageUserRequest);

    ManageUserResult toManageUserResult(ManageUser manageUser);

    List<ManageUserResult> toManageUserRequestList(List<ManageUser> manageUser);

}

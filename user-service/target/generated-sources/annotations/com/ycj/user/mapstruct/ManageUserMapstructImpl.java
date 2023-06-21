package com.ycj.user.mapstruct;

import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;
import com.ycj.user.repository.entity.ManageUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-20T08:05:25+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_361 (Oracle Corporation)"
)
public class ManageUserMapstructImpl implements ManageUserMapstruct {

    @Override
    public ManageUser toManageUser(ManageUserRequest manageUserRequest) {
        if ( manageUserRequest == null ) {
            return null;
        }

        ManageUser manageUser = new ManageUser();

        manageUser.setManageName( manageUserRequest.getManageName() );
        manageUser.setPassword( manageUserRequest.getPassword() );
        manageUser.setMobile( manageUserRequest.getMobile() );
        manageUser.setParentId( manageUserRequest.getParentId() );
        manageUser.setStatus( manageUserRequest.getStatus() );
        manageUser.setLoginTime( manageUserRequest.getLoginTime() );
        manageUser.setCreateTime( manageUserRequest.getCreateTime() );
        manageUser.setRequestId( manageUserRequest.getRequestId() );

        return manageUser;
    }

    @Override
    public ManageUserResult toManageUserResult(ManageUser manageUser) {
        if ( manageUser == null ) {
            return null;
        }

        ManageUserResult manageUserResult = new ManageUserResult();

        manageUserResult.setId( manageUser.getId() );
        manageUserResult.setManageName( manageUser.getManageName() );
        manageUserResult.setMobile( manageUser.getMobile() );
        manageUserResult.setStatus( manageUser.getStatus() );
        manageUserResult.setParentId( manageUser.getParentId() );

        return manageUserResult;
    }

    @Override
    public List<ManageUserResult> toManageUserRequestList(List<ManageUser> manageUser) {
        if ( manageUser == null ) {
            return null;
        }

        List<ManageUserResult> list = new ArrayList<ManageUserResult>( manageUser.size() );
        for ( ManageUser manageUser1 : manageUser ) {
            list.add( toManageUserResult( manageUser1 ) );
        }

        return list;
    }
}

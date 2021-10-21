package com.edam.security;

import com.edam.mapper.UserMapper;
import com.edam.vo.UserEntity;
import com.edam.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service("userLoginService")
public class UserDetailsServiceCustom implements UserDetailsService {

    @Autowired
    private UserMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String inputUserId) {

        // 최종적으로 리턴해야할 객체
        UserVO userDetails = new UserVO();

        // 사용자 정보 select
        UserVO userInfo = mapper.selectUserInfoOne(inputUserId);

        // 사용자 정보 없으면 null 처리
        if (userInfo == null) {
            return null;

        // 사용자 정보 있을 경우 로직 전개 (userDetails에 데이터 넣기)
        } else {
            userDetails.setUsername(userInfo.getUsername());
            userDetails.setPassword(userInfo.getPassword());

            // 사용자 권한 select해서 받아온 List<String> 객체 주입
            userDetails.setAuthorities(mapper.selectUserAuthOne(inputUserId));
        }

        return userDetails;
    }
}

package com.project.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.bean.UserBean;
import com.project.service.IUserService;

public class MyRealm extends AuthorizingRealm{
	@Autowired
	private IUserService service;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String name = token.getPrincipal().toString();
		UserBean bean = service.findByName(name);
		AuthenticationInfo info = null;
		if(bean!=null) {
			ByteSource by =ByteSource.Util.bytes(name);
			info = new SimpleAuthenticationInfo(bean.getName(), bean.getPwd(),by,getName());
		}
		return info;
	}

}

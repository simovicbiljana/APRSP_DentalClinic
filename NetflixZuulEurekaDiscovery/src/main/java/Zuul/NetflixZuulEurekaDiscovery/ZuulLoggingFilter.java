package Zuul.NetflixZuulEurekaDiscovery;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ZuulLoggingFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true; //izmena
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre"; //pre after kada da se izvrsi
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;//redosled
	}
	
	

}
